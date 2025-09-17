## 1. 배열의 합

<img width="781" height="1007" alt="image" src="https://github.com/user-attachments/assets/4a7e86c3-4783-41af-9eb9-45561c43bf87" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];

        for(int i = 0; i < 4; i++) {
            int sum = 0;
            for(int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
            for(int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }
            System.out.println(sum);
        }
    }
}
```
## 2.배열의 값을 3배로

<img width="875" height="1034" alt="image" src="https://github.com/user-attachments/assets/1e0f1a1e-2635-4535-a191-f0e5452b9fe2" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
                arr[i][j] *= 3;
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

## 3.두 배열의 곱

<img width="785" height="1029" alt="image" src="https://github.com/user-attachments/assets/6d55d5d5-ca41-4696-a617-1c579aba6b15" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr1 = new int[3][3];

        int[][] arr2 = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j]*arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

## 4. 두 개의 격자 비교하기

<img width="598" height="946" alt="image" src="https://github.com/user-attachments/assets/58a9330d-f2e0-42c3-af40-5d5c40ce0c39" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <m; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <m; j++){
                arr2[i][j] = sc.nextInt();
                if(arr1[i][j] == arr2[i][j]) {
                    System.out.print("0 ");
                }else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
```

## 5. 5의 배수의 개수는?

<img width="880" height="1030" alt="image" src="https://github.com/user-attachments/assets/60a22a71-f896-479b-8798-44e38f2beb55" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                int num = sc.nextInt();
                if(num%5 ==0) {
                    result++;
                }
            }
        }

        System.out.print(result);
    }
}
```

## 6. 특정 원소들의 합

<img width="583" height="971" alt="image" src="https://github.com/user-attachments/assets/91187c66-6fae-4999-bbf7-a650b19f634d" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];
        int result = 0;

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
                if(i >= j) {
                    result += arr[i][j];
                }
            }
        }

        System.out.print(result);
    }
}
```
