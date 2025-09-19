## 1. 좌우로 반복하며 출력

<img width="864" height="994" alt="image" src="https://github.com/user-attachments/assets/619088c9-4438-405e-8254-1ee95ecf8344" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 1;

        for(int i = 0; i < n; i++) {
            if(a == 1) {
                for(int j = 0; j < n; j++) {
                    System.out.print(a);
                    a++;
                }
                System.out.println();
                continue;
            }
            if(a == n+1) {
                for(int j = 0; j < n; j++) {
                    a--;
                    System.out.print(a);
                }
                System.out.println();
                continue;
            }
            
        }
    }
}
```
## 2.상하로 반복하며 출력

<img width="569" height="981" alt="image" src="https://github.com/user-attachments/assets/e8f4fcb9-4c70-47c6-b54c-548e911026ca" />

```Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 1;
        int b = n;

        for(int i = 0; i < n ; i++) {
            for(int j = 0; j < n; j++) {
                if(j%2==0){
                    System.out.print(a);
                }else{
                    System.out.print(b);
                }
            }
            a++;
            b--;
            System.out.println();
        }
    }
}
```

