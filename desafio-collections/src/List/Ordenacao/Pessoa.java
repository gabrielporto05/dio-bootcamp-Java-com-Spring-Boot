package List.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int idade;
    private int alturCM;

    public Pessoa(String nome, int idade, int alturCM) {
        this.nome = nome;
        this.idade = idade;
        this.alturCM = alturCM;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(this.idade, pessoa.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getAlturCM() {
        return alturCM;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", alturCM=" + alturCM +
                '}';
    }

}

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Integer.compare(p1.getAlturCM(), p2.getAlturCM());
    }

}
