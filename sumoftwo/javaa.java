import java.util.*;

public class javaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println(sum);

        float rad = scanner.nextFloat();
        float area = 3.14f *rad*rad;// here f means value is in float

        System.out.println(area);
    }
}