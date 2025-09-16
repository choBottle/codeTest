## 1. 0 나올때까지 출력

<img width="1776" height="1382" alt="image" src="https://github.com/user-attachments/assets/7e94bb0c-82da-41f0-bcf1-57a052cfaa48" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int a = sc.nextInt();
            if(a == 0) {
                break;
            }
            System.out.println(a);
        }
    }
}
```
## 2.A 부터 B 까지

<img width="1803" height="1384" alt="image" src="https://github.com/user-attachments/assets/2e71be20-4c22-4a1f-bf7f-955eb20d07cf" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while(true) {
            if(a > b) {
                break;
            }
            System.out.print(a + " ");
            if(a%2 == 0) {
                a +=3;
            }else {
                a *= 2;
            }
            
        }
    }
}
```

## 3. 특정 수 맞히기

<img width="1800" height="1487" alt="image" src="https://github.com/user-attachments/assets/6f707237-23f6-4a53-bda7-627a4296a777" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();

            if(n == 25){
                System.out.println("Good");
                break;
            }else if(n < 25) {
                System.out.println("Higher");
            }else {
                System.out.println("Lower");
            }
            
        }
    }
}
```

## 4. 직사각형 별표 출력하기

<img width="1804" height="1649" alt="image" src="https://github.com/user-attachments/assets/5eb8aecf-a969-41d0-928b-37d7774e475c" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

## 5. 별표 출력하기 2

<img width="1611" height="1689" alt="image" src="https://github.com/user-attachments/assets/613b45eb-2894-4ac7-b4b6-3bfc856775bc" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```
