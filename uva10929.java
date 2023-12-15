import java.util.*;

public class uva10929 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (true) {
                String N=sc.nextLine();        
                if (N.equals("0")) break;
                int NLength=N.length();
                int oddSum=0,evenSum=0,count=1;
                for (int i=NLength-1;i>=0;i--){
                    if (count++%2==1){
                        oddSum+=Integer.parseInt(Character.toString(N.charAt(i)));
                    }
                    else evenSum+=Integer.parseInt(Character.toString(N.charAt(i)));;
                }
                if ((oddSum-evenSum)%11==0) System.out.printf("%s is a multiple of 11.\n",N);
                else System.out.printf("%s is not a multiple of 11.\n",N);
        }
    }
}