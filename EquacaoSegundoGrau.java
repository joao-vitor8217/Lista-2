import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        // cria um Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // solicita e lê os coeficientes da equação
        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();
        
        // calcula o discriminante
        double delta = b * b - 4 * a * c;
        
        // verifica as condições e imprime a mensagem correspondente
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Igualdade confirmada: 0 = 0");
        } else if (a == 0 && b == 0) {
            System.out.println("Coeficientes informados incorretamente");
        } else if (a == 0) {
            double x = -c / b;
            System.out.println("Esta é uma equação de primeiro grau: x = " + x);
        } else {
            System.out.println("Esta é uma equação de segundo grau.");
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais (delta < 0): delta = " + delta);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais: x' = x'' = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Esta equação possui duas raízes reais diferentes: delta = " + delta +
                                   ", x' = " + x1 + ", x'' = " + x2);
            }
        }
        
        scanner.close();
    }
}