package padrao.prototype;

public class Pessoa implements Cloneable {
    private String nome;
    private int idade;
    private String localNascimento;
    private IdInfo idInfo;

    public Pessoa(String nome, int idade, String localNascimento, IdInfo idInfo) {
        this.nome = nome;
        this.idade = idade;
        this.localNascimento = localNascimento;
        this.idInfo = idInfo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public IdInfo getIdInfo() {
        return idInfo;
    }

    public void setIdInfo(IdInfo idInfo) {
        this.idInfo = idInfo;
    }

    @Override
    public Pessoa clone() throws CloneNotSupportedException {
        Pessoa pessoaClone = (Pessoa) super.clone();
        pessoaClone.idInfo = (IdInfo) pessoaClone.idInfo.clone();
        return pessoaClone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome=" + nome +
                ", idade=" + idade +
                ", localNascimento=" + localNascimento +
                ", idInfo=" + idInfo + '}';
    }
}
