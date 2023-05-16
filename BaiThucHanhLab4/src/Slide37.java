import java.util.LinkedList;
public class Slide37 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("java");
        list.add("C++");
        list.add("PHP");
        list.add("java");

        System.out.println("vi du su dung phuong thuc addAll()");
        System.out.println("-------------------------------");
        LinkedList<String> listA = new LinkedList<>();
        listA.add("list");
        System.out.print("listA");
        showList(listA);

        System.out.println("\nvi du su dung phuong thuc retainAll()");
        System.out.println("-------------------------------");
        LinkedList<String> listB = new LinkedList<>();
        listB.add("java");
        listA.retainAll(listB);
        System.out.println("listA");
        showList(listA);

        System.out.println("\nvi du ve phuong thuc removeAll()");
        System.out.println("-------------------------------");
        list.removeAll(listB);
        System.out.println("list:");
        showList(list);
    }
    public static void showList(LinkedList<String> list){
        for (String obj : list) {
            System.out.println("\t" + ",");
        }
        System.out.println();
    }
}
