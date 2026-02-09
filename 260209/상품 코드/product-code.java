import java.util.Scanner;

class Product {
    String id;
    int code;

    public Product(String id, int code) {
        this.id = id;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        
        Product product1 = new Product("codetree", 50);
        Product product2 = new Product(id2,code2);

        System.out.println("product " + product1.code + " is " + product1.id);
        System.out.println("product " + product2.code + " is " + product2.id);
    }
}