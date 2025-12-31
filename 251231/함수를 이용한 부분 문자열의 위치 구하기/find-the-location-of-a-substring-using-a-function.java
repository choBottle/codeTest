import java.util.*;
public class Main {
    public static String inputStr = "";
    public static String goalStr = "";

    public static void main(String[] args) {
        // Please write your code here.
        // 1. 입력 문자열
        Scanner sc = new Scanner(System.in);
        inputStr = sc.next();
        goalStr = sc.next();

       returnIndex();
    }

    public static void returnIndex(){
        int index = inputStr.indexOf(goalStr);
        System.out.print(index);  
    }
}
