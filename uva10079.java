


import java.util.Scanner;

public class uva10079 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long T;
        while (true) {
            T=sc.nextInt();
            if (T<0) break;
            System.out.printf("%d\n",T*(T+1)/2+1);
        }
    }
}
