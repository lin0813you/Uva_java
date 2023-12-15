


import java.util.Scanner;

public class Main {
    public static int f(String n){
        long temp=0;
        if (n.length()>=2){
            for (int i=0;i<n.length();i++){
                String digit=Character.toString(n.charAt(i));
                temp+=Long.parseLong(digit);
            }
            n=Long.toString(temp);
            return f(n);
        }
        else return Integer.parseInt(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n;
        int ans;
        while (true){
            n=sc.nextLine();
            if (n.equals("0")) break;
            ans=f(n);
            System.out.println(ans);
        }
    }
}