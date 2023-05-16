import java.util.Scanner;
import java.util.LinkedList;

public class Slide40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<String> lkl = new LinkedList<>(null);
        lkl.add("thang 1");
        lkl.add("thang 2");
        lkl.add("thang 3");
        lkl.add("thang 4");
        lkl.add("thang 5");
        lkl.add("thang 6");
        lkl.add("thang 7");
        lkl.add("thang 8");
        lkl.add("thang 9");
        lkl.add("thang 10");
        lkl.add("thang 11");
        lkl.add("thang 12");

        System.out.println("nhap vao chi so cua phan tu can lay");
        int index = scanner.nextInt();
        if ((index < 0) || (index > (lkl.size() - 1))) {
            System.out.println("chi so can lay phai lon hon 0 va nho hon" + (lkl.size()-1));

        } else{
            String node = lkl.get(index);
            System.out.println("phan tu co chi so bang =" + index + "trong lkl la" + node);
            }
        String firstNode = lkl.getLast();
        String lastNode = lkl.getLast();
        System.out.println("\nphan tu dau tien trong danh sach la" + firstNode + "; phan tu cuoi trong danh sach la" + lastNode);
    }
}   

