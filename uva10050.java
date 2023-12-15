import java.util.*;

public class uva10050 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Case=sc.nextInt();
        while (Case-->0){
            int day=sc.nextInt();
            int party=sc.nextInt();
            int[] partyHartalDay=new int[party];
            for (int i=0;i<party;i++) partyHartalDay[i]=sc.nextInt();
            boolean[] hartalDay=new boolean[day+1];
            for (int i=1;i<hartalDay.length;i++) hartalDay[i]=false;
            for (int i=0;i<party;i++){
                for (int j=1;j<hartalDay.length;j++){
                    if (j%partyHartalDay[i]==0) hartalDay[j]=true;
                }
            }
            int countDay=0;
            for (int i=1;i<hartalDay.length;i++){
                if (i%7==6 || i%7==0) hartalDay[i]=false;
                if (hartalDay[i]==true) countDay++;
            }
            System.out.println(countDay);
        }
        sc.close();
    }
}
