import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Slide110{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> daysonguyen = new ArrayList<Integer>();
        System.out.print("nhap so luong pahn tu cua day so:");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            System.out.print("nhap phan tu thu " + (i+1) +":");
            int dayso = sc.nextInt();
            daysonguyen.add(dayso);
        }
        int max = Collections.max(daysonguyen);
        System.out.println("so nguyen co gia tri lon nhat la:" + max);

        System.out.print("nhap so nguyen can xoa:");
        int socanxoa = sc.nextInt();
        daysonguyen.removeIf(dayso -> dayso == socanxoa);

        Collections.sort(daysonguyen);
        System.out.print("day so sau khi sap xep:");
        for(int dayso : daysonguyen){
            System.out.print(dayso + " ");
        }
    }
}
