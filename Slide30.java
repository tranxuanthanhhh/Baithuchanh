public class Slide30 {
    public static void main(String[] args) {
        int n, sodu, tong = 0;
        Scanner scanner = new Scanner(System.in);
             
        System.out.println("nhap vao so nguyen duong bat ki: ");
        n = scanner.nextInt();
             
        while (n > 0) {
            soDu = n % 10;
            n = n / 10;
            tong += sodu;
        }
             
        System.out.println("tong cac chu so = " + tong);
    }
}
