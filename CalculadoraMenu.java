import java.util.Scanner;

public class CalculadoraMenu {
    public static void main(String[] args) {
        // cria um Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // solicita e lê os dois números
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        // apresenta o menu de opções
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Somar os dois números");
        System.out.println("2 - Multiplicar os dois números");
        System.out.println("3 - Subtrair o número maior pelo número menor");
        System.out.println("4 - Dividir o primeiro número pelo segundo");
        
        // lê a opção do usuário
        int opcao = scanner.nextInt();
        
        // realiza a operação correspondente à opção escolhida
        double resultado = 0;
        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = Math.abs(num1 - num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        
        scanner.close();
    }
}