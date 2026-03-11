// Documentação: Classe base Pessoa com o método apresentar()
class Pessoa {
    protected String nome;

    // Construtor para inicializar o nome
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Método base que será sobrescrito
    public String apresentar() {
        return "Olá, meu nome é " + this.nome + ".";
    }
}

// Documentação: Classe Aluno herda de Pessoa e sobrescreve apresentar()
class Aluno extends Pessoa {
    private String curso;

    // Construtor para inicializar nome e curso
    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    // Sobrescrita (Override) do método apresentar()
    // Esta é a demonstração de polimorfismo
    @Override
    public String apresentar() {
        return "Olá! Eu sou a aluna " + super.nome + " do curso " + this.curso + ".";
    }
}

// Documentação: Classe Professor herda de Pessoa e sobrescreve apresentar()
class Professor extends Pessoa {
    private String disciplina;

    // Construtor para inicializar nome e disciplina
    public Professor(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }

    // Sobrescrita (Override) do método apresentar()
    @Override
    public String apresentar() {
        return "Bom dia, eu sou o professor " + this.nome + " e leciono " + this.disciplina + ".";
    }
}

// Classe principal para testar a Questão 4
public class Questao4 {
    public static void main(String[] args) {

        // 1. Criar objeto Aluno com seus dados
        Aluno meuAluno = new Aluno("Debora Basilio Ferreira", "Analise e Desenvolvimento de Sistemas");

        // 2. Criar objeto Professor com dados fictícios
        Professor meuProfessor = new Professor("Dr. Silva", "Programação Orientada a Objetos");

        // 3. Chamar os métodos apresentar() de ambos os objetos
        // A JVM decide em tempo de execução qual método 'apresentar()' chamar
        // (o de Aluno ou o de Professor), demonstrando o polimorfismo.
        System.out.println(meuAluno.apresentar());
        System.out.println(meuProfessor.apresentar());
    }
}