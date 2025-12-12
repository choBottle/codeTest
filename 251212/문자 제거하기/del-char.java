import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        while(true){
            int n = sc.nextInt();

            int len = str.length();

            if(n<len){
            str = str.substring(0,n)+str.substring(n+1);
            }
            else{
                str = str.substring(0,len-1);
            }
            
            System.out.println(str);
            len = str.length();

            if(len<=1){
                break;
            }
        }
    }
}
