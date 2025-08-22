import java.util.HashMap;
import java.util.Map;

public class MesclarMapas {

    public static Map<String, Integer> mesclarMapas(Map<String, Integer> m1, Map<String, Integer> m2) {
        Map<String, Integer> resultado = new HashMap<>(m1);
        for (String chave : m2.keySet()) {
            resultado.put(chave, resultado.getOrDefault(chave, 0) + m2.get(chave));
        }
        return resultado;
    }

    public static void main(String[] args) {
        Map<String, Integer> estoque1 = new HashMap<>();
        estoque1.put("ProdutoA", 5);
        estoque1.put("ProdutoB", 3);

        Map<String, Integer> estoque2 = new HashMap<>();
        estoque2.put("ProdutoB", 2);
        estoque2.put("ProdutoC", 7);

        System.out.println("Mapa mesclado: " + mesclarMapas(estoque1, estoque2));
    }
}