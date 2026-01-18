import java.util.Scanner;

class User {
    String id;
    int level;

    public User(String id, int level) {
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        User user1 = new User("codetree", 10);
        
        String inputId = sc.next();
        int inputLevel = sc.nextInt();
        User user2 = new User(inputId, inputLevel);
        
        // 3. 출력
        System.out.println("user " + user1.id + " lv " + user1.level);
        System.out.println("user " + user2.id + " lv " + user2.level);
    }
}