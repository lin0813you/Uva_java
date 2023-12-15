import java.util.*;

public class uva00948 {
    private static void countFib(List<Integer> fibArr,int num) {
        fibArr.clear();
        fibArr.add(0);
        fibArr.add(1);
        while (fibArr.get(fibArr.size() - 1) < num) {
            fibArr.add(fibArr.get(fibArr.size() - 1) + fibArr.get(fibArr.size() - 2));
        }
    }
    public static void main(String[] args) {
        List<Integer> fibArr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int cases=sc.nextInt();
        while (cases-->0){
            int num=sc.nextInt();
            countFib(fibArr,num);
            String fibBase="";
            for (int i=1;i<fibArr.size()-1;i++){
                if (num==0) break;
                if(num>fibArr.get(fibArr.size()-i)){
                    num-=fibArr.get(fibArr.size()-i);
                    fibBase+="1";
                }
                else fibBase+="0";
            }
            System.out.printf("%d = %s (fib)\n",num,fibBase);
        }
    }   
}
