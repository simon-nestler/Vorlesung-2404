import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> liste = new ArrayList<Integer>();
        liste.add(4);
        liste.add(5);
        liste.add(4);
        liste.add(0);
        liste.add(8);
        liste.add(2);
        liste.add(3);
        liste.add(7);
        liste.add(1);
        liste.add(6);

        System.out.println(liste);
        bubbleSort(liste);
        System.out.println(liste);
    }

    public static void bubbleSort(ArrayList<Integer> liste) {

    }
}
