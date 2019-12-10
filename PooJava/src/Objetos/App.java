package Objetos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("tercio25@gmail.com", "Tercio Rodrigues");
        Aluno aluno2 = new Aluno( "joaosilva@gmail.com", "João Silva");
        Professor professor = new Professor ( "igorsantos@gmail.com", "Igor Santos");
        Materia materia1 = new Materia(
                "Materia Test",
                "Descrição Materia",
                10.5,
                 professor,
                3);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);

        Date data = new Date();
        Aula aula = new Aula(
                data,
                materia1,
                alunos);

        System.out.println(aula);
    }
}


