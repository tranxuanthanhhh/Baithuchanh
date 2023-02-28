import java.util.Scanner;
 
public class Slide40 {
 
    public static void main(String[] args) {
        int day;
        Scanner sc = new Scanner(System.in);
         
        System.out.println(" nhap ngay: ");
        day = sc.nextInt();
         
    switch (day) {
        case 1:
            System.out.println("day la thu 2");
            break;
        case 2:
            System.out.println("day la thu 3");
            break;
        case 3:
            System.out.println("day la thu 4");
            break;
        case 4:
            System.out.println("day la thu 5");
            break;
        case 5:
            System.out.println("day la thu 6");
            break;
        case 6:
            System.out.println("day la thu 7");
            break;
        case 7:
            System.out.println("day la chu nhat");
            break;
        }
        sc.close();
    }
}