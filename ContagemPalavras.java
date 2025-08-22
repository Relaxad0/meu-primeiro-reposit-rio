import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    public static Map<String, Integer> contagemPalavras(String frase) {
        Map<String, Integer> mapa = new HashMap<>();
        String[] palavras = frase.toLowerCase().split(" ");

        for (String p : palavras) {
            mapa.put(p, mapa.getOrDefault(p, 0) + 1);
        }

        return mapa;
    }

    public static void main(String[] args) {
        String frase = "o rato roeu a roupa do rei rato";
        System.out.println("Contagem de palavras: " + contagemPalavras(frase));
    }
}