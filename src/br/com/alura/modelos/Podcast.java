package br.com.alura.modelos;

public class Podcast extends Audio {
    private String produtor;
    private String apresentador;
    private String serie;

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.printf("""
                Apresentador(es): %s
                Série: %s
                Produtor(es): %s \n
                """, apresentador, serie, produtor);
    }
}
