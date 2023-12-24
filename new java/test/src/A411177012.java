import java.util.Scanner;

class Point implements Comparable<Point>{
    int x;
    int y;

    Point(int x,int y) {
        this.x=x;
        this.y=y;
    }

    @Override
    public int compareTo(Point other) {
        return this.x-other.x;
    }
}

public class A411177012 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int Case=sc.nextInt();
            if (Case == 0) break;
            Point[] points=new Point[Case];
            for (int i=0;i<Case;i++) {

            }
        }
    }
}
