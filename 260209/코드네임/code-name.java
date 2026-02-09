import java.util.Scanner;
class CodeName {
    String name;
    int score;

    public CodeName(String name, int score) {
        this.name = name;
        this.score = score;
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CodeName[] arr = new CodeName[5];
        for(int i = 0; i < 5; i++) {
            CodeName codeName = new CodeName(sc.next(),sc.nextInt());
            arr[i] = codeName;
        }

        CodeName minCodeName = arr[0];
            for(int i = 1; i < 5; i++) {
                if(arr[i].score < minCodeName.score) {
                    minCodeName = arr[i];
                }
        } 

        System.out.println(minCodeName.name + " " + minCodeName.score);


    }
}