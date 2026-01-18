import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        String targetDate = "";
        String targetDay = "";
        String targetWeather = "";

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();

            if (weather.equals("Rain")) {
                if (targetDate.equals("") || date.compareTo(targetDate) < 0) {
                    targetDate = date;
                    targetDay = day;
                    targetWeather = weather;
                }
            }
        }

        // 결과 출력
        System.out.println(targetDate + " " + targetDay + " " + targetWeather);
        
        sc.close();
    }
}