import Livros.Livro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                          Bem-vindo ao BOOKLINE                              ");
        System.out.println("-----------------------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);

        // inicia a execução do programa
        while (true) {

            System.out.println("O que deseja fazer? [1 -> cadastro no sistema | 2 -> Login | 3 -> sair ]");
            int resposta = scanner.nextInt();

            // para a execução do programa
            if (resposta == 3) {
                break;
            }

            // cadastro no sistema
            else if (resposta == 1) {
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

                continue;
            }
            // login
            else if (resposta == 2) {
                System.out.println("---------------- LOGIN --------------");
                scanner.nextLine(); // consumir quebra de linha residual

                System.out.print("Email: ");
                String email_inserido = scanner.nextLine();

                System.out.print("Senha: ");
                String senha_inserida = scanner.nextLine();

                Usuario.validarAcesso(email_inserido, senha_inserida);

                System.out.println("--------------------------------------");

                // valida acesso
                if (Usuario.validarAcesso(email_inserido, senha_inserida) == 1) {
                    //entra no sistema se o acesso for validado
                    while (true) {
                        System.out.println("O que deseja fazer?");
                        System.out.println("[0 -> Visualizar Catálogo || 1 -> Consultar Pedido de Empréstimo  || 2 -> Gerenciar Livros || 3 -> Logout]");

                        int decisao = scanner.nextInt();

                        //sai do sistema
                        if (decisao == 3) {
                            break;
                        }

                        switch (decisao) {

                            case 0:
                                Livro.main(args);
                                System.out.println("Deseja realizar pedido de empréstimo? [S/N]");
                                char respPedido = scanner.next().toUpperCase().charAt(0);
                                if (respPedido == 'S') {
                                    System.out.println("Informe o código o título do exemplar: ");
                                    scanner.nextLine(); // consumir quebra de linha residual
                                    String titulo = scanner.nextLine();
                                    System.out.println("Informe o isbn do livro: ");
                                    String isbn = scanner.nextLine();

                                    Livro.realizarEmprestimo(titulo, isbn);

                                    if(Livro.realizarEmprestimo(titulo, isbn) == 1){
                                        System.out.println("Empréstimo realizado com sucesso!");
                                    }else{
                                        System.out.println("Empréstimo negado, observe se as credenciais informadas estão corretas.");
                                    }

                                } else {
                                    System.out.println("Nenhum pedido realizado");
                                }
                                continue;

                            case 1:
                                System.out.println("##################################################");
                                System.out.println("       Consultando Pedido de Empréstimo           ");
                                System.out.println("##################################################");

                                // adc metodo de consultar emprestimo
                                continue;
                            case 2:
                                System.out.println("##################################################");
                                System.out.println("                 Gerenciando Livros               ");
                                System.out.println("##################################################");
                                scanner.nextLine(); // consumir quebra de linha residual
                                System.out.println("-> Precisamos confirmar as credenciais...");
                                System.out.println("Informe sua matricula:");
                                String matricula_informada = scanner.nextLine();
                                System.out.println(
                                        "Informe seu tipo de Usuário [0 -> se for Discente | 1 -> se for Funcionario]:");
                                int usuario_informado = scanner.nextInt();

                                // valida se as credenciais são de um funcionário (retorna 1 caso for, 0 caso
                                // não for)
                                int consulta = Usuario.consultarCredenciaisFunc(matricula_informada, usuario_informado);

                                // caso for funcionario
                                if (consulta == 1) {
                                    System.out.println("Credenciais confirmadas com sucesso.");
                                    System.out.println(
                                            "O que deseja fazer? 1 -> cadastrar livro | 2 -> consultar livro | 3 -> sair do Gerenciador");
                                    int opcao = scanner.nextInt();

                                    switch (opcao) {
                                        case 1:
                                            System.out.println("----> Quantos livros deseja cadastrar?");
                                            int quantidade = scanner.nextInt();

                                            while (quantidade > 0) {
                                                System.out.println("Por favor, informe os dados abaixo:");
                                                scanner.nextLine(); // consumir quebra de linha residual
                                                System.out.println("----------------- Dados Livro ---------------");
                                                System.out.print("ISBN: ");
                                                String isbn = scanner.nextLine();
                                                System.out.print("Título: ");
                                                String titulo = scanner.nextLine();
                                                System.out.print("Ano de Publicação: ");
                                                int anoPublicacao = scanner.nextInt();
                                                System.out.print("Quantidade de livros: ");
                                                int qtdDisponivel = scanner.nextInt();
                                                scanner.nextLine(); // consumir quebra de linha residual
                                                System.out.print("Autor: ");
                                                String autor = scanner.nextLine();
                                                System.out.print("Categoria: ");
                                                String categoria = scanner.nextLine();
                                                System.out.print("Descrição da categoria: ");
                                                String descricao = scanner.nextLine();
                                                System.out.print("Editora: ");
                                                String editora = scanner.nextLine();
                                                System.out.print("Email editora: ");
                                                String emailEditora = scanner.nextLine();

                                                // Realiza o cadastro do Livro conforme os dados informados
                                                Livro.cadastrarLivro(isbn, titulo, anoPublicacao, qtdDisponivel, autor,
                                                        categoria, descricao, editora, emailEditora);

                                                quantidade--;
                                            }
                                            continue;

                                        case 2:
                                            System.out.println(
                                                    "---------------- Consultando Livro Cadastrado --------------");
                                            scanner.nextLine(); // consumir quebra de linha residual

                                            System.out.print("Por favor Funcionario, informe o Titulo do livro: ");
                                            String titulo_informado = scanner.nextLine();

                                            System.out.print("Agora informe o ISBN do livro: ");
                                            String isbn_informado = scanner.nextLine();
                                            Livro.consultarLivro(titulo_informado, isbn_informado);
                                            continue;
                                        case 3:
                                            break;

                                        // se não for opcao válida
                                        default:
                                            System.out.println("Valor de entrada inválida");
                                            break;
                                    }

                                } else { // caso não for funcionário
                                    System.out.println(
                                            "Desculpe, mas apenas usuários autorizados tem acesso a essa função :(");
                                }
                        }
                    }

                }
                // executa caso o login não for válido
                else {
                    System.out.println("Login inválido");
                    continue;
                }

            }

        }
        scanner.close();
    }
}
