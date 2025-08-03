public class exemploDadosPrimitivos{
    public static void main(String[] args){
        //  Número inteiro
        byte valorByte = 127; // -128 - 127
        short valorShort = 32767; // -32768 - 32767
        int valorInt = 2147483647; // -2147483648 - 2147483647
        long valorLong = 9223372036854775807L; // -9223372036854775808L - 9223372036854775807L // O uso do "L" é obrigatório e tem que ser maiuscúlo
          // Números Flutuantes
        float valorFloat = 3.14f; // o "f" minusculo é necessário 
        double valorDouble = 3.14159265359;
        
        //Tipos de caracteres

        char character = 'a';

        // Tipo Booleano
        boolean verdadeiro = true;
        boolean falso = false;
        

        System.out.println(valorByte);
        System.out.println(valorShort);
        System.out.println(valorInt);
        System.out.println(valorLong);
        System.out.println(valorFloat);
        System.out.println(valorDouble);
        System.out.println(character);
        System.out.println(verdadeiro);
        System.out.println(falso);

    }
}