import java.util.Stack;

public class expressao {

    public static boolean verificarExpressao(String exp) {
        Stack<Character> pilha = new Stack<>();
        for (char c : exp.toCharArray()) {
            if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                if (pilha.isEmpty()) return false;
                pilha.pop();
            }
        }
        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        String expressao = "(2+3)*(5+(6-1))";
        System.out.println("Expressão: " + expressao);
        System.out.println("Balanceada? " + verificarExpressao(expressao));
    }
}