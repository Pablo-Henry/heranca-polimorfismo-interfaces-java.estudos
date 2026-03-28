package GestaoEscolar;

public class AlunoPessoa extends Pessoa {

    private double nota;

    public AlunoPessoa(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public void exibirDados (){
        System.out.println(this.getNome() + " - " + "Idade: " + this.getIdade() + " - " + "Nota: " + this.getNota());
    }
}
