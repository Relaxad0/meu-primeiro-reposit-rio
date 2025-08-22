import java.util.ArrayList;
import java.util.Arrays;

public class inversaoLista {

    public static <T> ArrayList<T> inverterLista(ArrayList<T> lista) {
        ArrayList<T> invertida = new ArrayList<>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            invertida.add(lista.get(i));
        }
        return invertida;
    }

    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>(Arrays.asList("Estudar", "Treinar", "Comer", "Dormir"));
        System.out.println("Lista original: " + tarefas);
        System.out.println("Lista invertida: " + inverterLista(tarefas));
    }
}