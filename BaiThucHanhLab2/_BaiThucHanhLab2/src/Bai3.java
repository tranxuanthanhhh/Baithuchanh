import java.util.Scanner; 
public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("nhap ten: "); 
        String name = sc.nextLine(); 
        System.out.println("nhap nam sinh: "); 
        int year = sc.nextInt(); 
        int tuoi = 2023 - year; 
        String nhomtuoi; 
        
        if (tuoi < 16) { 
            nhomtuoi = "vi thanhnien"; 
        } else if (tuoi >= 16 && tuoi < 18) { 
            nhomtuoi = "truong thanh"; 
        } else { 
            nhomtuoi = "da gia"; 
        }
        
        System.out.println("ban " + name + " o do tuoi " + nhomtuoi); 
        
    }
}
