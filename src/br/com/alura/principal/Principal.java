package br.com.alura.principal;

import br.com.alura.classificacao.FiltroRecomendacao;
import br.com.alura.modelos.Musica;
import br.com.alura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica primeiraMusica = new Musica();
        primeiraMusica.setTitulo("This is why");
        primeiraMusica.setAno(2022);
        primeiraMusica.setAutor("Hayley Williams, Taylor York");
        primeiraMusica.setAlbum("This is why");
        primeiraMusica.setPerformista("Paramore");
        primeiraMusica.setDuracaoEmSegundos(200);

        Musica segundaMusica = new Musica();
        segundaMusica.setTitulo("Cancer");
        segundaMusica.setAno(2006);
        segundaMusica.setAutor("Gerard Way");
        segundaMusica.setAlbum("The Black Parade");
        segundaMusica.setPerformista("My Chemical Romance");
        segundaMusica.setDuracaoEmSegundos(235);

        Podcast primeiroPodcast = new Podcast();
        primeiroPodcast.setTitulo("Número 1");
        primeiroPodcast.setDuracaoEmSegundos(1000);
        primeiroPodcast.setAno(2021);
        primeiroPodcast.setApresentador("Laurinha Lero");
        primeiroPodcast.setProdutor("Laurinha Lero");
        primeiroPodcast.setSerie("Respondendo em voz alta");

        Podcast segundoPodcast = new Podcast();
        segundoPodcast.setTitulo("O Caso Fechado");
        segundoPodcast.setDuracaoEmSegundos(1560);
        segundoPodcast.setAno(2023);
        segundoPodcast.setApresentador("Paola Carosella");
        segundoPodcast.setProdutor("Folha de São Paulo");
        segundoPodcast.setSerie("Rádio Novelo Apresenta");

        for(int i = 0; i < 200; i++) {
            primeiraMusica.reproduzir();
        }
        for(int i = 0; i < 150; i++) {
            primeiraMusica.curtir();
        }

        for(int i = 0; i < 500; i++) {
            segundaMusica.reproduzir();
        }
        for(int i = 0; i < 200; i++) {
            segundaMusica.curtir();
        }

        for(int i = 0; i < 300; i++) {
            primeiroPodcast.reproduzir();
        }
        for(int i = 0; i < 200; i++) {
            primeiroPodcast.curtir();
        }

        for(int i = 0; i < 500; i++) {
            segundoPodcast.reproduzir();
        }

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        primeiraMusica.exibeFichaTecnica();
        filtro.filtra(primeiraMusica);
        segundaMusica.exibeFichaTecnica();
        filtro.filtra(segundaMusica);
        primeiroPodcast.exibeFichaTecnica();
        filtro.filtra(primeiroPodcast);
        segundoPodcast.exibeFichaTecnica();
        filtro.filtra(segundoPodcast);

    }
}