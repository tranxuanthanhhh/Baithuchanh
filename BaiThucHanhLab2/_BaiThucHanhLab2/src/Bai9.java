import java.util.Scanner; 

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("nhap vao mot chuoi bat ky: "); 
        String s = sc.nextLine(); 
        int lower = 0; // Khai báo biến lower để lưu số ký tự thường và gán giá trị ban đầu là 0
        int upper = 0; // Khai báo biến upper để lưu số ký tự hoa và gán giá trị ban đầu là 0
        int digit = 0; // Khai báo biến digit để lưu số chữ số và gán giá trị ban đầu là 0
        for (int i = 0; i < s.length(); i++) { // Lặp từ i = 0 đến i < chiều dài của chuỗi s
            char c = s.charAt(i); // Lấy ra ký tự tại vị trí i trong chuỗi s và gán cho biến c
            if (Character.isLowerCase(c)) { // Kiểm tra nếu c là ký tự thường
                lower++; // Tăng lower lên 1 đơn vị
            } else if (Character.isUpperCase(c)) { // Kiểm tra nếu c là ký tự hoa
                upper++; // Tăng upper lên 1 đơn vị
            } else if (Character.isDigit(c)) { // Kiểm tra nếu c là chữ số
                digit++; // Tăng digit lên 1 đơn vị
            }
        }
        System.out.println("so ky tu trong chuoi: " + lower); 
        System.out.println("So ky tu hoa trong chuoi: " + upper);  
        System.out.println("So ky tu chuoi trong chuoi: " + digit);     
    }
}