package m2s03ex03;

public class Contador {
    private String frase;

    public Contador(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return this.frase;
    }

    public int contarPalavras() {
        String[] palavras = this.frase.split("\\s+"); // Divide a frase em palavras usando espaços como delimitador
        return palavras.length;
    }
}
