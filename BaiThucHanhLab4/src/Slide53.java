import java.net.SocketPermission;
import java.net.SocketTimeoutException;
import java.util.HashSet;
import java.util.Scanner
;
public class Slide53 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        set.add(3);
        set.add(1);
        set.add(4);
        set.add(2);
        set.add(8);

        System.out.println("cac phan tu trong set:");
        System.out.println(set);
        System.out.println("nhap phan tu can them"); 
        number = scanner.nextInt();
        if (!set.contains(number)) {
            set.add(number);
            System.out.println("them thanh cong");
            System.out.println("cac phan tu cua set sau khi them:");
            System.out.println(set);
        }else{
            System.out.println("phan tu"+ number + "da ton tai!");
        }
    }
}
