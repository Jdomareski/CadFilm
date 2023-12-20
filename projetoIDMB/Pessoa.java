import java.time.LocalDate;
public abstract class Pessoa {
    private String nome;
    private LocalDate dataDeNascimento;
    private String genero;
    public Pessoa(){
    }
    public Pessoa(String nome, LocalDate dataDeNascimento, java.lang.String genero) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.genero = genero;
    }
    public java.lang.String getNome() {
        return nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public java.lang.String getGenero() {
        return genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
