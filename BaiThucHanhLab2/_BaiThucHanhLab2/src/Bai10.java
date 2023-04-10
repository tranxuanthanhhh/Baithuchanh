import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi;
        char kyTu;
        do {
            System.out.println("nhap mot chuoi khong qua 80 kytu: ");
            chuoi = scanner.nextLine();
            
            System.out.println("nhap mot ktu bat ky: ");
            kyTu = scanner.next().charAt(0);
            scanner.nextLine();
            
        } while (chuoi.length() > 80); 
        
        int dem = 0; 
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) { 
                dem++; 
            }
        }
       System.out.println("so lan xuat hien cua kytu " + kyTu + " trong chuoi " + chuoi + " la: " + dem);
    }
}