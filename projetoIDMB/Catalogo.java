import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Catalogo {
    private List<Filme> listaFilmes;
    private List<Ator> listaAtores;

    private List<Diretor> listaDiretores;

    public Catalogo() {
        listaFilmes = new ArrayList<>();
        listaAtores = new ArrayList<>();
        listaDiretores = new ArrayList<>();
    }

    public void cadastrarFilme(Filme filme) {
        if (!listaFilmes.contains(filme))
            listaFilmes.add(filme);
    }

    public void cadastrarAtor(Ator ator) {
        if (!listaAtores.contains(ator)) {
            listaAtores.add(ator);
        }

    }

    public void cadastrarDiretor(Diretor diretor) {
        if (!listaDiretores.contains(diretor)) {
            listaDiretores.add(diretor);
        }
    }


    public void associarFilmeDiretor(Filme filme, Diretor diretor) {
        filme.setDiretor(diretor);
    }

    public void associarFilmeAtor(Filme filme, Ator ator) {
        if(filme.getAtores() == null){
            filme.setAtores(new ArrayList<>());
        }
        if (!filme.getAtores().contains(ator))
            filme.getAtores().add(ator);
    }

    public Filme pesquisarFilme(String nome) {
        for (Filme filme : listaFilmes) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                return filme;
            }
        }
        return null;

    }

    public String listarFilmes() {
        String result = "Lista de Filmes";
        for (Filme filme : listaFilmes) {
            result += "\nNome do filme:  " + filme.getNome();
            result += "\nData de Lançamento: " + filme.getDataDeLancamento();
            result += "\nOrçamento: " + filme.getOrcamento();
            result += "\nDescrição: " + filme.getDescricao();
            result += "\nDiretor: " + filme.getDiretor().getNome();
            result += "\nAtores: ";
            for(Ator ator: filme.getAtores()){
                result += ator.getNome() + "||" + ator.getDataDeNascimento() + "||" + ator.getGenero() + "; "  ;
            }



        }
        return result;


    }
}
