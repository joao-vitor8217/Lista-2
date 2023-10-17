import java.util.Scanner;

public class VerificarAprovacao {
    public static void main(String[] args) {
        // cria um scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // solicita e lê as três notas do aluno
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        // calcula a média das notas
        double media = (nota1 + nota2 + nota3) / 3;
        
        // verifica a situação do aluno e imprime a mensagem correspondente
        if (media >= 0 && media < 3) {
            System.out.println("REPROVADO");
        } else if (media >= 3 && media < 7) {
            System.out.println("EXAME");
        } else if (media >= 7 && media <= 10) {
            System.out.println("APROVADO");
        } else {
            System.out.println("Notas inválidas. As notas devem estar no intervalo de 0 a 10.");
        }
        
        scanner.close();
    }
}
