import java.util.ArrayList;
import java.util.Arrays;

public class RemoverDuplicados {

    public static <T> ArrayList<T> removerDuplicados(ArrayList<T> lista) {
        ArrayList<T> resultado = new ArrayList<>();
        for (T item : lista) {
            if (!resultado.contains(item)) {
                resultado.add(item);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        ArrayList<String> contatos = new ArrayList<>(Arrays.asList("Ana", "João", "Ana", "Pedro", "João"));
        System.out.println("Lista original: " + contatos);
        System.out.println("Sem duplicados: " + removerDuplicados(contatos));
    }
}