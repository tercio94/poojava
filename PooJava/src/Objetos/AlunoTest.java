package Objetos;


import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class AlunoTest {

    @Test
    public void deveJogarExceptionComEmailNulo() {
        String nome = "Fake";
        try {
            Aluno aluno = new Aluno(null, nome);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo) {
            Assert.assertEquals("email não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveJogarExceptionComNomeNulo() {
        String email = "test@gmail.com";
        try {
            Aluno aluno = new Aluno(email, null);
        } catch (CampoNaoPodeSerNulo naoPodeSerNulo) {
            Assert.assertEquals("nome não pode ser nulo", naoPodeSerNulo.getMessage());
        }
    }

    @Test
    public void deveCriarAlunoPorMeioDoConstrutor() {
        String email = "email.fake@gmai.com";
        String nome = "Fake";
        Aluno aluno = new Aluno(email, nome);
        Assert.assertEquals(email, aluno.getEmail());
        Assert.assertEquals(nome, aluno.getNome());
    }

}





