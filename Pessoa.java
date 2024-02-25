public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private double altura;
    private double peso;

    // Construtor
    public Pessoa(String nome, String cpf, int idade, double altura, double peso) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    // Método para imprimir os dados da pessoa
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }

    // Método principal
    public static void main(String[] args) {
        // Criando uma instância de pessoa
        Pessoa pessoa = new Pessoa("Nátali Isaltino Gomes", "123.456.789-10", 25, 1.70, 60.5);

        // Imprimindo os dados da pessoa
        pessoa.imprimirDados();
    }
}

