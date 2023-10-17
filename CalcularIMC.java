import java.util.Scanner;

public class CalcularIMC {
    public static void main(String[] args) {
        // cria um scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // solicita e lê o peso em kg
        System.out.print("Digite o peso): ");
        double peso = scanner.nextDouble();
        
        // solicita e lê a altura em metros
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();
        
        // calcula o IMC
        double imc = peso / (altura * altura);
        
        // determina a situação de peso e imprime a mensagem correspondente
        if (imc < 20) {
            System.out.println("Abaixo do Peso");
        } else if (imc >= 20 && imc < 25) {
            System.out.println("Normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc <= 40) {
            System.out.println("Obesidade");
        } else {
            System.out.println("IMC fora do intervalo válido.");
        }
        
        scanner.close();
    }
}





