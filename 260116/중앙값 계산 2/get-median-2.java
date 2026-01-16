import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();

            if (maxHeap.size() <= minHeap.size()) {
                maxHeap.add(num);
            } else {
                minHeap.add(num);
            }
            if (!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
                int tempMax = maxHeap.poll();
                int tempMin = minHeap.poll();
                maxHeap.add(tempMin);
                minHeap.add(tempMax);
            }

            if (i % 2 != 0) {
                System.out.print(maxHeap.peek() + " ");
            }
        }
    }
}