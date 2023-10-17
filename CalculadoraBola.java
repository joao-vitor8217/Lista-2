import java.util.Scanner;

public class CalculadoraBola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // define a gravidade nos diferentes planetas (em m/s^2)
        double gravidadeTerra = 9.81;
        double gravidadeMarte = 3.71;
        double gravidadeJupiter = 24.79;
        
        // solicita ao usuário escolher um planeta
        System.out.println("Escolha um planeta para jogar a bola:");
        System.out.println("1. Terra");
        System.out.println("2. Marte");
        System.out.println("3. Júpiter");
        int escolhaPlaneta = scanner.nextInt();
        
        double gravidade = 0;
        String nomePlaneta = "";
        
        // define a gravidade e o nome do planeta escolhido
        switch (escolhaPlaneta) {
            case 1:
                gravidade = gravidadeTerra;
                nomePlaneta = "Terra";
                break;
            case 2:
                gravidade = gravidadeMarte;
                nomePlaneta = "Marte";
                break;
            case 3:
                gravidade = gravidadeJupiter;
                nomePlaneta = "Júpiter";
                break;
            default:
                System.out.println("Escolha inválida.");
                // fecha o scanner para evitar vazamento de recursos e encerra o programa
                scanner.close();
                return;
        }
        
        // solicita a velocidade inicial e o instante de tempo
        System.out.print("Digite a velocidade inicial (m/s): ");
        double v0 = scanner.nextDouble();
        System.out.print("Digite o instante de tempo (s): ");
        double t = scanner.nextDouble();
        
        // calcula a velocidade e a altura da bola
        double vt = v0 - gravidade * t;
        double ht = v0 * t - 0.5 * gravidade * t * t;
        
        // exibe os resultados
        System.out.println("Velocidade no instante t em " + nomePlaneta + ": " + vt + " m/s");
        System.out.println("Altura no instante t em " + nomePlaneta + ": " + ht + " metros");
        
        scanner.close();
    }
}