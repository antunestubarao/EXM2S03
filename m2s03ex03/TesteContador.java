package m2s03ex03;

public class TesteContador {
    public static void main(String[] args) {
        Contador contador = new Contador("O rato roeu a roupa do rei de Roma");

        int quantidadePalavras = contador.contarPalavras();
        String frase = contador.getFrase();
        System.out.println("A frase '" + frase + "' possui " + quantidadePalavras + " palavras.");
    }
}
