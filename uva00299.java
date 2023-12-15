import java.util.*;

public class uva00299 {
    public static int bubbleSort(int[] arr) {
        int count=0,temp=0;
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    count++;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cases=sc.nextInt();
        while(cases-->0){
            int L=sc.nextInt();
            sc.nextLine();
            String[] tempArr=sc.nextLine().split(" ");
            int[] arr=new int[L];
            for (int i=0;i<arr.length;i++){
                arr[i]=Integer.parseInt(tempArr[i]);
            }
            int count=bubbleSort(arr);
            System.out.printf("Optimal train swapping takes %d swaps.\n",count);
        }
    }
}