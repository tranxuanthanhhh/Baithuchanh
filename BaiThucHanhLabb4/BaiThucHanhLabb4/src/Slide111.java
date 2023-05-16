import java.util.Scanner;
import java.util.LinkedList;

public class Slide111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu cua danh sach:");
        int n = sc.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + ": ");
            int phantu = sc.nextInt();
            linkedList.add(phantu);
        }  
        double tong = 0;
        int count = 0;

        for(int i: linkedList){
            if(i % 2 == 0){
                tong += i;
                count++;
            }
        }
        double trungbinh = tong/count;
        System.out.print("trung binh cong cua cac so chan la:" + trungbinh);
    }
}
