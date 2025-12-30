import java.util.Scanner;
public class Main {
    public static void scan(String a){
        int cnt=1; 

        for(int i=0; i<a.length()-1; i++){
            if(a.charAt(i) !=a.charAt(i+1)){  
                cnt++; 
            }
        }

        if(cnt>=2){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        scan(A);
    }
}