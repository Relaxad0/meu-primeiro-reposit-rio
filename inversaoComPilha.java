import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class inversaoComPilha {

    public static <T> ArrayList<T> inverterComPilha(ArrayList<T> lista) {
        Stack<T> pilha = new Stack<>();
        for (T item : lista) pilha.push(item);

        ArrayList<T> invertida = new ArrayList<>();
        while (!pilha.isEmpty()) invertida.add(pilha.pop());

        return invertida;
    }

    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<>(Arrays.asList("TV", "Notebook", "Celular", "Tablet"));
        System.out.println("Lista original: " + produtos);
        System.out.println("Lista invertida com pilha: " + inverterComPilha(produtos));
    }
}