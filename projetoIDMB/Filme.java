import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private LocalDate dataDeLancamento;
    private String orcamento;
    private String descricao;
    private Diretor diretor;
    private List<Ator> atores = new ArrayList<>();

    public Filme(){

    }

    public Filme(String nome, String descricao, LocalDate dataDeLancamento, String orcamento, Diretor diretor, List<Ator> atores) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataDeLancamento = dataDeLancamento;
        this.orcamento = orcamento;
        this.diretor = diretor;
        this.atores = atores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public String getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(String orcamento) {
        this.orcamento = orcamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }
}
