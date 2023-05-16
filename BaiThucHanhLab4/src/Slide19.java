import java.util.ListIterator;
import java.util.ArrayList;
public class Slide19 {
    public static void main(String[] args) {
        ArrayList<Character> arrlc = new ArrayList<>();

        arrlc.add('a');
        arrlc.add('e');
        arrlc.add('b');
        arrlc.add('c');

        ListIterator<Character> listIterator = arrlc.listIterator();

        System.out.println("cac phantu co trong arrlc la:");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next() + "\t");
        }
    }
}
