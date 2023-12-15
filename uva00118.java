
import java.util.Scanner;

//定義Robot class，負責儲存機器人的X,Y座標、方向以及是否遺失的資訊
class Robot {
    int nowX, nowY;
    char toward;
    boolean lost;

    // 此建構元將從主程式中存取機器人的初始資料並進行設初值的動作
    public Robot(int x, int y, char d) {
        nowX = x;
        nowY = y;
        toward = d;
        lost = false;
    }
}

// 定義Scent class，負責記錄整個座標區域位置是否有機器人遺失
class Scent {
    boolean[][] scent;

    // 此建構元從主程式中獲取X、Y的座標資訊並進行設初值的動作
    public Scent(int X, int Y) {
        scent = new boolean[X + 1][Y + 1];
        for (int x = 0; x <= X; x++) {
            for (int y = 0; y <= Y; y++)
                scent[x][y] = false;
        }
    }
}

// 此class將讀入一連串的指令，並輸出機器人最終位置及是否遺失的資料
public class uva00118 {

    // 此副程式將讀入機器人轉向的指令以及機器人目前的方向，然後進行調整並回傳
    public static char get_Orientation(char instruction, char current_toward) {
        char[] orientations = { 'N', 'E', 'S', 'W' };
        int currentIndex = 0;

        // 此迴圈判斷現在的機器人位置
        for (int i = 0; i < 4; i++) {
            if (current_toward == orientations[i]) {
                currentIndex = i;
                break;
            }
        }

        // 以下區域將處理轉向結果並回傳
        if (instruction == 'R')
            currentIndex = (currentIndex + 1) % 4;
        else if (instruction == 'L')
            currentIndex = (currentIndex + 3) % 4;
        return orientations[currentIndex];
    }

    // 此副程式負責移動機器人位置，若移動後遺失則紀錄機器人遺失
    public static void get_Position(Robot robot, Scent scent, int maxX, int maxY) {

        // 以下區域負責移動機器人
        int newX = robot.nowX;
        int newY = robot.nowY;
        if (robot.toward == 'N')
            newY++;
        else if (robot.toward == 'E')
            newX++;
        else if (robot.toward == 'S')
            newY--;
        else if (robot.toward == 'W')
            newX--;

        // 以下區域判斷機器人是否遺失
        if (newX > maxX || newX < 0 || newY > maxY || newY < 0) {
            if (scent.scent[robot.nowX][robot.nowY] == false) {
                robot.lost = true;
                scent.scent[robot.nowX][robot.nowY] = true;

            }
        } else {
            robot.nowX = newX;
            robot.nowY = newY;
        }
    }

    // 此為主程式，將輸入的值進行運算並輸出結果
    public static void main(String[] args) {
        // 以下區域為輸入資料處理
        Scanner sc = new Scanner(System.in);
        int maxX = sc.nextInt();
        int maxY = sc.nextInt();
        Robot robot;
        Scent scent = new Scent(maxX, maxY);

        while (sc.hasNext()) {
            // 以下區域為輸入的機器人指令的過濾整理
            robot = new Robot(sc.nextInt(), sc.nextInt(), sc.next().charAt(0));
            String instructions = sc.next();
            char[] instruction = new char[instructions.length()];
            for (int i = 0; i < instructions.length(); i++)
                instruction[i] = instructions.charAt(i);

            // 此迴圈將依序讀入每個機器人指令並進行運算
            for (char i : instruction) {
                if (i == 'L' || i == 'R')
                    robot.toward = get_Orientation(i, robot.toward);
                else if (i == 'F')
                    get_Position(robot, scent, maxX, maxY);
                if (robot.lost)
                    break;
            }

            // 以下將運算後結果輸出
            System.out.printf("%d %d %c", robot.nowX, robot.nowY, robot.toward);
            if (robot.lost)
                System.out.println(" LOST");
            else
                System.out.println("");
        }
        sc.close();
    }
}