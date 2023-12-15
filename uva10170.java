import java.util.*;

public class uva10170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int people = sc.nextInt();
            long day=sc.nextLong();
            long now=0;
            while (now<day){
                now+=people;
                people++;
            }
            System.out.println(--people);
        }
        sc.close();
    }
}
