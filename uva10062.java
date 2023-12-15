import java.util.*;

public class uva10062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            int[] ascii = new int[128];
            for (int i = 0; i < 128; i++)
                ascii[i] = 0;
            for (int i = 0; i < line.length(); i++) {
                ascii[(int) line.charAt(i)]++;
            }
            int max = 0;
            for (int i = 0; i < 128; i++){
                max = ascii[i] > max ? ascii[i] : max;
            }
            for(int i=1;i<=max;i++){
                for(int j=127;j>=0;j--){
                    if (ascii[j]==i) System.out.printf("%d %d\n",j,i);
                }
            }         
        }
        sc.close();
    }
}
