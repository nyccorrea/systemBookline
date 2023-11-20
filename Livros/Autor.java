package Livros;
public class Autor {
        private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos
        public void cadastrarAutor(String nome) {
            // Lógica para cadastrar o autor
            setNome(nome);
            System.out.println("Autor"+getNome()+"cadastrado!");
        }

        public void consultarAutor() {
            // Lógica para consultar informações do autor
            System.out.println("Informações do autor - Nome: " + nome);
        }

        public void editarAutor() {
            // Lógica para editar informações do autor
            System.out.println("Autor editado: " + nome);
        }
    }
