import java.util.*;

public class uva00490{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[]sentence=new String[101];
        int count=-1,max=-1;
        while (sc.hasNext()){
            sentence[++count]=sc.nextLine();
            if (sentence[count].length()>max) max=sentence[count].length();
        }
        for (int i=0;i<max;i++){
            for(int j=count;j>=0;j--){
                if (sentence[j].length()-1>=i) System.out.print(sentence[j].charAt(i));
                else System.out.print(" ");
                
            }
            System.out.println("");
        }
    }
}
