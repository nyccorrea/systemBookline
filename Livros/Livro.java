package Livros;
import java.util.ArrayList;
import java.util.Scanner;

public class Livro {
    //atributos
    private String isbn;
    private String titulo;
    private int anoPublicacao;
    private int qtdDisponivel;

    //metodos getters e setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public int getQtdDisponivel() {
        return qtdDisponivel;
    }
    public void setQtdDisponivel(int qtdDisponivel) {
        this.qtdDisponivel = qtdDisponivel;
    }

    //arrayList que armazena os livros
    public static ArrayList<Livro> listaLivros = new ArrayList<>();
    // Métodos
    public static void cadastrarLivro(String isbn, String titulo, int anoPublicacao, int qtdDisponivel) {
        // Lógica para cadastrar o livro
        Livro newLivro = new Livro();

        newLivro.setIsbn(isbn);
        newLivro.setTitulo(titulo);
        newLivro.setAnoPublicacao(anoPublicacao);
        newLivro.setQtdDisponivel(qtdDisponivel);
        System.out.println("Livro " + newLivro.getTitulo() + " cadastrado!");
        listaLivros.add(newLivro);
    }

    public static void consultarLivro(String titulo, String isbn) {
        // Lógica para consultar informações do livro
        for (Livro livros : listaLivros) {
            if(titulo.equals(livros.getTitulo()) && isbn.equals(livros.getIsbn())){
                    //retorna os dados do usuário
                    System.out.println("Informações do livro - ISBN: " + livros.getIsbn() + ", Título: " + livros.getTitulo() +
                            ", Ano de Publicação: " + livros.getAnoPublicacao() + ", Quantidade Disponível: " + livros.getQtdDisponivel());
            }else{
                            System.out.println("Dados incorretos ou inexistente.");
            }
        }
    }
    public static void consultarLivro() {
        // Lógica para consultar informações do livro
        for (Livro livros : listaLivros) {

                //retorna os dados do usuário
                System.out.println("Informações do livro - ISBN: " + livros.getIsbn() + ", Título: " + livros.getTitulo() +
                        ", Ano de Publicação: " + livros.getAnoPublicacao() + ", Quantidade Disponível: " + livros.getQtdDisponivel());
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("O que deseja fazer? 1 -> cadastrar livro | 2 -> consultar livro");
            int resposta = scanner.nextInt();

            if (resposta == 1) {
                System.out.println("Por favor, informe os dados abaixo:");
                System.out.print("ISBN: ");
                String isbn = scanner.next();
                System.out.print("Título: ");
                String titulo = scanner.next();
                System.out.print("Ano de Publicação: ");
                int anoPublicacao = scanner.nextInt();
                System.out.print("Quantidade de livros: ");
                int qtdDisponivel = scanner.nextInt();

                // Realiza o cadastro do Livro conforme os dados informados
                cadastrarLivro(isbn, titulo, anoPublicacao, qtdDisponivel);
            } else if (resposta == 2) {
                System.out.println("---------------- Consultando Livro --------------");
                scanner.nextLine(); //consumir quebra de linha residual

                System.out.print("Por favor Funcionario, informe o Titulo do livro: ");
                String titulo = scanner.nextLine();
                
                System.out.print("Agora informe o ISBN do livro: ");
                String isbn = scanner.nextLine();
                consultarLivro(titulo, isbn);
            }else {
                // Caso a resposta seja diferente de 1 ou 2, encerra o loop
                break;
            }
        }

        scanner.close();
    }
}
