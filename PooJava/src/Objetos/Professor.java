package Objetos;

public class Professor extends Pessoa {

    public Double salario;

    public Professor (String nome, String email) {
        super (nome, email);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "salario=" + salario +
                '}';
    }
}
