

import java.util.Scanner;
//此class可以依序讀入每筆資料，並找出skyline的值並將結果列印出來 
public class uva00105 {
    public static void main(String[] args) {
        int[] skyline=new int[10010];
        Scanner sc=new Scanner(System.in);
        int left,right,high,start=100000,end=0;
        boolean space=false;
        
        while(sc.hasNext()){
            left=sc.nextInt();
            high=sc.nextInt();
            right=sc.nextInt();
            for (int i=left;i<right;i++){ //此迴圈將每筆讀入的資料進行比較，找出每個X座標的最大值，並確認大樓起點與終點
                if (i<start) start=i; //找起點
                if (i>end)  end=i; //找終點                                                     
                if (high>skyline[i]) skyline[i]=high; //找最大值              
            }
        }
        for(int i=start;i<=end;i++){ //此迴圈由起點至終點分別最終結果列印出來
            if (skyline[i-1] != skyline[i]){ //大樓高度出現落差就列印結果
                if (space==true) System.out.print(" ");
                space=true;
                System.out.printf("%d %d",i,skyline[i]);
            }
        }
        System.out.printf(" %d 0%n",end+1);
    sc.close();
    }    
}