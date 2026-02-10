import java.util.*;

class Person implements Comparable<Person>{
    String name;
    int tall;
    int weight;

    public Person (String name, int tall, int weight) {
        this.name = name;
        this.tall = tall;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person person) {
        return this.tall - person.tall;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] arr = new Person[n];
        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int tall = sc.nextInt();
            int weight = sc.nextInt();

            Person person = new Person(name,tall,weight);

            arr[i] = person;
        }

        Arrays.sort(arr);

        for(int i = 0; i < n; i++) {
            System.out.println(arr[i].name + " " + arr[i].tall + " " + arr[i].weight);
        }
    }
}