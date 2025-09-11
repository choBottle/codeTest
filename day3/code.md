## 1. 물의 상태

<img width="883" height="988" alt="image" src="https://github.com/user-attachments/assets/8bc64b62-cc4b-4ed7-9b74-c45252f0518b" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n < 0) {
            System.out.println("ice");
        }else if (n < 100) {
            System.out.println("water");
        }else {
            System.out.println("vapor");
        }
    }
}
```
## 2.살 수 있는 물건

<img width="794" height="986" alt="image" src="https://github.com/user-attachments/assets/41d7aebb-1b43-4f60-99c5-3101c809723e" />


```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n >= 3000) {
            System.out.println("book");
        }else if (n >= 1000 ) {
            System.out.println("mask");
        }else {
            System.out.println("no");
        }
    }
}
```

## 3. 등급 매기기

<img width="938" height="928" alt="image" src="https://github.com/user-attachments/assets/d5d720a7-a1bd-430f-8123-02a7f0f3b45c" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n >= 90) {
            System.out.println("A");
        }else if(n >=80) {
            System.out.println("B");
        }else if(n >=70) {
            System.out.println("C");
        }else if(n >=60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
```

## 4. 문자 출력하기

<img width="940" height="904" alt="image" src="https://github.com/user-attachments/assets/abf83995-feb2-4c70-917a-58dfc8a54e91" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String c = sc.next();

        for(int i = 0; i < 8; i++) {
            System.out.print(c);
        }
    }
}
```

## 5. 문자열 출력하기

<img width="927" height="882" alt="image" src="https://github.com/user-attachments/assets/f7a643ff-9764-46e3-a5af-2cc8b6cee083" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println("LeebrosCode");
        }
    }
}
```

## 6. N번 더하기

<img width="774" height="1001" alt="image" src="https://github.com/user-attachments/assets/914207d2-5177-4570-82a4-1bc025a4ee46" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,n;

        a = sc.nextInt();
        n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            a += n;
            System.out.println(a);
        }
    }
}
```

