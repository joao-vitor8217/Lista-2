import java.util.Scanner;

public class VerificarAprovacao {
    public static void main(String[] args) {
        // cria um scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // solicita e lê a primeira nota
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        // solicita e lê a segunda nota
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        // calcula a média das notas
        double media = (nota1 + nota2) / 2;
        
        // verifica a situação do aluno e imprime o resultado
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        
        scanner.close();
    }
}
