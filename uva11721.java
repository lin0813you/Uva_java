

import java.util.Scanner;

public class uva11721{
    public static int[] ToInt(String[] Salary){
        int[] arr=new int[Salary.length];
        for (int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(Salary[i]);
        }
        return arr;
    }
    public static int[] bubbleSort(int[] arr){
        int temp;
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int testCase;
        String line;
        int[] intSalary;
        
        testCase=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<testCase;i++){
            line=sc.nextLine();
            String[] strSalary=line.split(" ");
            intSalary=ToInt(strSalary);
            intSalary=bubbleSort(intSalary);
            System.out.printf("Case %d: %d\n",i+1,intSalary[1]);            
        }
    }
}