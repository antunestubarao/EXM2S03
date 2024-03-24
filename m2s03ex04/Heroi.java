package m2s03ex04;

public class Heroi {
    private String nome;
    private String superpoder;
    private String nomeDaVidaReal;
    private String universo;

    public Heroi(String nome, String superpoder, String nomeDaVidaReal, String universo) {
        this.nome = nome;
        this.superpoder = superpoder;
        this.nomeDaVidaReal = nomeDaVidaReal;
        this.universo = universo;
    }

    public void atacar() {
        System.out.println(this.nome + " está atacando!");
    }

    public void defender() {
        System.out.println(this.nome + " está defendendo!");
    }

    public static void main(String[] args) {
        Heroi heroiMarvel = new Heroi("Doutor Estranho", "Manipulaçao de magia e feitiçaria", "Stephen Strange",
                "Marvel");
        Heroi heroiDC = new Heroi("Mulher-Elastico", "Capacidade de esticar e distorcer seu corpo.", "Bruce Wayne",
                "DC Comics - DOM Patrol");

        System.out.println("Herói da Marvel:");
        System.out.println("Nome: " + heroiMarvel.nome);
        System.out.println("Superpoder: " + heroiMarvel.superpoder);
        System.out.println("Nome da Vida Real: " + heroiMarvel.nomeDaVidaReal);
        System.out.println("Universo: " + heroiMarvel.universo);
        heroiMarvel.atacar();

        System.out.println("\nHerói da DC Comics:");
        System.out.println("Nome: " + heroiDC.nome);
        System.out.println("Superpoder: " + heroiDC.superpoder);
        System.out.println("Nome da Vida Real: " + heroiDC.nomeDaVidaReal);
        System.out.println("Universo: " + heroiDC.universo);
        heroiDC.defender();
    }
}
