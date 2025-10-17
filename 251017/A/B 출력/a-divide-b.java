import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigDecimal a = sc.nextBigDecimal();
        BigDecimal b = sc.nextBigDecimal();

        BigDecimal c = a.divide(b,20,RoundingMode.DOWN);

        System.out.println(c.toPlainString());
    }
}