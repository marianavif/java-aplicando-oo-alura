package br.com.alura.classificacao;

import br.com.alura.modelos.Audio;

public class FiltroRecomendacao {

    public void filtra(Audio audio) {
        if (audio.getClassificacao() >= 80) {
            System.out.println("Sucesso nas redes!");
        } else if (audio.getClassificacao() >= 60) {
            System.out.println("Bom de ouvir!");
        } else {
            System.out.println("Bota pra tocar!");
        }
    }



}
