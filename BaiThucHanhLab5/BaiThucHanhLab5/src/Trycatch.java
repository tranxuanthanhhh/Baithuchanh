import java.util.Scanner;

public class Trycatch {
    public static void main(String[] args) {
        try{
            String s = null;
            System.out.println(s.length());
            System.out.println("trong khoi try");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
