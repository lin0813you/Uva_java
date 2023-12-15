


import java.util.Scanner;

public class uva11150 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int colaNum;
        int total=0;
            
        while (sc.hasNextInt()) {
            colaNum=sc.nextInt();
            total=count(colaNum);
            System.out.println(total);
        }
        sc.close();
    }
    public static int count(int N){
        int sum=N;
        while (N>=3){
        sum+=N/3;
            N=N/3+N%3;
        }
        if (N==2) sum+=1;
        return sum;
    } 
}