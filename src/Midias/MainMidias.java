package Midias;

public class MainMidias {
    static void main(String[] args) {
        Livro livro = new Livro("nsei", 1887, "sein");
        Revista revista = new Revista("nsei", 1978, 245);
        Ebook ebook= new Ebook("nsei", 1987, "pdf");


        livro.exibeInfos();
        revista.exibeInfos();
        ebook.exibeInfos();

    }
}
