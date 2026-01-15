import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        List<String> filteredWords = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String word = words[i];
            if (word.startsWith(t)) {
                filteredWords.add(word);
            }
        }

        Collections.sort(filteredWords);

        if (filteredWords.size() >= k) {
            System.out.println(filteredWords.get(k - 1));
        }

    }
}