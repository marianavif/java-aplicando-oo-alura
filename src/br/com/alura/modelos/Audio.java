package br.com.alura.modelos;

public class Audio {
    private String titulo;
    private int duracaoEmSegundos;
    private int ano;
    private double totalReproducoes;
    private double totalCurtidas;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getTotalReproducoes() {
        return totalReproducoes;
    }

    public void reproduzir() {
        this.totalReproducoes++;
    }

    public double getTotalCurtidas() {
        return totalCurtidas;
    }

    public void curtir() {
        this.totalCurtidas++;
    }

    public String duracaoEmMinutos(int duracaoEmSegundos) {
        String duracao = String.format("%dmin %ds", (duracaoEmSegundos/60), (duracaoEmSegundos%60));
        return duracao;
    }

    public int getClassificacao() {
        return (int) (this.getTotalCurtidas()/this.getTotalReproducoes()*100);
    }

    public void exibeFichaTecnica() {
        System.out.printf("""
                Título: %s
                Duração: %s
                Ano: %d
                Classificação: %d%c
                """, titulo, duracaoEmMinutos(duracaoEmSegundos), ano, this.getClassificacao(),'%');

    }
}
