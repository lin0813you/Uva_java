


import java.util.Scanner;

public class uva10071{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int v,t;
        while (sc.hasNextLine()){
            String line=sc.nextLine();
            String[] arr=line.split(" ");
            v=Integer.parseInt(arr[0]);
            t=Integer.parseInt(arr[1]);
            System.out.println(v*t*2);
        }
    }
}
