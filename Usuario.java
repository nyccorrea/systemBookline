import java.util.ArrayList;
import java.util.Scanner;

public class Usuario{

    //atributos
    private String matricula, nome, cpf, email, senha;
    private int tipoUsuario;
    
    //getters e setters
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

    //ArrayList que armazena os usuários cadastrados  
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<>();
   
    //metodo cadastrar usuario
    public static int cadastrarUsuario(String nome, String matricula, String cpf, String email,
            String senha, int tipoUsuario) {

        //construtor
        Usuario newUsuario = new Usuario();

        int usuarioDefinido = 0;

        newUsuario.setNome(nome);
        newUsuario.setMatricula(matricula);
        newUsuario.setCpf(cpf);
        newUsuario.setEmail(email);
        newUsuario.setSenha(senha);
        newUsuario.setTipoUsuario(tipoUsuario);

        if(tipoUsuario == 0){
            System.out.println("Cadastro como usuario Discente realizado com sucesso.");
        }else if(tipoUsuario == 1){
            System.out.println("Cadastro como usuario Funcionario realizado com sucesso.");
            usuarioDefinido = 1;
        }else{
            System.err.println("Detectamos um erro. Forneça apenas 0(se for Discente) ou 1(se for Funcionario) no seu tipo de Usuario.");
        }

        listaUsuarios.add(newUsuario);

        //retorna 0 para discente e 1 para funcionario
        return usuarioDefinido;
    }

    //método que consulta o usuário a partir da matricula
    public static String consultarUsuario(String matricula) {

            for (Usuario usuario : listaUsuarios) {
                if (matricula.equals(usuario.getMatricula())) {
                    //retorna os dados do usuário
                    return "Usuário encontrado:\n" +
                            "Nome: " + usuario.getNome() + "\n" +
                            "Matrícula: " + usuario.getMatricula() + "\n" +
                            "CPF: " + usuario.getCpf() + "\n" +
                            "Email: " + usuario.getEmail() + "\n" +
                            "Tipo de Usuário: " + usuario.getTipoUsuario();
                }
            }
            return "Usuário não encontrado.";
        
    }

    //metodo que valida Email e Senha
    public static int validarAcesso(String email, String senha) {
    
        for (Usuario usuario : listaUsuarios) {
            if (email.equals(usuario.getEmail()) && senha.equals(usuario.getSenha())) {
                return 1; // Acesso válido
            }
        }
        return 0; // Acesso inválido
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //recebe os inputs para o cadastro
        while (true) {
            System.out.println("O que deseja fazer? [1 -> cadastro | 2 -> consulta] | 3 -> Login");
            int resposta = scanner.nextInt();

            if (resposta == 1) {
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
                cadastrarUsuario(nome, matricula, cpf, email, senha, tipoUsuario);
            } else if (resposta == 2) {

                System.out.println("---------------- Consultando usuário --------------");
                System.out.print("Por favor Funcionario, informe a matricula do discente: ");
                String consulta = scanner.next();
                System.out.println(consultarUsuario(consulta));

            } else if (resposta == 3) {
                System.out.println("---------------- LOGIN --------------");
                scanner.nextLine(); //consumir quebra de linha residual

                System.out.print("Email: ");
                String email_inserido = scanner.nextLine();
    
                System.out.print("Senha: ");
                String senha_inserida = scanner.nextLine();

                System.out.println(validarAcesso(email_inserido, senha_inserida));

            } else {
                // Caso a resposta seja diferente de 1, 2 ou 3, encerra o loop
                break;
            }
        }

        scanner.close();
    }
}