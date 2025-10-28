import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0;

        if(n%2 == 1 && n != 1) {
            for(int i = 1; i <= n-1; i++) {
                if(i == 1) {
                    for(int j = 0; j < n; j++) {
                        System.out.print("* ");
                    }
                }else if(i == 2) {
                    for(int j = 0; j < n; j++) {
                        if(j%2 == 0) {
                            System.out.print("  ");
                        }else{
                            System.out.print("* ");
                        }
                    }
                }else {
                    if(i % 2 == 0) {
                        a = i-1;
                    }else {
                        a = i;
                    }
                    for(int j = 1; j <= n; j++) {
                        if(j < a || j % 2 == 1) {
                            System.out.print("  ");
                        }else{
                            System.out.print("* ");
                        }
                    }
                }
                System.out.println();
            }
        }else {
          for(int i = 1; i <= n; i++) {
                if(i == 1) {
                    for(int j = 0; j < n; j++) {
                        System.out.print("* ");
                    }
                }else if(i == 2) {
                    for(int j = 0; j < n; j++) {
                        if(j%2 == 0) {
                            System.out.print("  ");
                        }else{
                            System.out.print("* ");
                        }
                    }
                }else {
                    if(i % 2 == 0) {
                        a = i-1;
                    }else {
                        a = i;
                    }
                    for(int j = 1; j <= n; j++) {
                        if(j < a || j % 2 == 1) {
                            System.out.print("  ");
                        }else{
                            System.out.print("* ");
                        }
                    }
                }
                System.out.println();
            }  
        }
    }
}