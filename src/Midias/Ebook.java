package Midias;

public class Ebook extends Midia {
    private String formato;

    public Ebook(String titulo, int ano, String formato) {
        super(titulo, ano);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    @Override
    public void exibeInfos() {
        System.out.println("LIB-" + this.getTitulo().substring(0,3) + this.getAno() + " | " + "Ebook: " + this.getTitulo() + " - " + "Formato: " + this.getFormato());
    }
}
