import java.util.LinkedList;
import java.util.Queue;

public class filaAtendimento {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Cliente 1");
        fila.add("Cliente 2");
        fila.add("Cliente 3");

        System.out.println("Fila inicial: " + fila);

        System.out.println("Atendido: " + fila.poll());
        System.out.println("Fila atualizada: " + fila);
    }
}