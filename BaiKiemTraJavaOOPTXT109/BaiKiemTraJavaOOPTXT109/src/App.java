public class App {
    public static void main(String[] args) throws Exception {
        TXT109Student std = new TXT109Student();
        std.NhapThongTin();
        std.ThemThongTin(null, 0, 0);
        std.SuaThongTin(null, 0, 0);
        std.XoaThongTin();
        std.HienThi();
        std.TimKiem();
    }
}
