import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int sum = 0, number;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("nhap vao so nguyen:");
                number = scanner.nextInt();
                sum += number;
                     
                if (sum > 100)
                    break;
            } while (number > 0);
        }
             
        System.out.println("tong = " + sum);
    }
}
