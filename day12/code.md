## 1. 변수 값 복사하기 1

<img width="933" height="939" alt="image" src="https://github.com/user-attachments/assets/c83b6349-3960-454b-9cf2-cff31d37bfb7" />

```Java
public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        a = c;
        b = c;

        System.out.print(a + " " + b + " " + c)
    }
}
```
## 2.변수 값 복사하기 2

<img width="947" height="954" alt="image" src="https://github.com/user-attachments/assets/96865aa9-18fe-444a-a61e-345afe33873e" />

```Java
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;

        a = c;
        b = c;

        System.out.print(a + " " + b + " " + c);
    }
}
```

## 3.합을 복사하기

<img width="941" height="1003" alt="image" src="https://github.com/user-attachments/assets/a1bee635-ece1-4f3f-98b5-10131433c7c0" />

```Java
public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int sum = a + b + c;
        a = sum;
        b = sum;
        c = sum;

        System.out.print(a + " " + b + " " + c);
    }
}
```

## 4.입력받아 계산

<img width="924" height="1014" alt="image" src="https://github.com/user-attachments/assets/28a7deb5-143c-4cd3-ba8a-e53c7db66505" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt() + 2;

        System.out.print(a);
    }
}
```

