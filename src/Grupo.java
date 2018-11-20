import java.util.HashSet;

public class Grupo {
    private String nome;
    private HashSet<Aluno> grupoDeEstudo = new HashSet<>();

    public Grupo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void alocaAluno(Aluno aluno){
        grupoDeEstudo.add(aluno);
    }

    public String imprimeGrupo(){
        String lista = "";
        for (Aluno x : grupoDeEstudo){
            lista += x.getMatricula() + " - " +
                    x.getNome() + " - " +
                    x.getCurso() + "\n";
        }
        return lista;
    }
}
