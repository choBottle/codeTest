import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 3;

        if(n%2 == 1 && n != 1) {
            for(int i = 0; i < n-1; i++) {
                if(i == 0) {
                    for(int j = 0; j < n; j++) {
                        System.out.print("* ");
                    }
                }else if(i == 1) {
                    for(int j = 0; j < n; j++) {
                        if(j%2 == 0) {
                            System.out.print("  ");
                        }else{
                            System.out.print("* ");
                        }
                    }
                }else {
                    for(int j = 0; j < n; j++) {
                        if(j < a || j % 2 == 0) {
                            System.out.print("  ");
                        }else{
                            System.out.print("* ");
                        }
                    }
                    if(i%2 == 1) {
                        a++;
                    }
                }
                System.out.println();
            }
        }else {
          for(int i = 0; i < n; i++) {
                if(i == 0) {
                    for(int j = 0; j < n; j++) {
                        System.out.print("* ");
                    }
                }else if(i == 1) {
                    for(int j = 0; j < n; j++) {
                        if(j%2 == 0) {
                            System.out.print("  ");
                        }else{
                            System.out.print("* ");
                        }
                    }
                }else {
                    for(int j = 0; j < n; j++) {
                        if(j < a || j % 2 == 0) {
                            System.out.print("  ");
                        }else{
                            System.out.print("* ");
                        }
                    }
                    if(i%2 == 1) {
                        a++;
                    }
                }
                System.out.println();
            }  
        }
    }
}