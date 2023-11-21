package Livros;

public class Editora {
    private String editora;
    private String email;

    //construtor
    public Editora(String editora, String email){
        this.editora = editora;
        this.email = email;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
