// Documentação: Classe para representar um Aluno
// Contém os atributos solicitados na Questão 1
class Aluno {
    private String nome;
    private String matricula;

    // Construtor
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    // Método toString para exibir os dados
    @Override
    public String toString() {
        return "Nome: " + nome + "\nMatrícula: " + matricula;
    }
}

// Classe principal para testar a Questão 1
public class Questao1 {
    public static void main(String[] args) {

        // 1. Criação (instanciação) do objeto Aluno com construtor
        Aluno meuAluno = new Aluno("Debora Basilio Ferreira", "24038824-5");

        // 2. Exibição dos dados no console conforme solicitado
        System.out.println(meuAluno.toString());
    }
}