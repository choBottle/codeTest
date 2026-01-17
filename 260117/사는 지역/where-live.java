import java.util.Scanner;

class Person {
    String name;
    String address;
    String region;

    public Person(String name, String address, String region) {
        this.name = name;
        this.address = address;
        this.region = region;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        Person[] people = new Person[n];
        
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String address = sc.next();
            String region = sc.next();
            
            people[i] = new Person(name, address, region);
        }
        
        int lastIdx = 0;
        for (int i = 1; i < n; i++) {
            if (people[i].name.compareTo(people[lastIdx].name) > 0) {
                lastIdx = i;
            }
        }
        
        System.out.println("name " + people[lastIdx].name);
        System.out.println("addr " + people[lastIdx].address);
        System.out.println("city " + people[lastIdx].region);
    }
}