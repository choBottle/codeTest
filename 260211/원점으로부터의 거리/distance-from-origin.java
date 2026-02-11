import java.util.*;
import java.math.*;

class Point implements Comparable<Point>{
    int x,y,num;

    public Point(int x, int y, int num) {
        this.x = x;
        this.y = y;
        this.num = num;
    }

    @Override
    public int compareTo(Point point) {
        if((Math.abs(this.x) + Math.abs(this.y)) == (Math.abs(point.x) + Math.abs(point.y))) {
            return this.num - point.num;
        }
        return (Math.abs(this.x) + Math.abs(this.y)) - (Math.abs(point.x) + Math.abs(point.y));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        Point[] arr = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
            arr[i] = new Point(points[i][0],points[i][1],(i+1));
        }
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].num);
        }
    }
}