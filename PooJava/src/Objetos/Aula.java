package Objetos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aula {
    private Date data;
    private Materia materia;
    private List<Aluno> alunos = new ArrayList<>();

    public Aula(Date data, Materia materia, List alunos) {
        if (data == null) {
            throw new CampoNaoPodeSerNulo("data não pode ser nula");
        }
        if (materia == null) {
            throw new CampoNaoPodeSerNulo("materia não pode ser nula");
        }

        this.data = data;
        this.materia = materia;
        this.alunos = alunos;
    }
    public void darPresenca (Aluno aluno) {
        this.alunos.add(aluno);
        if (alunos == null) {
            throw new CampoNaoPodeSerNulo("alunos não pode ser nulo");
        }


    }

    public Date getData() {
        return data;
    }

    public Materia getMateria() {
        return materia;
    }

    public List<Aluno> getListaAlunos() { return alunos;}


    @Override
    public String toString() {
        return "Aula{" +
                "data=" + data +
                ", materia=" + materia +
                ", alunos=" + alunos +
                '}';
    }
}
