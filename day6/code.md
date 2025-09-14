## 1. 따옴표 출력

<img width="879" height="845" alt="image" src="https://github.com/user-attachments/assets/ac0440e5-0b0e-44a3-a776-a5c4098f82e7" />

```Java
public class Main {
    public static void main(String[] args) {
        System.out.print("He says \"It's a really simple sentence\".");
    }
}
```
## 2.더 긴 문자열

<img width="870" height="1001" alt="image" src="https://github.com/user-attachments/assets/e6e1dc69-35ca-48d1-8f94-0d0bec93fe82" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String first = sc.next();
       String second = sc.next();

       if(first.length() < second.length()) {
        System.out.print(second + " " + second.length());
       }else if(first.length() > second.length()) {
        System.out.print(first + " " + first.length());
       }else {
        System.out.print("same");
       }
    }
}
```

## 3. a로 채워넣기

<img width="891" height="988" alt="image" src="https://github.com/user-attachments/assets/07029238-919f-429d-90bb-9e6d68672f1f" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        String word1 = word.substring(0,1) + "a" + word.substring(2,word.length()-2) + "a" + word.substring(word.length()-1);

        System.out.print(word1);
    }
}
```

## 4. 100점 도달하기

<img width="779" height="1043" alt="image" src="https://github.com/user-attachments/assets/8b625159-ebcb-4855-8d00-57a2fc6c095a" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(; n <= 100; n++) {
            if(n >= 90) {
                System.out.print("A");
            }else if(n >= 80) {
                System.out.print("B");
            }else if(n >= 70) {
                System.out.print("C");
            }else if(n >= 60) {
                System.out.print("D");
            }else {
                System.out.print("F");
            }
            System.out.print(" ");
        }
    }
}
```

## 5. 제곱하여 출력하기

<img width="854" height="1014" alt="image" src="https://github.com/user-attachments/assets/73893416-00a4-4ee9-8f68-6c14a3e61b9c" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            System.out.print(arr[i]*arr[i] + " ");
        }
    }
}
```

## 6. 일의 자리 배열

<img width="884" height="994" alt="image" src="https://github.com/user-attachments/assets/addb24aa-f759-40d7-a62d-80ce8bc92ba9" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();

        for(int i = 2; i < 10; i++){
            arr[i] = (arr[i-1] + arr[i-2])%10;
       }

       for(int i = 0; i < 10; i++) {
        System.out.print(arr[i] + " ");
       }
    }
}
```
