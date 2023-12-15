import java.util.*;

public class uva11063 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=0;      
        while (sc.hasNext()){
            int n=sc.nextInt();           
            int[] sequence=new int[n];
            for (int i=0;i<n;i++) sequence[i]=sc.nextInt();
            whileLoop:
            while (true){          
                for(int i=0;i<n-1;i++){
                    if (sequence[i]>=sequence[i+1] || sequence[i]<1){
                        System.out.printf("Case #%d: It is not a B2-Sequence.\n\n",++count);
                        break whileLoop;
                    }
                }
                HashSet<Integer> numSet=new HashSet<>();
                for(int i=0;i<n;i++){
                    for(int j=i;j<n;j++){
                        int sum=sequence[i]+sequence[j];
                        if (numSet.contains(sum)){
                            System.out.printf("Case #%d: It is not a B2-Sequence.\n\n",++count);
                            break whileLoop;
                        }
                        else numSet.add(sum);
                    }
                }
                System.out.printf("Case #%d: It is a B2-Sequence.\n\n",++count);
                break whileLoop;
            }            
        }
    }
}