import java.util.Scanner;

public class Sistema {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        AlunoController alunoController = new AlunoController();
        alunoController.mostrarMenu();
        String matricula;

        char opcao = sc.nextLine().charAt(0);

        while (opcao != 'O'){

            if (opcao == 'C'){
                System.out.print("Matricula: ");
                matricula = sc.nextLine();
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Curso: ");
                String curso = sc.nextLine();

                alunoController.cadastraAluno(new Aluno(matricula,nome,curso));
                System.out.println();
                alunoController.mostrarMenu();
                opcao = sc.nextLine().charAt(0);

            }

            else if(opcao == 'E'){
                System.out.print("Matricula: ");
                matricula = sc.nextLine();
                alunoController.consultaAluno(matricula);
                alunoController.mostrarMenu();
                opcao = sc.nextLine().charAt(0);

            }

            else if (opcao == 'N'){
                System.out.print("Grupo: ");
                String nome = sc.nextLine();
                alunoController.cadastraGrupo(new Grupo(nome));
                alunoController.mostrarMenu();
                opcao = sc.nextLine().charAt(0);

            }

            else if (opcao == 'A'){
                System.out.print("(A)locar Aluno ou (I)mprimir Grupo? " );
                char escolha = sc.nextLine().charAt(0);
                if (escolha == 'A') {
                    System.out.print("Matricula: ");
                    matricula = sc.nextLine();
                    System.out.print("Grupo: ");
                    String nome = sc.nextLine();
                    alunoController.alocaAuno(nome, matricula);
                    alunoController.mostrarMenu();
                    opcao = sc.nextLine().charAt(0);
                }

                else if (escolha == 'I'){
                        System.out.print("Grupo: ");
                        String grupo = sc.nextLine();
                        alunoController.imprimeGrupo(grupo);
                        alunoController.mostrarMenu();
                        opcao = sc.nextLine().charAt(0);
                }

            }

            else if(opcao == 'R'){
                System.out.print("Matricula: ");
                matricula = sc.nextLine();
                alunoController.cadastraQuemRespondeu(matricula);
                alunoController.mostrarMenu();
                opcao = sc.nextLine().charAt(0);

            }

            else if (opcao == 'I'){
                alunoController.listaQuemRespondeu();
                alunoController.mostrarMenu();
                opcao = sc.nextLine().charAt(0);
            }

            else {
                break;
            }
        }
    }
}
