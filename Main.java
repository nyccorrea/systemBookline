import Livros.Livro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("                     Bem-vindo ao BOOKLINE                      ");
        System.out.println("----------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);

        // recebe os inputs para o cadastro
        while (true) {
            
            System.out.println("O que deseja fazer? [1 -> cadastro no sistema | 2 -> Login ]");
            int resposta = scanner.nextInt();

            if (resposta == 1) {
                System.out.println("------------------------------- Cadastre-se ---------------------------------");
                System.out.println("Por favor, informe os dados abaixo:");
                System.out.print("Nome: ");
                String nome = scanner.next();
                System.out.print("Matrícula: ");
                String matricula = scanner.next();
                System.out.print("CPF: ");
                String cpf = scanner.next();
                System.out.print("Email: ");
                String email = scanner.next();
                System.out.print("Crie uma senha: ");
                String senha = scanner.next();
                System.out.print("Informe seu tipo de Usuario [0 -> se for Discente | 1 -> se for Funcionario]: ");
                int tipoUsuario = scanner.nextInt();

                // Realiza o cadastro do usuário conforme os dados informados
                Usuario.cadastrarUsuario(nome, matricula, cpf, email, senha, tipoUsuario);
                // CONSULTA USUARIO
                // } else if (resposta == 2) {

                // System.out.println("---------------- Consultando usuário --------------");
                // System.out.print("Por favor Funcionario, informe a matricula do discente: ");
                // String consulta = scanner.next();
                // System.out.println(consultarUsuario(consulta));
                // System.out.println("-----------------------------------------------------");

            } else if (resposta == 2) {
                System.out.println("---------------- LOGIN --------------");
                scanner.nextLine(); // consumir quebra de linha residual

                System.out.print("Email: ");
                String email_inserido = scanner.nextLine();

                System.out.print("Senha: ");
                String senha_inserida = scanner.nextLine();

                Usuario.validarAcesso(email_inserido, senha_inserida);

                System.out.println("--------------------------------------");

                if (Usuario.validarAcesso(email_inserido, senha_inserida) == 1) {
                    
                        System.out.println("Olá usuário, o que deseja fazer?");
                        System.out.println("[0 -> Visualizar Catálogo || 1 -> Consultar Pedido de Empréstimo  || 2 -> Gerenciar Livros ]");
                        int decisao = scanner.nextInt();

                        switch (decisao) {
                            case 0:
                            System.out.println("##################################################");
                            System.out.println("                      Catálogo                    ");
                            System.out.println("##################################################");
                            //chamar metodo que visualiza
                            System.out.println("##################################################");

                            System.out.println("Deseja realizar pedido de empréstimo? [S/N]");
                            char respPedido = scanner.next().toUpperCase().charAt(0);
                                if(respPedido == 'S'){
                                    System.out.println("pedido...");
                                    //METODO
                                }else{
                                    System.out.println("Nenhum pedido realizado");
                                }
                                break;
                        
                            case 1:
                                System.out.println("##################################################");
                                System.out.println("       Consultando Pedido de Empréstimo           ");
                                System.out.println("##################################################");
                                
                                //metodo
                                break;
                            case 2:
                                System.out.println("##################################################");
                                System.out.println("                 Gerenciando Livros               ");
                                System.out.println("##################################################");
                                scanner.nextLine(); // consumir quebra de linha residual
                                System.out.println("-> Precisamos confirmar as credenciais...");
                                System.out.println("Informe sua matricula:");
                                String matricula_informada = scanner.nextLine();
                                System.out.println("Informe seu tipo de Usuário [0 -> se for Discente | 1 -> se for Funcionario]:");
                                int usuario_informado = scanner.nextInt();

                                int consulta = Usuario.consultarCredenciaisFunc(matricula_informada, usuario_informado);

                                if(consulta == 1) {
                                    System.out.println("Credenciais confirmadas.");
                                    // consulta
                                    Livro.main(args);
                                }else{
                                    System.out.println("Desculpe, mas apenas usuários autorizados tem acesso a essa função :(");
                                }
                                break;
                            default:
                                System.out.println("Valor de entrada inválida");                            
                                break;
                        }
                    
                }
                System.out.println("Entrada inválida :( \nVocê não possui cadastro no sistema.");
                break;

            } else {
                // Caso a resposta seja diferente de 1 ou 2, encerra o loop
                System.out.println("Entrada inválida :( \nExecute novamente...");
                break;
            }
            
        }

        scanner.close();
    }
}
