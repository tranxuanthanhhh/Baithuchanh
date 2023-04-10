import java.util.Scanner; 

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("nhap vao mot so nguyen duong: "); 
        int n = sc.nextInt(); 
        if (n < 0) { // Kiểm tra nếu n nhỏ hơn 0
            System.out.println("so khong hop le"); // In ra "Số không hợp lệ"
            return; 
        }
        long gt = 1; // Khai báo biến gt để lưu giai thừa của n và gán giá trị ban đầu là 1
        for (int i = 1; i <= n; i++) { // Lặp từ i = 1 đến i = n
            gt *= i; // Nhân gt với i và gán lại cho gt
        }
        System.out.println("giai thua cua " + n + " la: " + gt); // In ra kết quả
    }
}