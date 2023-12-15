import java.util.*;

public class uva10008{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cases=sc.nextInt();
        sc.nextLine();
        int[] numOfCharacter=new int[26];
        for(int i=0;i<26;i++) numOfCharacter[i]=0;
        while (cases-->0){
            String line=sc.nextLine();            
            for (int i=0;i<line.length();i++){
                Character temp=line.charAt(i);
                if(temp>='A' && temp<='Z') numOfCharacter[temp-'A']+=1;
                else if (temp>='a' && temp<='z') numOfCharacter[temp-'a']+=1;
            }
        }
        int max=0;
        for (int i=0;i<26;i++){
            if (numOfCharacter[i]>max) max=numOfCharacter[i];
        }
        for(int i=max;i>0;i--){
            for(int j=0;j<26;j++){
                if(numOfCharacter[j]==i) System.out.printf("%c %d\n",'A'+j,i);
            }   
        }
    }
}