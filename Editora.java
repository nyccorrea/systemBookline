package classes;

public class Editora {
    private String nome;
    private String email;
    private String endereco;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Métodos
    public void cadastrarEditora(String nome, String email, String endereco, String telefone) {
        // Lógica para cadastrar a editora
        setNome(nome);
        setEmail(email);
        setEndereco(endereco);
        setTelefone(telefone);
        System.out.println("Editora "+getNome()+" cadastrada!");
    }

    public void consultarEditora() {
        // Lógica para consultar informações da editora
        System.out.println("Informações da editora - Nome: " + getNome() + ", Email: " + getEmail() +
                ", Endereço: " + getEndereco() + ", Telefone: " + getTelefone());
    }

    public void editarEditora() {
        // Lógica para editar informações da editora
        System.out.println("Editora editada: " + nome);
    }
}
