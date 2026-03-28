package GestaoEscolar;

public class MainADP {

    public static void main(String[] args) {
        AlunoPessoa aluno = new AlunoPessoa("Henry", 21, 10.0);

        AlunoPessoa aluno2 = new AlunoPessoa("Ananda", 11, 10.0);

        Docente docente = new Docente("Aline", 21, "Matemática");

        Docente docente2 = new Docente("Laura", 25, "Português");

        docente.exibirDados();
        docente2.exibirDados();

        aluno.exibirDados();
        aluno2.exibirDados();

    }

}
