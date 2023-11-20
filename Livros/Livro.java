package Livros;
import java.util.Scanner;
public class Livro {
    private String isbn;
    private String titulo;
    private int anoPublicacao;
    private int qtdDisponivel;
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
    public static ArrayList<Livro> listaLivros = new ArrayList<>();
    // Métodos
    public void cadastrarLivro(String isbn, String titulo, int anoPublicacao, int qtdDisponivel) {
        // Lógica para cadastrar o livro
        Livro newLivro = new Livro();
        newLivro.setIsbn(isbn);
        newLivro.setTitulo(titulo);
        newLivro.setAnoPublicacao(anoPublicacao);
        newLivro.setQtdDisponivel(qtdDisponivel);
        System.out.println("Livro "+getTitulo()+" cadastrado!");
        listaLivros.add(newLivro);
    }

    public void consultarLivro(String isbn) {
        // Lógica para consultar informações do livro
        for (Livro livros : listaUsuarios) {
            if (isbn.equals(livros.getIsbn())) {
                //retorna os dados do usuário
              System.out.println("Informações do livro - ISBN: " + getIsbn() + ", Título: " + getTitulo() +
                        ", Ano de Publicação: " + getAnoPublicacao() + ", Quantidade Disponível: " + getQtdDisponivel());  
            }
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
                String anoPublicacao = scanner.next();
                System.out.print("Quantidade de livros: ");
                String qtdDisponivel = scanner.next();

                // Realiza o cadastro do Livro conforme os dados informados
                cadastrarLivro(isbn, titulo, anoPublicacao, qtdDisponivel);
            } else if (resposta == 2) {
                System.out.println("---------------- Consultando Livro --------------");
                System.out.print("Por favor Funcionario, informe o ISBN do livro: ");
                String consulta = scanner.next();
                consultarLivro(consulta);
            }else {
                // Caso a resposta seja diferente de 1 ou 2, encerra o loop
                break;
            }
        }
    }
}
