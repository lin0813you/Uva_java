


import java.util.Scanner;

public class uva10783{
    public static void main(String[] args) {
        int cases, begin, end;
        Scanner sc = new Scanner(System.in);
        cases = sc.nextInt();
        
        for (int i = 0; i < cases; i++) {
            begin = sc.nextInt();
            end = sc.nextInt();
            int sum = 0;           
            for (int num = begin; num <= end; num++) {
                if (num % 2 != 0)  sum += num;
            }
            System.out.printf("Case %d: %d\n", i + 1, sum);
        }
    }
}
