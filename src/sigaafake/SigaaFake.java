package sigaafake;
import java.util.Arrays;
import java.util.Scanner;

public class SigaaFake {            //Autores: Felipe Moura Ribeiro e Juliana da Silva Leite

    public static void main(String[] args) {

        int sair = 0; // sair será uma variavel manipulada no do-while para quando a opcao sair for escolhila, ela receberá 1.
        int escolha = 0; // escolha é a variável manipulada para saber qual escolha foi feita
        String[][] disciplinas;
        double[][] notas;
        disciplinas = new String[10][2];
        notas = new double[100][5];
        System.out.println("        Bem vindo ao Sigaa Fake");

        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Qual instrução deseja realizar?");
            System.out.println("1 - Cadastro de disciplina         2 - Preencher notas de disciplinas         3 - Relatorio das disciplinas          4 - Sair");

            escolha = entrada.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Cadastro de disciplina");
                    cadastroDisciplinas(disciplinas);
                    break;
                case 2:
                    System.out.println("Preencher notas de disciplinas");
                    preencherDisciplinas(disciplinas, notas);
                    break;
                case 3:
                    System.out.println("Relatório das disciplinas");
                    relatorioDisciplinas(disciplinas, notas);
                    break;
                case 4:
                    System.out.println("Saindo");
                    sair = 1;
                    break;
                default:
                    System.out.println("Comando inesperado. Digite valores de 1 a 4");
            }

        } while (sair == 0);

    }

    public static void cadastroDisciplinas(String[][] disciplinas) {
        Scanner entrada = new Scanner(System.in);
        int i = 0;
        int auxiliar = 0;
        for (int j = 0; j < disciplinas.length; j++) {
            if (disciplinas[j][0] != null) {
                auxiliar++;     // Essa variavel ira auxiliar na hora de saber até qual linha ja foram cadastrada as disciplinas.
            }
        }
        int simOUnao;
        int condicaoSatisfeita = 0; //Essa variavel usaremos dentro do for pra caso algum dos if seja satisfeito, logo a materia ja foi cadastrada
        String idTeste; //Usaremos essa variavel para verificar atraves de um if se o id digitado ja foi cadastrado
        do {

            System.out.println("-----Nova disciplina----- ");
            System.out.println("Id: ");

            idTeste = entrada.next();
            for (int j = 0; j < disciplinas.length; j++) {
                if (idTeste.equals(disciplinas[j][0])) {
                    System.out.println("Este código ja foi cadastrado ");       //1 condicao: O id tem que ser novo pra ser cadastrado
                    condicaoSatisfeita = 1;
                }
            }

            if (condicaoSatisfeita != 1 && disciplinas[i + auxiliar ][0] == null) {  //A variavel auxiliar salva até onde as informacoes foram cadastradas para evitar de que dados sejam armazenados em cima de outros
                disciplinas[i + auxiliar][0] = idTeste;
                System.out.println("Materia: ");
                disciplinas[i + auxiliar][1] = entrada.next();
            }

            System.out.println("Gostaria de cadastrar outra disciplina?");
            System.out.println("1 - Sim             2 - Nao");
            simOUnao = entrada.nextInt();
            condicaoSatisfeita = 0;

            switch (simOUnao) {
                case 1:
                    i++;
                    break;
                case 2:
                    i = 101;  //Ao colocar o valor de i acima de 100, a condição do while será interrompida,
                    break;  //dessa maneira o código entenderá que a resposta é nao e sairá do loop.

                default:
                    System.out.println("1 - Sim             2 - Nao");
            }

        } while (i < 100);
    }

    public static void preencherDisciplinas(String[][] disciplinas, double[][] notas) {
        Scanner entrada = new Scanner(System.in);
        String idEscolhido;

        System.out.println("================ Lista de disciplinas ==================");
        for (int i = 0; i < disciplinas.length; i++) {
            if (disciplinas[i][0] != null) { //Verificando se o id da materia foi inicializado para imprimir
                System.out.println("[" + disciplinas[i][0] + "] " + disciplinas[i][1]);

            }
        }
        System.out.println("========================================================");
        System.out.println("Qual disciplina deseja preencher as notas? (Digite o ID da disciplina)");
        idEscolhido = entrada.next();
        int idEscolhidoINT = Integer.parseInt(idEscolhido); //Convertendo idEscolhido de String para Int no intuito de utilizar no switch

        switch (idEscolhidoINT) {
            case 1:
                for (int i = 0; i < disciplinas.length; i++) {
                    if ("1".equals(disciplinas[i][0])) {
                        System.out.println("Materia escolhida: " + disciplinas[i][1]);
                        cadastraNota(disciplinas[i][0], notas);
                    }
                }
                break;
            case 2:
                for (int i = 0; i < disciplinas.length; i++) {
                    if ("2".equals(disciplinas[i][0])) {
                        System.out.println("Materia escolhida: " + disciplinas[i][1]);
                        cadastraNota(disciplinas[i][0], notas);
                    }
                }
                break;
            case 3:
                for (int i = 0; i < disciplinas.length; i++) {
                    if ("3".equals(disciplinas[i][0])) {
                        System.out.println("Materia escolhida: " + disciplinas[i][1]);
                        cadastraNota(disciplinas[i][0], notas);
                    }
                }
                break;
            case 4:
                for (int i = 0; i < disciplinas.length; i++) {
                    if ("4".equals(disciplinas[i][0])) {
                        System.out.println("Materia escolhida: " + disciplinas[i][1]);
                        cadastraNota(disciplinas[i][0], notas);
                    }
                }
                break;
            case 5:
                for (int i = 0; i < disciplinas.length; i++) {
                    if ("5".equals(disciplinas[i][0])) {
                        System.out.println("Materia escolhida: " + disciplinas[i][1]);
                        cadastraNota(disciplinas[i][0], notas);
                    }
                }
                break;
            case 6:
                for (int i = 0; i < disciplinas.length; i++) {
                    if ("6".equals(disciplinas[i][0])) {
                        System.out.println("Materia escolhida: " + disciplinas[i][1]);
                        cadastraNota(disciplinas[i][0], notas);
                    }
                }
                break;
            case 7:
                for (int i = 0; i < disciplinas.length; i++) {
                    if ("7".equals(disciplinas[i][0])) {
                        System.out.println("Materia escolhida: " + disciplinas[i][1]);
                        cadastraNota(disciplinas[i][0], notas);
                    }
                }
                break;
            case 8:
                for (int i = 0; i < disciplinas.length; i++) {
                    if ("8".equals(disciplinas[i][0])) {
                        System.out.println("Materia escolhida: " + disciplinas[i][1]);
                        cadastraNota(disciplinas[i][0], notas);
                    }
                }
                break;
            case 9:
                for (int i = 0; i < disciplinas.length; i++) {
                    if ("9".equals(disciplinas[i][0])) {
                        System.out.println("Materia escolhida: " + disciplinas[i][1]);
                        cadastraNota(disciplinas[i][0], notas);
                    }
                }
                break;
            case 10:
                for (int i = 0; i < disciplinas.length; i++) {
                    if ("10".equals(disciplinas[i][0])) {
                        System.out.println("Materia escolhida: " + disciplinas[i][1]);
                        cadastraNota(disciplinas[i][0], notas);
                    }
                }
                break;

        }
    }

    public static void cadastraNota(String idDisciplinas, double[][] notas) {
        Scanner entrada = new Scanner(System.in);
        int addAluno; //Essa variavel sera verificada se o usuario quer adicionar novo aluno (1) ou nao (2)
        int j = 0;
        double notaTeste1; //notaTeste sera testada antes para ver se a nota é valida para depois ser passada a matriz notas[][]
        double notaTeste2;
        double notaTeste3;

        do {
            int auxDeArmazenamento = 0;
            for (int i = 0; i < notas.length; i++) {
                if (notas[i][0] != 0) {
                    auxDeArmazenamento++;     // Essa variavel ira auxiliar na hora de saber até qual linha ja foram cadastrada as disciplinas.
                }
            }
            //        System.out.println("Auxiliar valor: " + auxDeArmazenamento); -> Imprime a variavel que auxilia pra saber em qual linha as materias ja foram cadastradas
            int aux = 0; //aux será manipulada para 1 se o aluno ja esta cadastrado na materia e 0 se caso ele n estiver cadastrado
            System.out.println("Digite o id do aluno para cadastrar na disciplina");
            int idAluno = entrada.nextInt();
            for (int i = 0; i < notas.length; i++) {       //Loop para percorrer a matriz Notas e tentar achar se o id do aluno digitado ja esta cadastrado

                if (notas[i][1] == idAluno && notas[i][0] == Integer.parseInt(idDisciplinas)) {
                    System.out.println("Aluno ja cadastrado");
                    aux = 1;                // Caso ja esteja cadastrado na disciplina escolhida, a condicao abaixo desta linha n sera satisfeita 
                }
            }
            if (aux == 0) {
                notas[j + auxDeArmazenamento][0] = Integer.parseInt(idDisciplinas);
                System.out.println("Nota 1 do aluno [" + idAluno + "]");
                notaTeste1 = entrada.nextFloat();
                System.out.println("Nota 2 do aluno [" + idAluno + "]");
                notaTeste2 = entrada.nextFloat();
                System.out.println("Nota 3 do aluno [" + idAluno + "]");
                notaTeste3 = entrada.nextFloat();
                if (notaTeste1 >= 0 && notaTeste1 <= 100) {       //if's alinhados para saber se as 3 notas foram digitadas com valores de 0 a 100 e passar para a matriz. Se pelo menos 1 nota foi fora deste intervalo, o programa ira imprimir o erro                                       
                    if (notaTeste2 >= 0 && notaTeste2 <= 100) {
                        if (notaTeste3 >= 0 && notaTeste3 <= 100) {
                            notas[j + auxDeArmazenamento][2] = notaTeste1;
                            notas[j + auxDeArmazenamento][3] = notaTeste2;
                            notas[j + auxDeArmazenamento][4] = notaTeste3;
                            notas[j + auxDeArmazenamento][1] = idAluno;
                            System.out.println("Notas do aluno [" + idAluno + "] cadastradas com sucesso. Deseja cadastrar de outro aluno?");
                        }
                    }
                } else {
                    System.out.println("Nota digitada é invalida");
                }
                j++;
                //System.out.println(notas[j + auxDeArmazenamento][0] + notas[j + auxDeArmazenamento][1] + notas[j + auxDeArmazenamento][2] + notas[j + auxDeArmazenamento][3] + notas[j + auxDeArmazenamento][4]);
            }
            System.out.println("Gostaria de adicionar outro aluno?");
            System.out.println("1 - Sim              2 - Nao");
            addAluno = entrada.nextInt();
        } while (addAluno == 1);
    }

    public static void relatorioDisciplinas(String[][] disciplinas, double[][] notas) {

        Scanner entrada = new Scanner(System.in);
        int escolher;   //Variavel pra controlar a escolha do usuario
        double qntDeAprovado = 0; //Variavel que conta quantos alunos foram aprovados
        double qntDeAluno = 0;   //Variavel que conta quantos alunos foram contabilizados
        double porcentagem = 0;

        System.out.println("================ Lista de disciplinas ==================");
        for (int i = 0; i < disciplinas.length; i++) {
            if (disciplinas[i][0] != null) { //Verificando se o id da materia foi inicializado para imprimir
                System.out.println("[" + disciplinas[i][0] + "] " + disciplinas[i][1]);

            }
        }
        System.out.println("========================================================");
        System.out.println("Qual dos relatórios das disciplinas voce deseja acessar? (Digite o ID da disciplina)");

        escolher = entrada.nextInt();

        switch (escolher) {
            case 1:
                System.out.println("Aluno    Nota1   Nota2   Nota3   Media   Status");
                for (int k = 0; k < notas.length; k++) {
                    if (notas[k][0] == 1) {
                        System.out.print("" + notas[k][1] + "      " + notas[k][2] + "    " + notas[k][3] + "    " + notas[k][4] + "   " + (notas[k][2] + notas[k][3] + notas[k][4]) / 3);

                        double media = (notas[k][2] + notas[k][3] + notas[k][4]) / 3;

                        if (media >= 60) {
                            System.out.println("  Aprovado");
                            qntDeAprovado++;
                            qntDeAluno++;
                        } else {
                            System.out.println("  Reprovado");
                            qntDeAluno++;
                        }
                    }

                }
                break;
            case 2:
                System.out.println("Aluno    Nota1   Nota2   Nota3   Media   Status");
                for (int k = 0; k < notas.length; k++) {
                    if (notas[k][0] == 2) {
                        System.out.print("" + notas[k][1] + "      " + notas[k][2] + "    " + notas[k][3] + "    " + notas[k][4] + "   " + (notas[k][2] + notas[k][3] + notas[k][4]) / 3);

                        double media = (notas[k][2] + notas[k][3] + notas[k][4]) / 3;

                        if (media >= 60) {
                            System.out.println("  Aprovado");
                            qntDeAprovado++;
                            qntDeAluno++;
                        } else {
                            System.out.println("  Reprovado");
                            qntDeAluno++;
                        }
                    }

                }

                break;
            case 3:
                System.out.println("Aluno    Nota1   Nota2   Nota3   Media   Status");
                for (int k = 0; k < notas.length; k++) {
                    if (notas[k][0] == 3) {
                        System.out.print("" + notas[k][1] + "      " + notas[k][2] + "    " + notas[k][3] + "    " + notas[k][4] + "   " + (notas[k][2] + notas[k][3] + notas[k][4]) / 3);

                        double media = (notas[k][2] + notas[k][3] + notas[k][4]) / 3;

                        if (media >= 60) {
                            System.out.println("  Aprovado");
                            qntDeAprovado++;
                            qntDeAluno++;
                        } else {
                            System.out.println("  Reprovado");
                            qntDeAluno++;
                        }
                    }

                }

                break;
            case 4:
                System.out.println("Aluno    Nota1   Nota2   Nota3   Media   Status");
                for (int k = 0; k < notas.length; k++) {
                    if (notas[k][0] == 4) {
                        System.out.print("" + notas[k][1] + "      " + notas[k][2] + "    " + notas[k][3] + "    " + notas[k][4] + "   " + (notas[k][2] + notas[k][3] + notas[k][4]) / 3);

                        double media = (notas[k][2] + notas[k][3] + notas[k][4]) / 3;

                        if (media >= 60) {
                            System.out.println("  Aprovado");
                            qntDeAluno++;
                            qntDeAprovado++;
                        } else {
                            System.out.println("  Reprovado");
                            qntDeAluno++;
                        }
                    }

                }

                break;
            case 5:

                System.out.println("Aluno    Nota1   Nota2   Nota3   Media   Status");
                for (int k = 0; k < notas.length; k++) {
                    if (notas[k][0] == 5) {
                        System.out.print("" + notas[k][1] + "      " + notas[k][2] + "    " + notas[k][3] + "    " + notas[k][4] + "   " + (notas[k][2] + notas[k][3] + notas[k][4]) / 3);

                        double media = (notas[k][2] + notas[k][3] + notas[k][4]) / 3;

                        if (media >= 60) {
                            System.out.println("  Aprovado");
                            qntDeAluno++;
                            qntDeAprovado++;
                        } else {
                            System.out.println("  Reprovado");
                            qntDeAluno++;
                        }
                    }

                }

                break;
            case 6:
                System.out.println("Aluno    Nota1   Nota2   Nota3   Media   Status");
                for (int k = 0; k < notas.length; k++) {
                    if (notas[k][0] == 6) {
                        System.out.print("" + notas[k][1] + "      " + notas[k][2] + "    " + notas[k][3] + "    " + notas[k][4] + "   " + (notas[k][2] + notas[k][3] + notas[k][4]) / 3);

                        double media = (notas[k][2] + notas[k][3] + notas[k][4]) / 3;

                        if (media >= 60) {
                            System.out.println("  Aprovado");
                            qntDeAluno++;
                            qntDeAprovado++;
                        } else {
                            System.out.println("  Reprovado");
                            qntDeAluno++;
                        }
                    }

                }

                break;
            case 7:
                System.out.println("Aluno    Nota1   Nota2   Nota3   Media   Status");
                for (int k = 0; k < notas.length; k++) {
                    if (notas[k][0] == 7) {
                        System.out.print("" + notas[k][1] + "      " + notas[k][2] + "    " + notas[k][3] + "    " + notas[k][4] + "   " + (notas[k][2] + notas[k][3] + notas[k][4]) / 3);

                        double media = (notas[k][2] + notas[k][3] + notas[k][4]) / 3;

                        if (media >= 60) {
                            System.out.println("  Aprovado");
                            qntDeAluno++;
                            qntDeAprovado++;
                        } else {
                            System.out.println("  Reprovado");
                            qntDeAluno++;
                        }
                    }

                }

                break;
            case 8:
                System.out.println("Aluno    Nota1   Nota2   Nota3   Media   Status");
                for (int k = 0; k < notas.length; k++) {
                    if (notas[k][0] == 8) {
                        System.out.print("" + notas[k][1] + "      " + notas[k][2] + "    " + notas[k][3] + "    " + notas[k][4] + "   " + (notas[k][2] + notas[k][3] + notas[k][4]) / 3);

                        double media = (notas[k][2] + notas[k][3] + notas[k][4]) / 3;

                        if (media >= 60) {
                            System.out.println("  Aprovado");
                            qntDeAprovado++;
                            qntDeAluno++;
                        } else {
                            System.out.println("  Reprovado");
                            qntDeAluno++;
                        }
                    }

                }

                break;
            case 9:
                System.out.println("Aluno    Nota1   Nota2   Nota3   Media   Status");
                for (int k = 0; k < notas.length; k++) {
                    if (notas[k][0] == 9) {
                        System.out.print("" + notas[k][1] + "      " + notas[k][2] + "    " + notas[k][3] + "    " + notas[k][4] + "   " + (notas[k][2] + notas[k][3] + notas[k][4]) / 3);

                        double media = (notas[k][2] + notas[k][3] + notas[k][4]) / 3;

                        if (media >= 60) {
                            System.out.println("  Aprovado");
                            qntDeAprovado++;
                            qntDeAluno++;
                        } else {
                            System.out.println("  Reprovado");
                            qntDeAluno++;
                        }
                    }

                }

                break;
            case 10:
                System.out.println("Aluno    Nota1   Nota2   Nota3   Media   Status");
                for (int k = 0; k < notas.length; k++) {
                    if (notas[k][0] == 10) {
                        System.out.print("" + notas[k][1] + "      " + notas[k][2] + "    " + notas[k][3] + "    " + notas[k][4] + "   " + (notas[k][2] + notas[k][3] + notas[k][4]) / 3);

                        double media = (notas[k][2] + notas[k][3] + notas[k][4]) / 3;

                        if (media >= 60) {
                            System.out.println("  Aprovado");
                            qntDeAluno++;
                            qntDeAprovado++;
                        } else {
                            System.out.println("  Reprovado");
                            qntDeAluno++;
                        }
                    }

                }
                break;
            default:
                System.out.println("Id digitado invalido");
        }
        porcentagem = qntDeAprovado / qntDeAluno * 100;     //porcentagem de aprovados
        System.out.println(porcentagem + "% de Aprovados");    //Obtendo o numero total de aprovados e de alunos conseguiremos achar a % de aprovacao
        System.out.println((100 - porcentagem) + "% de Reprovados");  //Sabendo que os reprovados é o restante da porcentagem, 100% - (aprovados)% será os reprovados
    }
}
