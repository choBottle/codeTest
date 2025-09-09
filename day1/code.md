## 1. 세 실수의 반올림

```Java
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        DecimalFormat format = new DecimalFormat("0.000");
    
        System.out.println(format.format(a));
        System.out.println(format.format(b));
        System.out.println(format.format(c));
    }
}
```
## 2.입력받은 값 교체하기

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.print(b + " " + a);
    }
}
```

## 3. 입력받은 값과 합 출력

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.print(a + " " + b + " " + (a+b));
    }
}
```
