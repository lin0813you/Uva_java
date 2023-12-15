import java.util.*;

public class uva00100 {
    public static int computeLength(int value) {
        int count=1;
        while(value!=1){
            if(value%2==0) value/=2;
            else value=3*value+1;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int begin=sc.nextInt();
            int end=sc.nextInt();
            int max=0;
            
            for (int now=Math.min(begin,end);now<=Math.max(begin,end);now++){
                int count=1;
                count=computeLength(now);
                if (count>max) max=count;
            }
            System.out.printf("%d %d %d\n",begin,end,max);
        }
    }
}
