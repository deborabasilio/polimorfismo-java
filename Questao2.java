// Documentação: Classe Aluno com atributos privados (encapsulamento)
class Aluno {
    
    // Atributos agora são privados
    private String nome;
    private String matricula;

    // Método Getter para o atributo 'nome'
    public String getNome() {
        return this.nome;
    }

    // Método Setter para o atributo 'nome'
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método Getter para o atributo 'matricula'
    public String getMatricula() {
        return this.matricula;
    }

    // Método Setter para o atributo 'matricula'
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Construtor para inicializar os atributos
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // Método toString para representação em string do objeto
    @Override
    public String toString() {
        return "Nome: " + nome + ", Matrícula: " + matricula;
    }
}

// Classe principal para testar a Questão 2
public class Questao2 {
    public static void main(String[] args) { 

        // 1. Criação do objeto Aluno usando o construtor
        Aluno meuAluno = new Aluno("Debora Basilio Ferreira", "24038824-5");

        // 2. Exibição dos dados iniciais usando toString
        System.out.println("--- Dados Iniciais ---");
        System.out.println(meuAluno.toString());

        // 3. Alterando o nome usando o setter, conforme solicitado
        meuAluno.setNome("Debora Basilio (Nome Alterado)");

        // 4. Exibindo novamente para confirmar a alteração usando toString
        System.out.println("\n--- Dados Após Alteração ---");
        System.out.println(meuAluno.toString());
    }
}