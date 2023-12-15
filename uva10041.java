
import java.util.Scanner;
import java.util.Arrays;
/*
此class是用來計算vito到各親戚的距離總和
針對每筆測資能夠輸入親戚數量及具體位置
並將計算結果輸出
*/
public class uva10041 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int t = 0; t < testCase; t++) { //此迴圈處理輸入的每筆測資
            int relativeNum = sc.nextInt();
            int[] streetNum = new int[relativeNum];

            for (int i = 0; i < relativeNum; i++) { //此迴圈讀入每筆測資的親戚詳細資料
                streetNum[i] = sc.nextInt();
            }

            Arrays.sort(streetNum); // 排序位置使其由小到大
            int vito = streetNum[relativeNum / 2]; // 找到中間值

            int sum = 0;
            for (int j = 0; j < relativeNum; j++) { //此迴圈利用絕對值算出距離之總和
                sum += Math.abs(vito - streetNum[j]);
            }
            System.out.println(sum);
        }
    sc.close();
    }
}
