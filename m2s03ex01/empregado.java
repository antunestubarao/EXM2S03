package m2s03ex01;

public class Empregado {
    private String nome;
    private String cpf;
    private double salario;

    public Empregado(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void promover(float percentualAumento) {
        double aumento = this.salario * (percentualAumento / 100);
        this.salario += aumento;
    }

    public static void main(String[] args) {
        Empregado empregado = new Empregado("Rodrigo Antunes", "12345678912", 3000);

        System.out.println("Funcionario: " + empregado.nome);
        System.out.println("CPF: " + empregado.cpf);

        System.out.println("Salário antes do aumento: R$" + empregado.salario);

        empregado.promover(10);

        System.out.println(System.lineSeparator());

        System.out.println("incremento salarial de 10%");

        System.out.println(System.lineSeparator());

        System.out.println("Salário após o aumento: R$" + empregado.salario);
    }
}
