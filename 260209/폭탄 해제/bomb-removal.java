import java.util.Scanner;

class Program {
    String code;
    char color;
    int second;

    public Program(String code, char color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        Program program = new Program(uCode, lColor, time);

        System.out.println("code : " + program.code);
        System.out.println("color : " + program.color);
        System.out.println("second : " + program.second);
    }
}