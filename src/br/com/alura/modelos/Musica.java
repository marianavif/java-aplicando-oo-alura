package br.com.alura.modelos;

public class Musica extends Audio {
    private String performista;
    private String autor;
    private String album;

    public String getPerformista() {
        return performista;
    }

    public void setPerformista(String performista) {
        this.performista = performista;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
        System.out.printf("""
                Artista(s): %s
                Álbum: %s
                Autor(es): %s \n
                """, performista,album,autor);
    }
}
