import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        int m, n;       
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("so hang: ");
        m = scanner.nextInt();
        System.out.println("so cot: ");
        n = scanner.nextInt();
        int A[][] = new int[m][n];       
        System.out.println("nhap cac phan tu: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("ma tran vua nhap:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int max = A[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }
       System.out.println("phantu lon nhat trong matran la: " + max);
    }
}