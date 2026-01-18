import java.util.Scanner;

class Mission {
    String code;
    String place;
    int time;

    public Mission(String code, String place, int time) {
        this.code = code;
        this.place = place;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sCode = sc.next();
        String sPlace = sc.next();
        int sTime = sc.nextInt();

        Mission myMission = new Mission(sCode, sPlace, sTime);

        System.out.println("secret code : " + myMission.code);
        System.out.println("meeting point : " + myMission.place);
        System.out.println("time : " + myMission.time);

        sc.close();
    }
}