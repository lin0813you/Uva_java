/* 
import java.util.*;
class Data{
        int n;
        int r;
        boolean even;
        Data(int n,int r,boolean even){
            this.n=n;
            this.r=r;
            this.even=even;
        }
        compareTo()
    }

public class uva11131_1 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int Case=sc.nextInt();
            int divisor=sc.nextInt();
            if (Case==0 && divisor==0) break;
            Data[] num=new Data[Case];
            for (int i=0;i<Case;i++){
                int input=sc.nextInt();
                num[i]=new Data(input, input%divisor, input%2==0);
            }
            Collections.sort(num);


        }
    }
}
*/