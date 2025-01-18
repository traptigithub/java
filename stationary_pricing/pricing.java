
import java.util.*;

public class pricing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float pen = scanner.nextFloat();
        float pencil = scanner.nextFloat();
        float eraser = scanner.nextFloat();

        float tcost = pen + pencil + eraser;
        System.out.println(tcost);
        double gst = 0.18* tcost;
        System.out.println(gst);

    }
}