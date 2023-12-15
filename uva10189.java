import java.util.*;

public class uva10189 {
    private static void computeNum(int x, int y, char[][] numInfo) {
        numInfo[x][y] = '*';
        int[] dx = { 1, 1, 1, 0, 0, -1, -1, -1 };
        int[] dy = { 1, 0, -1, 1, -1, 1, 0, -1 };
        for (int i = 0; i < 8; i++) {
            if (numInfo[x + dx[i]][y + dy[i]] != '*') {
                numInfo[x + dx[i]][y + dy[i]] += ('1' - '0');
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Case = 0;
        while (true) {
            int row = sc.nextInt();
            int column = sc.nextInt();            
            if (row == 0 && column == 0)
                break;
            sc.nextLine();

            char[][] mineInfo = new char[row + 2][column + 2];
            for (int i = 1; i < row + 1; i++) {
                String temp = sc.nextLine();
                for (int j = 1; j < column + 1; j++) {
                    mineInfo[i][j] = temp.charAt(j-1);
                }
            }

            char[][] numInfo = new char[row + 2][column + 2];
            for (int i = 1; i < row + 1; i++) {
                for (int j = 1; j < column + 1; j++) {
                    numInfo[i][j] = '0';
                }
            }

            for (int i = 1; i < row + 1; i++) {
                for (int j = 1; j < column + 1; j++) {
                    if (mineInfo[i][j] == '*')
                        computeNum(i, j, numInfo);
                }
            }
            System.out.printf("Field #%d:\n", ++Case);
            for (int i = 1; i < row + 1; i++) {
                for (int j = 1; j < column + 1; j++) {
                    System.out.print(numInfo[i][j]);
                }
                System.out.println();
            }
        }
    }
}
