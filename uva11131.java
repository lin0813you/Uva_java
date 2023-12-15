//11321
import java.util.*;
public class uva11131 {
    private static void swap(int[] arr,int now){
        int temp;
        temp=arr[now];
        arr[now]=arr[now+1];
        arr[now+1]=temp;
    }
    private static void sortRemainder(int divisor,int[] num){
        for (int i=0;i<num.length-1;i++){
            for (int j=0;j<num.length-i-1;j++){
                if (compare(num,j,divisor)) swap(num,j);
            }
        }
    }
    private static boolean compare(int[] arr,int now,int divisor){
        int modnum1=arr[now]%divisor;
        int modNum2=arr[now+1]%divisor;

        if (modnum1>modNum2) {
            return true;
        }

        if (arr[now]%2<arr[now+1]%2) {
            return true;
        }

        if (arr[now]%2==1 && arr[now+1]%2==1 && arr[now]<arr[now+1]) {
            return true;
        } 
        if ((arr[now]%2==0 && arr[now+1]%2==0 && arr[now]>arr[now+1])){
            return true;
        }
        return false;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int Case=sc.nextInt();
            int divisor=sc.nextInt();
            if (Case==0 && divisor==0) break;
            System.out.println(Case+" "+divisor);
            int[] num=new int[Case];
            for(int i=0;i<Case;i++){
                int input=sc.nextInt();
                num[i]=input;
            }
            sortRemainder(divisor,num);
            for (int i:num){
                System.out.println(i);
            }
            System.out.println("0 0");
        }
    }
}
