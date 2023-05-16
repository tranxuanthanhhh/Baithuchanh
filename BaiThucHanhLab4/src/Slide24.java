import java.util.ArrayList;
import java.util.Scanner;
public class Slide24 {
    public static void main(String[] args) {
        ArrayList<Integer> arli = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("nhap so phan tu cua arl:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
        System.out.println("nhap phan tu thu" + i + ":");
        number = scanner.nextInt();
        arli.add(number);
        }
        int max = arli.get(0);
        for (int i = 1; i < arli.size(); i++){
            if (arli.get(i).compareTo(max)>0){
                max = arli.get(i);
            }
        }
        System.out.println("phan tu lon nhat trong arli =" + max);
    }
}
