package AlunoBolsista;

public class Aluno {

    /*
    Você está construindo um sistema acadêmico para uma escola. Cada aluno possui um nome e pode ser identificado no sistema com uma mensagem padrão. A escola também possui alunos bolsistas. Para deixar o sistema mais informativo, queremos exibir o tipo do aluno no momento da identificação, como "bolsista" ou "regular".

Crie um programa que:

Defina uma classe Aluno com nome e tipo.
Crie um método identificar() que que imprime: "Aluno: [nome] - Tipo: [tipo]".
Crie uma classe Bolsista que herda de Aluno e define o tipo automaticamente como "bolsista". Crie um objeto Aluno regular e um Bolsista, e chame o método identificar() de cada um.
    */

    private String nome;
    private String tipo;

    public Aluno(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public void indentificar(){
        System.out.println("Aluno: " + this.getNome() + " - " + "Tipo: " + this.getTipo());
    }

}
