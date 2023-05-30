import java.util.Scanner;

public class TXT109Student {
    String Fullname;
    float MSV;
    int Namsinh;
    
    public void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("fullname:");
        Fullname = sc.nextLine();
        System.out.print("nhap MSV:");
        MSV = sc.nextFloat();
        System.out.print("nhap nam sinh:");
        Namsinh = sc.nextInt();   
    }

    public void ThemThongTin(String fullname,float msv, int namsinh){
        Fullname = fullname;
        MSV = msv;
        Namsinh = namsinh;   
    }

    public void SuaThongTin(String fullname, float msv, int namsinh){
        Fullname = fullname;
        MSV = msv;
        Namsinh = namsinh;
    }

    public void XoaThongTin(){

    }
    
    public void HienThi(){

    }

    public void TimKiem(){

    }
}
