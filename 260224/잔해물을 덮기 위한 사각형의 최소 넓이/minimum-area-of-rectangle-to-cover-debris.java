import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt();
        int rect1_y1 = sc.nextInt();
        int rect1_x2 = sc.nextInt();
        int rect1_y2 = sc.nextInt();
        
        int rect2_x1 = sc.nextInt();
        int rect2_y1 = sc.nextInt();
        int rect2_x2 = sc.nextInt();
        int rect2_y2 = sc.nextInt();
        
        int minX = rect1_x1;
        int maxX = rect1_x2;
        int minY = rect1_y1;
        int maxY = rect1_y2;

        if (rect2_y1 <= rect1_y1 && rect2_y2 >= rect1_y2) {
            if (rect2_x1 <= rect1_x2 && rect2_x2 >= rect1_x2) {
                maxX = Math.min(maxX, rect2_x1);
            }
            else if (rect2_x1 <= rect1_x1 && rect2_x2 >= rect1_x1) {
                minX = Math.max(minX, rect2_x2);
            }
        }

        if (rect2_x1 <= rect1_x1 && rect2_x2 >= rect1_x2) {
            if (rect2_y1 <= rect1_y2 && rect2_y2 >= rect1_y2) {
                maxY = Math.min(maxY, rect2_y1);
            }
            else if (rect2_y1 <= rect1_y1 && rect2_y2 >= rect1_y1) {
                minY = Math.max(minY, rect2_y2);
            }
        }

        int width = Math.max(0, maxX - minX);
        int height = Math.max(0, maxY - minY);
        
        System.out.println(width * height);
        
        sc.close();
    }
}