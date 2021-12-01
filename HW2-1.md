```java
import java.util.Scanner;
public class FactorialMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            long res2 = getFactorial(i);
            System.out.println("Factorial of " + i + " = " + res2);
        }
        sc.close();
    }
    private static long getFactorial(final int n) {
        int res = 1;
        for (int x = 1; x <= n; x++) {
            res = res * x;
        }
        return res;
    }
}
```
