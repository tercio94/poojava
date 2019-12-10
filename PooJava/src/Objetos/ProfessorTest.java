package Objetos;

import org.junit.Assert;
import org.junit.Test;

public class ProfessorTest {

    @Test
    public void deveCriarProfessorPorMeiodoConstrutor() {
        String email = "email.fake@gmai.com";
        String nome = "Fake";
        Professor professor = new Professor(nome, email);
        Assert.assertEquals(email, professor.getEmail());
        Assert.assertEquals(nome, professor.getNome());
    }

}
