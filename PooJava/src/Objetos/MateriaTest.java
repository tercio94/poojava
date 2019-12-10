package Objetos;

import org.junit.Assert;
import org.junit.Test;

public class MateriaTest {

    @Test
    public void deveCriarMateriaPorMeiodoConstrutor() {
        String nome = "Materia Fake";
        String descricao = "Test Descricao";
        Double cargaHoraria = 3.5;
        Professor professor = new Professor("Test", "test@gmail.cm");
        Integer quantidadedeAulas = 10;

        Materia materia = new Materia(nome, descricao, cargaHoraria, professor, quantidadedeAulas);
        Assert.assertEquals(nome, materia.getnomeMateria());
        Assert.assertEquals(descricao, materia.getdescricao());
        Assert.assertEquals(cargaHoraria, materia.getcargaHoraria());
        Assert.assertEquals(professor, materia.getprofessor());
        Assert.assertEquals(quantidadedeAulas, materia.getQuantidadedeAulas());
    }
}
