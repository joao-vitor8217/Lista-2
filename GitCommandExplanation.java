import java.util.Scanner;

public class GitCommandExplanation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita o comando Git ao usuário
        System.out.print("Digite um comando Git (git clone, git fetch ou git pull): ");
        String comando = scanner.nextLine().toLowerCase();

        // verifica o comando e fornece a explicação correspondente
        switch (comando) {
            case "git clone":
                System.out.println("Comando: git clone");
                System.out.println("Explicação: O comando 'git clone' é usado para clonar um repositório Git existente.");
                System.out.println("Exemplo: git clone https://github.com/exemplo/repositorio.git");
                break;
            case "git fetch":
                System.out.println("Comando: git fetch");
                System.out.println("Explicação: O comando 'git fetch' é usado para buscar as alterações do repositório remoto para o seu repositório local.");
                System.out.println("Exemplo: git fetch origin");
                break;
            case "git pull":
                System.out.println("Comando: git pull");
                System.out.println("Explicação: O comando 'git pull' é usado para buscar as alterações do repositório remoto e mesclá-las com seu repositório local.");
                System.out.println("Exemplo: git pull origin master");
                break;
            default:
                System.out.println("Comando inválido.");
        }

        scanner.close();
    }
}