package Objetos;

public class Materia {

    public String nome;
    public String descricao;
    public Double cargaHoraria;
    public Professor professor;
    public Integer quantidadeAulas;


    public String getnomeMateria() {
        return nome;
    }

    public String getdescricao() {
        return descricao;
    }

    public Double getcargaHoraria() {
        return cargaHoraria;
    }

    public Professor getprofessor() {
        return professor;
    }

    public Integer getQuantidadedeAulas() {
        return quantidadeAulas;
    }

    public Materia(String nome, String descricao, Double cargaHoraria, Professor professor, Integer quantidadeAulas) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        this.quantidadeAulas = quantidadeAulas;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", professor=" + professor +
                ", quantidadeAulas=" + quantidadeAulas +
                '}';
    }

}


