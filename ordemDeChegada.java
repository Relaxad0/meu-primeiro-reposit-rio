    import java.util.LinkedList;
import java.util.Queue;
      
public class ordemDeChegada { 
    public static void main(String[] args) {
        Queue<String> clientes = new LinkedList<>();
        clientes.add("Cliente 1");
        clientes.add("Cliente 2");
        clientes.add("Cliente 3");

        System.out.println("Ordem de chegada: " + clientes);
        while (!clientes.isEmpty()) {
            System.out.println("Atendido: " + clientes.poll());
        }
    }
}
