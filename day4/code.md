## 1. 차례로 출력

<img width="955" height="904" alt="image" src="https://github.com/user-attachments/assets/a82d7102-a865-4bc3-83da-d6eaccded149" />


```Java
public class Main {
    public static void main(String[] args) {
        for(int i = 5; i < 18; i++) {
            System.out.print(i + " ");
        }
    }
}
```
## 2.정수 입력받아 배수 출력

<img width="947" height="1008" alt="image" src="https://github.com/user-attachments/assets/b8449f86-b5bd-4ccb-89cc-0699fa5d33a2" />



```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int n2 = n;

        for(int i = 0; i < 5; i++) {
            System.out.print(n + " ");
            n += n2;
        }
    }
}
```

## 3. B부터 A까지 감소

<img width="886" height="986" alt="image" src="https://github.com/user-attachments/assets/82861737-0b16-413d-9114-18e8f80bcf0c" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A,B;

        A = sc.nextInt();
        B = sc.nextInt();

        for(int i = B; i >= A; i-- ) {
            System.out.print(i + " ");
        }
    }
}

```

## 4. M으로 계속 나누기

<img width="802" height="1048" alt="image" src="https://github.com/user-attachments/assets/93885eac-6517-483e-88aa-1255f6e58609" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        while(N > 0) {
            System.out.println(N);
            N /= M;
        }
    }
}

```

## 5. 점수 비교

<img width="876" height="1017" alt="image" src="https://github.com/user-attachments/assets/75f0ee36-8a48-46e3-8a45-7644ebfcdff8" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int AMath,AEnglish,BEnglish,BMath;

        AMath = sc.nextInt();
        AEnglish = sc.nextInt();
        BMath = sc.nextInt();
        BEnglish = sc.nextInt();

        if(AMath > BMath && AEnglish > BEnglish) {
            System.out.print("1");
        }else {
            System.out.print("0");
        }
    }
}
```

## 6. 정수의 조건 여부 3

<img width="870" height="990" alt="image" src="https://github.com/user-attachments/assets/a0705035-f65a-430c-9e96-eff171a22cf1" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a %13 == 0 || a %19 == 0){
            System.out.print("True");
        }else {
            System.out.print("False");
        }
    }
}
```

## 7. 굉장한 수

<img width="781" height="949" alt="image" src="https://github.com/user-attachments/assets/343c83ee-906f-4de7-a7c1-75313f2177ac" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if((N % 2 == 1 && N % 3 == 0) || (N % 2 == 0 && N % 5 == 0)) {
            System.out.print("true");
        }else {
            System.out.print("false");
        }
    }
}
```
