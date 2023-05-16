import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
public class Slide18 {
    public static void main(String[] args) {
        ArrayList<Float> arrlf = new ArrayList<>();

        arrlf.add(0.7f);
        arrlf.add(7.26f);
        arrlf.add(1.02f);
        arrlf.add(9.3f);

        Iterator<Float> iterator = arrlf.iterator();

        System.out.println("cac phan tu trong arrlf la :");
        while (iterator.hasNext()){
            System.out.println(iterator.next() + "\t");
        }
    }
}
