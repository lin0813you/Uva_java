
import java.util.Scanner;

public class uva10055{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long hashNum,enemyNum;
        while (sc.hasNextLine()){
            String line=sc.nextLine();
            String[] arr=line.split(" ");
            hashNum=Long.parseLong(arr[0]);
            enemyNum=Long.parseLong(arr[1]);
            System.out.println(Math.abs(enemyNum-hashNum));
        }
        sc.close();
    }
}
