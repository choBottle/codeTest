## 1. 직각 삼각형 출력

<img width="876" height="982" alt="image" src="https://github.com/user-attachments/assets/e833f30f-3791-4490-9e8c-8c12fbd507ee" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 1;

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < a; j++) {
                System.out.print("*");
            }
            a += 2;
            System.out.println();
        }
    }
}
```
## 2.정상적인 구구단

<img width="866" height="1005" alt="image" src="https://github.com/user-attachments/assets/1e56ea46-7f09-4cff-9f63-4398d10adbb8" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++) {
                if( j == n) {
                    System.out.print( i + " * " + j + " = " + (i*j));

                }else {
                    System.out.print( i + " * " + j + " = " + (i*j) + ", ");
                }
            }
            System.out.println();
        }
    }
}
```

## 3. 숫자 피라미드

<img width="882" height="1014" alt="image" src="https://github.com/user-attachments/assets/a7f7da13-e2d9-4c0c-960b-03d89ef6a92e" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
```

## 4. 짝수의 합 n번 구하기

<img width="776" height="1022" alt="image" src="https://github.com/user-attachments/assets/c3e14d2b-2a6c-46fa-9ce8-a1a7c3389df1" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = 0;

            for(int j = a; j <= b; j++) {
                if(j%2 == 0) {
                    sum += j;
                }
            }

            System.out.println(sum);
        }
    }
}
```

## 5. 약수가 세 개인 수

<img width="795" height="959" alt="image" src="https://github.com/user-attachments/assets/41332af6-9c5f-48e1-963f-bc184d7c48eb" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        for(int i = a; i <=b; i++) {
            int three = 0;
            for(int j = 1; j <= i; j++) {
                if(i%j == 0) {
                    three++;
                }
            }
            if(three == 3) {
                sum++;
            }
        }

        System.out.print(sum);
    }
}
```

