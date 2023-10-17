import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        // cria um scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // solicita e lê o primeiro lado do triângulo
        System.out.print("Digite o lado 1 do triângulo: ");
        double lado1 = scanner.nextDouble();
        
        // solicita e lê o segundo lado do triângulo
        System.out.print("Digite o lado 2 do triângulo: ");
        double lado2 = scanner.nextDouble();
        
        // solicita e lê o terceiro lado do triângulo
        System.out.print("Digite o lado 3 do triângulo: ");
        double lado3 = scanner.nextDouble();
        
        // verifica o tipo do triângulo e imprime o resultado
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo Equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
        }
        
        scanner.close();
    }
}
