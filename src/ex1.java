import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ex1 {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private String email;
    public ex1(String nome, String sobrenome, String dataNascimento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    private int idade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

    private boolean validaEmail(String email) {
        return email.contains("@") && email.indexOf(".", email.indexOf("@")) > email.indexOf("@");
    }

    public void adicionarEmail(String email) {
        if (validaEmail(email)) {
            this.email = email;
        } else {
            System.out.println("E-mail inválido!");
        }
    }

    public String getInformacoes() {
        return "Nome: " + nome + " " + sobrenome + "\n" +
               "Idade: " + idade() + " anos\n" +
               "E-mail: " + (email != null ? email : "Não informado");
    }

    public boolean maior() {
        return idade() >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();
        
        System.out.print("Digite a data de nascimento (dd/MM/yyyy): ");
        String dataNascimento = scanner.nextLine();
        
        ex1 pessoa = new ex1(nome, sobrenome, dataNascimento);
        
        System.out.print("Digite o e-mail: ");
        String email = scanner.nextLine();
        pessoa.adicionarEmail(email);
        
        System.out.println("\nInformações da pessoa:");
        System.out.println(pessoa.getInformacoes());
        
        if (pessoa.maior()) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa é menor de idade.");
        }
        
        scanner.close();
    }
}
