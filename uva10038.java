import java.util.*;

public class uva10038 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int Case=sc.nextInt();
            int[] numArr=new int[Case];
            boolean jolly=true;           
            for (int i=0;i<Case;i++) numArr[i]=sc.nextInt();
            HashSet<Integer> numAbs=new HashSet<>();
            for (int i=0;i<Case-1;i++){
                numAbs.add(Math.abs(numArr[i]-numArr[i+1]));
            }
            for (int i=1;i<Case;i++){
                if (!numAbs.contains(i)) {
                    jolly=false;
                    break;
                }
            }
            if (jolly==true) System.out.println("Jolly");
            else System.out.println("Not jolly");
        }
        sc.close();
    }
}
