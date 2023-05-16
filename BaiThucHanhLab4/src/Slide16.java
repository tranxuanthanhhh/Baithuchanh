import java.util.ArrayList;
public class Slide16 {
public static void main(String[] args) {
    ArrayList<String> arrListString = new ArrayList<String>();
    
    arrListString.add("JAVA");
    arrListString.add("PHP");
    arrListString.add("C#");
    arrListString.add("C++");

    System.out.println("cac phan tu co trong mang arrListString la: ");
    for (int i = 0; i < arrListString.size(); i++){
        System.out.println(arrListString.get(i) + "\t");
    }
    }
}

    

