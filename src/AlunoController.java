import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlunoController {
    private Map <String, Aluno> alunos;
    private Map <String, Grupo> grupos;
    private List<Aluno> responderamQuestoes;

    public AlunoController() {
        this.alunos = new HashMap<>();
        this.grupos = new HashMap<>();
        this.responderamQuestoes = new ArrayList<>();
    }

    public void cadastraAluno(Aluno aluno){
        if (alunos.containsKey(aluno.getMatricula())){
            System.out.println("Matrícula já cadastrada!");
        }
        else{
            alunos.put(aluno.getMatricula(),aluno);
            System.out.println("CADASTRO REALIZADO!");
        }

    }

    public void consultaAluno(String matricula){
        if (alunos.containsKey(matricula)){
            System.out.println(alunos.get(matricula).toString());
        }
        else {
            System.out.println("Aluno não cadastrado");
        }
    }

    public void cadastraGrupo(Grupo grupo){
        if (grupos.containsKey(grupo.getNome())){
            System.out.println("Grupo já cadastrado!");
        }
        else{
            grupos.put(grupo.getNome(), grupo);
            System.out.println("CADASTRO REALIZADO!");
        }

    }

    public void alocaAuno(String nome, String matricula){
        if(grupos.containsKey(nome)){
            grupos.get(nome).alocaAluno(alunos.get(matricula));
            System.out.println("Aluno Cadastrado!");
        }
        else if (alunos.containsKey(matricula) == false){
            System.out.println("Aluno não cadastrado!");
        }
        else{
            System.out.println("Grupo não cadastrado!");
        }
    }

    public void imprimeGrupo(String nome){
        if(grupos.containsKey(nome)){
            System.out.println(grupos.get(nome).imprimeGrupo());
        }
        else{
            System.out.println("Grupo não cadastrado!");
        }
    }

    public void cadastraQuemRespondeu(String matricula){
        if (alunos.containsKey(matricula)) {
                responderamQuestoes.add(alunos.get(matricula));
        }
        else{
            System.out.println("Aluno não cadastrado!");
        }
    }

    public void listaQuemRespondeu(){
        int i = 1;
        String lista = "Alunos: \n";
        for (Aluno x : responderamQuestoes){
            lista += i + "." + x.toString() + "\n";
        }
        System.out.println(lista);
    }

    public void mostrarMenu() {
        System.out.print("(C)adastrar Aluno" + "\n" +
                "(E)xibir Aluno" + "\n" +  "(N)ovo Grupo" + "\n" +
                "(A)locar Aluno no Grupo e Imprimir Grupos" + "\n" +
                "(R)egistrar Aluno que Respondeu" + "\n" +
                "(I)mprimir Alunos que Responderam" + "\n" +
                "(O)ra, vamos fechar o programa!" + "\n" +
                " " + "\n" +
                "Opção> ");
    }
}
