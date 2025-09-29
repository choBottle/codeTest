import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String time = sc.next(); 
        String[] parts = time.split(":"); 
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);

        h = h + 1; 


        System.out.println(h + ":" + m);
    }
}