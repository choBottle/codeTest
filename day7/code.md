## 1. 친근하지 않은 수

<img width="787" height="898" alt="image" src="https://github.com/user-attachments/assets/d5b1f132-dc3a-433e-b99e-e54a7506a64a" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1;i <= n; i++) {
            if(i % 2 == 0) {
                continue;
            }else if(i % 3 == 0){
                continue;
            }else if(i % 5 == 0){
                continue;
            }
            sum++;
        }

        System.out.print(sum);
    }
}
```
## 2.1부터의 합

<img width="780" height="886" alt="image" src="https://github.com/user-attachments/assets/4c30467f-6994-4e84-9267-8af78f80d804" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;

        int i = 0;

        while(true) {
            sum += i;
            if(sum >= n) {
                System.out.print(i);
                break;
            }
            i++;
        }
    }
}
```

## 3. A부터 B까지 짝수의 합

<img width="770" height="882" alt="image" src="https://github.com/user-attachments/assets/c5d64136-7c9c-498e-911b-a5e95d11cffa" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        a = sc.nextInt();
        b = sc.nextInt();

        int sum = 0;
        for(int i = a; i <= b; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }

        System.out.print(sum);
    }
}
```

## 4. 배수의 개수

<img width="776" height="1028" alt="image" src="https://github.com/user-attachments/assets/a6db4e2a-1a85-4d64-8b4f-27869881adfc" />

```Java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int three = 0;
        int five = 0;

        for(int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if(n % 3 == 0) {
                three++;
            }
            if(n % 5 == 0) {
                five++;
            }
        }

        System.out.print(three + " " + five);
    }
}
```

## 5. 문자열의 특정 위치 찾기 2

<img width="856" height="966" alt="image" src="https://github.com/user-attachments/assets/87cd1a65-4a07-4353-87de-70fd8ed0ad12" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        int sum = 0;

        String[] arr = {"apple","banana","grape","blueberry","orange"};

        for(int i = 0; i < 5; i++) {
            if(a.equals(arr[i].substring(2,3))) {
                System.out.println(arr[i]);
                sum++;
            }else if(a.equals(arr[i].substring(3,4))) {
                System.out.println(arr[i]);
                sum++;
            }
        }

        System.out.println(sum);
    }
}
```
