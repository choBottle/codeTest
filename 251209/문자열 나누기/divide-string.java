import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            if (!scanner.hasNextInt()) return;
            int N = scanner.nextInt();
            
            StringBuilder combinedString = new StringBuilder();
            
            for (int i = 0; i < N; i++) {
                if (scanner.hasNext()) {
                    combinedString.append(scanner.next());
                } else {
                    break; 
                }
            }
            
            String fullString = combinedString.toString();
            int length = fullString.length();
            
            final int CHUNK_SIZE = 5;
            
            for (int i = 0; i < length; i += CHUNK_SIZE) {
                int endIndex = Math.min(i + CHUNK_SIZE, length);
                
                String chunk = fullString.substring(i, endIndex);
                
                System.out.println(chunk);
            }
    }
}