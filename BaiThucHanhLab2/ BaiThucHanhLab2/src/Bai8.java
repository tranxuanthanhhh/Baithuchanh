import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("nhap vao so phan tu cua day: "); 
        int n = sc.nextInt(); 
        if (n <= 0) { 
            System.out.println("so khong hop le"); 
            return; 
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) { // Lặp từ i = 1 đến i = n
            System.out.print("nhap vao so thu " + i + ": "); 
            int x = sc.nextInt(); // Đọc số nguyên từ bàn phím và gán cho biến x
            sum += x; // Cộng sum với x và gán lại cho sum
        }
        double avg = (double)sum / n; // Khai báo biến avg để lưu trung bình cộng của các số và tính giá trị bằng cách chia sum cho n với ép kiểu double
        System.out.println("trung binh cong cua " + n + "  so la: " + avg); 
    }
}