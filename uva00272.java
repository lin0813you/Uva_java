import java.util.*;
public class uva00272 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=1;//why puts count here?
        while (sc.hasNext()){
            String line=sc.nextLine();
            
            for (int i=0;i<line.length();i++){
                if (line.charAt(i)=='"' && count%2 == 1) {
                    System.out.print("``");
                    count++;
                }
                else if (line.charAt(i)=='"' && count%2 == 0){
                    System.out.print("''");
                    count++;
                }
                else System.out.print(line.charAt(i));
            }
            System.out.println("");
        }
    }
}
