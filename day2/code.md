## 1. 합과 평균

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A,B;

        A = sc.nextInt();
        B = sc.nextInt();

        int sum = A+B;
        double avg = ((double)A+B)/2;

        System.out.print(sum + " " + avg);
    }
}
```
## 2.합과 평균의 차

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int a,b,c;

       a = sc.nextInt();
       b = sc.nextInt();
       c = sc.nextInt();

       int sum = a+b+c;
       int avg = (a+b+c)/3;

       System.out.println(sum);
       System.out.println(avg);
       System.out.println(sum-avg);
    }
}
```

## 3. 음수 구별하기

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(n);

        if(n < 0) {
            System.out.print("minus");
        }
    }
}
```

## 4. 비교 연산

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A,B;

        A = sc.nextInt();
        B = sc.nextInt();

        if(A >= B) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }

        if(A > B) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }
        
        if(A <= B) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }

        if(A < B) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }

        if(A == B) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }

        if(A != B) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
```

## 5. 시험 통과 여부 확인하기

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n >= 80) {
            System.out.print("pass");
        }else {
            System.out.print((80-n) + " more score");
        }
    }
}
```

## 6. 비교에 따른 연산

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;

        a = sc.nextInt();
        b = sc.nextInt();

        if(a > b) {
            System.out.print(a*b);
        }else {
            System.out.print(b/a);
        }
    }
}
```

## 7. 특정 조건 두 정수 비교

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A,B;

        A = sc.nextInt();
        B = sc.nextInt();

        if(A < B) {
            System.out.print("1 0");
        }else if (A == B){
            System.out.print("0 1");
        }else {
            System.out.print("0 0");
        }
    }
}
```
