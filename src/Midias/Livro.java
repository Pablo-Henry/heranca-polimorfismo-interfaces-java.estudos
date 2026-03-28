package Midias;

public class Livro extends Midia {

    private String autor;

    public Livro(String titulo, int ano, String autor) {
        super(titulo, ano);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }


    @Override
    public void exibeInfos() {
        System.out.println("LIB-" + this.getTitulo().substring(0,3) + this.getAno() + " | " + "Livro: " + this.getTitulo() + " - " + "Autor: " + this.getAutor());
    }



}
