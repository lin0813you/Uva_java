
import java.util.*;

//此class會依照每次讀入的資料，判斷這個區域有多少個獨立的油田，並將結果輸出
public class uva00572 {
    //以下區域宣告變數，為方便運算，可視範圍整個class
    char[][] grid;
    boolean[][] visited;
    int m,n;

    //利用bfs method來找出目標地點附近的鄰近油田，採用BFS(廣度優先搜尋算法)來實現
    private void bfs(int startX, int startY, LinkedList<int[]> queue) {
        //此區塊是設定開始檢查位置，並將要檢查的油田位置丟給queue儲存
        int[] start = { startX, startY };
        queue.add(start);
        visited[startX][startY] = true;

        //如果queue還有資料，意味著還有相鄰的油田沒被檢查，將持續檢查直到queue沒有資料為止
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            //列出附近8格的位置變化
            int[] dx = { 1, 1, 1, 0, 0, -1, -1, -1 };
            int[] dy = { 1, 0, -1, 1, -1, 1, 0, -1 };

            //開始檢查油田位置附近8格是否還有油田
            for (int i = 0; i < 8; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                //如果鄰近有油田且還未被檢查過，將把其位置紀錄至queue，並設置此點已檢查過
                if (newX >=0 && newY >= 0 && newX < m && newY < n && !visited[newX][newY] && grid[newX][newY] == '@') {
                    queue.add(new int[]{newX, newY});
                    visited[newX][newY] = true;
                }
            }
        }
    }

    //main主程式，主要負責做資料過濾處理，然後交由bfs method運算，最後列印結果
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            /*以下區塊主要負責讀入資料，此部分新增了一個object main，
            負責儲存油田資訊以及是否被拜訪過*/
            int m = sc.nextInt();
            if (m == 0)
                break;
            int n = sc.nextInt();
            uva00572 main = new uva00572();
            main.m=m;
            main.n=n;
            main.grid = new char[m][n];
            char[][] grid=main.grid;
            main.visited = new boolean[m][n];
            boolean[][] visited=main.visited;
            LinkedList<int[]> queue = new LinkedList<int[]>();
            int countOil=0;

            //此迴圈負責將每行的油田資訊一次正確讀入grid
            for (int x = 0; x < m; x++) {
                String row=sc.next();
                for (int y = 0; y < n; y++) {
                    grid[x][y] = row.charAt(y);
                    visited[x][y] = false;
                }
            }
            
            /*此迴圈將從第一個grid讀到最後一個grid，如果是'*'就把資料交給bfs method
            來進一步篩檢附近油田，如果是'*'就標示為已檢查並繼續。*/    
            for (int x = 0; x < m; x++) {
                for (int y = 0; y < n; y++) {
                    if (visited[x][y])
                        continue;
                    if (grid[x][y] == '@') {
                        main.bfs(x, y, queue);
                        countOil++;
                    } 
                    visited[x][y] = true;
                }
            }
            System.out.println(countOil);
        }
        sc.close();
    }
}