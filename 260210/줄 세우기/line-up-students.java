import java.util.*;

class Student implements Comparable<Student>{
    int tall,weight,num;

    public Student(int tall,int weight, int num) {
        this.tall = tall;
        this.weight = weight;
        this.num = num;
    }

    @Override
    public int compareTo(Student student) {
        if(this.tall == student.tall) {
            if(this.weight == student.weight) {
                return this.num - student.num;
            }
            return student.weight - this.weight;
        }
        return student.tall - this.tall;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        int[] weight = new int[n];
        Student[] arr = new Student[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
            arr[i]= new Student(height[i], weight[i], i+1);
        }
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].tall + " " + arr[i].weight + " " + arr[i].num);
        }
    }
}