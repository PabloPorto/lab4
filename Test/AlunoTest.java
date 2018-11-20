import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    private String matricula = "101010";
    private String nome = "Pablo";
    private String curso = "Conputação";


    @Test
    void getMatricula() {
        assertEquals("101010",matricula);
    }

    @Test
    void getNome() {
        assertTrue(nome.equals("Pablo") );
    }

    @Test
    void getCurso() {
        assertTrue(curso.equals("Computação"));
    }

}