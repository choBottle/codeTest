## 1. 남녀노소 구분짓기

<img width="787" height="989" alt="image" src="https://github.com/user-attachments/assets/b398a659-b3c9-4858-861d-614dbe154066" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gen = sc.nextInt();

        int age = sc.nextInt();

        if(gen == 0){
            if(age >= 19) {
                System.out.print("MAN");
            }else {
                System.out.print("BOY");
            }
        }else {
            if(age >= 19) {
                System.out.print("WOMAN");
            }else {
                System.out.print("GIRL");
            }
        }
    }
}
```
## 2.윤년인가

<img width="772" height="916" alt="image" src="https://github.com/user-attachments/assets/5ccf2b3a-94db-443d-97e7-b01108feb263" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();

        if(Y%4 == 0 ){
            if(Y%100 == 0 && Y%400 != 0) {
                System.out.print("false");
            }else {
                System.out.print("true");
            }
        }else {
            System.out.print("false");
        }
    }
}
```

## 3. 중앙값 구하기

<img width="790" height="942" alt="image" src="https://github.com/user-attachments/assets/ff5dce46-376d-450d-bb4c-cf473140f2ce" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A,B,C;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        if(A > B) {
            if(C > A) {
                System.out.print(A);
            }else if (C > B) {
                System.out.print(C);
            }else {
                System.out.print(B);
            }
        }else {
            if(C > B) {
                System.out.print(B);
            }else if (C > A) {
                System.out.print(C);
            }else {
                System.out.print(A);
            }
        }
    }
}

```

## 4. 배열 채우고 출력하기

<img width="927" height="927" alt="image" src="https://github.com/user-attachments/assets/f5be4d09-2a06-4c27-a7f7-2e87ff803635" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.next();
        }

        for(int i = 9; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }


}
```

## 5. 짝수만 거꾸로 출력하기

<img width="793" height="1069" alt="image" src="https://github.com/user-attachments/assets/ac385b9c-f86d-4a63-a9e8-74251dfefab5" />

```Java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> evens = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evens.add(num);
            }
        }

        for (int i = evens.size() - 1; i >= 0; i--) {
            System.out.print(evens.get(i) + " ");
        }
    }
}
```
