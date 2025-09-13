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
