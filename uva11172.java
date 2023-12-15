

import java.util.Scanner;

public class uva11172{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,intA,intB;
        String line;
        
        t=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<t;i++){
            line=sc.nextLine();
            String[] arr=line.split(" ");
            intA=Integer.parseInt(arr[0]);
            intB=Integer.parseInt(arr[1]);
            if (intA>intB) System.out.println(">");
            else if (intA==intB) System.out.println("=");
            else System.out.println("<");
        }
        sc.close();
    }
}