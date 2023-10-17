import java.util.Scanner;

public class VerificarTriangulo {
    public static void main(String[] args) {
        // cria um Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // solicita e lê os três lados do triângulo
        System.out.print("Informe o primeiro lado em cm: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Informe o segundo lado em cm: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Informe o terceiro lado em cm: ");
        double lado3 = scanner.nextDouble();
        
        // verifica as condições para determinar se os lados formam um triângulo
        boolean condicao1 = Math.abs(lado2 - lado3) < lado1 && lado1 < lado2 + lado3;
        boolean condicao2 = Math.abs(lado1 - lado3) < lado2 && lado2 < lado1 + lado3;
        boolean condicao3 = Math.abs(lado1 - lado2) < lado3 && lado3 < lado1 + lado2;
        
        // verifica se todas as condições são verdadeiras e imprime o resultado
        if (condicao1 && condicao2 && condicao3) {
            System.out.println("Resposta: os três valores informados podem ser os comprimentos dos lados de um triângulo.");
        } else {
            System.out.println("Resposta: os três valores informados não podem ser os comprimentos dos lados de um triângulo.");
        }
        
        scanner.close();
    }
}