package Midias;

public class Revista extends Midia {
    private int edicao;

    public Revista(String titulo, int ano, int edicao) {
        super(titulo, ano);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }


    @Override
    public void exibeInfos() {
        System.out.println("LIB-" + this.getTitulo().substring(0,3) + this.getAno() + " | " + "Revista: " + this.getTitulo() + " - " + "Edição: " + this.getEdicao());
    }
}
