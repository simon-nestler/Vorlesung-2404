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
    }

    public static void bubbleSort(ArrayList<Integer> liste) {
        boolean swap = true;

        while (swap) {
            swap = false;
            for (int i = 0; i < liste.size() - 1; i++) {
                if (liste.get(i) > liste.get(i + 1)) {
                    int temp = liste.get(i);
                    liste.set(i, liste.get(i + 1));
                    liste.set(i + 1, temp);
                    swap = true;
                }
            }
            System.out.println(liste);
        }
    }
}
