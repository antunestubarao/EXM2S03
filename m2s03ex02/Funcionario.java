package m2s03ex02;

public class Funcionario {
    private String nome;
    private float salario;

    // Construtor que recebe apenas o nome
    public Funcionario(String nome) {
        this.nome = nome;
    }

    // Construtor que recebe nome e salário
    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método para aumentar o salário
    public void aumentar(float valorAumento) {
        this.salario += valorAumento;
    }

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Rodrigo");
        System.out.println("Funcionário: " + funcionario1.nome);
        System.out.println(System.lineSeparator());

        Funcionario funcionario2 = new Funcionario("Rosangela", 3000.0f);
        System.out.println("Funcionário: " + funcionario2.nome + ", Salário: R$" + funcionario2.salario);

        funcionario2.aumentar(500.0f);
        System.out.println("Aumento de R$500,00 concedido a Rosangela.");
        System.out.println("Novo salário de Rosangela após aumento: R$" + funcionario2.salario);
    }
}