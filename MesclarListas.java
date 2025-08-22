import java.util.ArrayList;
import java.util.Arrays;

public class MesclarListas {

    public static <T> ArrayList<T> mesclarListas(ArrayList<T> l1, ArrayList<T> l2) {
        ArrayList<T> resultado = new ArrayList<>();
        int max = Math.max(l1.size(), l2.size());

        for (int i = 0; i < max; i++) {
            if (i < l1.size()) resultado.add(l1.get(i));
            if (i < l2.size()) resultado.add(l2.get(i));
        }

        return resultado;
    }

    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ArrayList<String> lista2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));

        System.out.println("Lista mesclada: " + mesclarListas(lista1, lista2));
    }
}