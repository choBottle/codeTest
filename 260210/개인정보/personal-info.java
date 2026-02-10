import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int tall;
    double weight;

    public Student(String name, int tall, double weight) {
        this.name = name;
        this.tall = tall;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    public static final Comparator<Student> NAME_ORDER = 
        (s1, s2) -> s1.name.compareTo(s2.name);

    public static final Comparator<Student> TALL_ORDER = 
        (s1, s2) -> s2.tall - s1.tall;
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String[] names = new String[n];
        int[] heights = new int[n];
        double[] weights = new double[n];
        Student[] arr = new Student[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            heights[i] = sc.nextInt();
            weights[i] = sc.nextDouble();
            arr[i] = new Student(names[i],heights[i],weights[i]);
        }
        Arrays.sort(arr, Student.NAME_ORDER);

        System.out.println("name");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].name + " " + arr[i].tall + " " + arr[i].weight);
        }
        System.out.println();

        Arrays.sort(arr, Student.TALL_ORDER);

        System.out.println("height");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].name + " " + arr[i].tall + " " + arr[i].weight);
        }
    }
}