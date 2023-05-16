import java.util.Scanner;

public class Student {
    public String Fullname;
    public int Age;
    public void NhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Full name =");
        Fullnane = sc.nextLine();
        System.out.print("Age =");
        Age = sc.nextInt();

    }
    public void HienThiThongTin()
    {
        System.out.println("Full name:"+ Fullname);
        System.out.println("Age"+ Age);
    }
    public ThemMoiThongTin(String fullname, int age)
    {
        Fullname = fullname;
        Age = age;
    }
    public SuaThongTin(String fullname, int age)
    {
        Fullname = fullname;
        Age = age;
    }
}