import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Element {
    int value;   
    int originalIdx; 

    public Element(int value, int originalIdx) {
        this.value = value;
        this.originalIdx = originalIdx;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Element[] elements = new Element[n];
        
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            elements[i] = new Element(val, i);
        }

        Arrays.sort(elements, new Comparator<Element>() {
            @Override
            public int compare(Element a, Element b) {
                if (a.value != b.value) {
                    return a.value - b.value;
                }
                return a.originalIdx - b.originalIdx;
            }
        });

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[elements[i].originalIdx] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}