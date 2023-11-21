import java.util.ArrayList;
//import java.util.Scanner;

public class Usuario {

    // atributos
    private String matricula, nome, cpf, email, senha;
    private int tipoUsuario;

    // getters e setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    // ArrayList que armazena os usuários cadastrados
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    // metodo cadastrar usuario
    public static int cadastrarUsuario(String nome, String matricula, String cpf, String email,
            String senha, int tipoUsuario) {

        // construtor
        Usuario newUsuario = new Usuario();

        int usuarioDefinido = 0;

        newUsuario.setNome(nome);
        newUsuario.setMatricula(matricula);
        newUsuario.setCpf(cpf);
        newUsuario.setEmail(email);
        newUsuario.setSenha(senha);
        newUsuario.setTipoUsuario(tipoUsuario);

        if (tipoUsuario == 0) {
            System.out.println("Cadastro como usuario Discente realizado com sucesso.");
        } else if (tipoUsuario == 1) {
            System.out.println("Cadastro como usuario Funcionario realizado com sucesso.");
            usuarioDefinido = 1;
        } else {
            System.err.println(
                    "Detectamos um erro. Forneça apenas 0(se for Discente) ou 1(se for Funcionario) no seu tipo de Usuario.");
        }

        listaUsuarios.add(newUsuario);

        // retorna 0 para discente e 1 para funcionario
        return usuarioDefinido;
    }

    // método que consulta o usuário a partir da matricula
    public static String consultarUsuario(String matricula) {

        for (Usuario usuario : listaUsuarios) {
            if (matricula.equals(usuario.getMatricula())) {
                // retorna os dados do usuário
                return "Usuário encontrado.\n" +
                        "Nome: " + usuario.getNome() + "\n" +
                        "Matrícula: " + usuario.getMatricula() + "\n" +
                        "CPF: " + usuario.getCpf() + "\n" +
                        "Email: " + usuario.getEmail() + "\n" +
                        "Tipo de Usuário: " + usuario.getTipoUsuario();
            }
        }
        return "Usuário não encontrado.";

    }

    // método que consulta credenciais para funcionário
    public static int consultarCredenciaisFunc(String matricula, int tipoUsuario) {
        for (Usuario usuario : listaUsuarios) {
            if (matricula.equals(usuario.getMatricula()) && usuario.getTipoUsuario() == 1) {
                // se credenciais informadas forem corretar retorna 1
                return 1;
            }
        }
        return 0;
    }

    // metodo que valida acesso
    public static int validarAcesso(String email, String senha) {

        for (Usuario usuario : listaUsuarios) {
            if (email.equals(usuario.getEmail()) && senha.equals(usuario.getSenha())) {
                return 1; // Acesso válido
            } else {

            }
        }
        return 0; // Acesso inválido
    }

}