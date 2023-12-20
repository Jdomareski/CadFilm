import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.time.LocalDate.*;

public class app {

    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        Diretor diretor = new Diretor("Ze Corisco", LocalDate.of(1970,12,12), "Masculino");
        catalogo.cadastrarDiretor(diretor);


        Ator ator1 = new Ator("Xico Zulu", LocalDate.of(2012,12,12), "Masculino");
        catalogo.cadastrarAtor(ator1);

        Ator ator2 = new Ator("Pezão", LocalDate.of(2015,04,07), "Masculino");
        catalogo.cadastrarAtor(ator2);


//        catalogo.cadastrarFilme(new Filme("O Poderoso Chefinho", "Um filme sobre um garoto chato",
//                LocalDate.of(2023, 2, 24), "10.000.000 USD",
//                diretor,
//                new ArrayList<>(List.of(ator1, ator2))));


        Filme filme = new Filme("O Poderoso Chefinho", "Um filme sobre um garoto chato",
                LocalDate.of(2023, 2, 24), "10.000.000 USD",
                null,
                null);


        catalogo.associarFilmeDiretor(filme, diretor);
        catalogo.associarFilmeAtor(filme, ator1);
        catalogo.associarFilmeAtor(filme, ator2);


        catalogo.cadastrarFilme(filme);


        System.out.println(catalogo.listarFilmes());
    }


}