import java.util.*;

public class uva10035 {
    public static String reverse(String str){
        int L=str.length();
        String temp="";
        for(int i=L-1;i>=0;i--){
            temp+=str.charAt(i);
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A == 0 && B == 0)
                break;
            String numA = ""+A;
            String numB = ""+B;
            numA=reverse(numA);
            numB=reverse(numB);
            int count=0,sum=0;
            for (int i=0;i<Math.max(numA.length(),numB.length());i++){ 
                if (numA.length()>i) sum+=numA.charAt(i)-'0';
                if (numB.length()>i) sum+=numB.charAt(i)-'0';
                if (sum>=10){
                    count++;
                    sum=1;
                }
                else sum=0;
            }
            if (count==0) System.out.println("No carry operation.");
            else if (count==1) System.out.println("1 carry operation.");
            else System.out.println(count+" carry operations.");
        }
        sc.close();
    }
}
