package Lists;
import java.util.Scanner;
import java.rmi.StubNotFoundException;
import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {

    ArrayList<Student> arrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    System.out.print("nhap so student :");
    int n =sc.nextInt();

    for(int i=0; i<n; i++){
        System.out.println("nhap student"+ (i+1) + "thong tin:");
        Student std = new Student("",0);
        std.NhapThongTin();
        std.add(std);
        System.out.println();
    }
    
}    
}
