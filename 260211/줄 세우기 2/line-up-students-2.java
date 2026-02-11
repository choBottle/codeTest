import java.util.*;

class Student implements Comparable<Student>{
    int height,weight,num;

    public Student(int height, int weight, int num) {
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

    @Override
    public int compareTo(Student student) {
        if(this.height == student.height) {
            return student.weight - this.weight;
        }
        return this.height - student.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] arr = new Student[n];
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            arr[i] = new Student(height,weight,(i+1));
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].height + " " + arr[i].weight + " " + arr[i].num);
        }
        
    }
}