import java.util.Scanner;

public class CalculoMensalidadeAcademia {
    public static void main(String[] args) {
        // cria um scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // solicita e lê a idade do cliente
        System.out.print("Digite a idade do cliente: ");
        int idade = scanner.nextInt();
        
        // solicita e lê o sexo do cliente (M ou F)
        System.out.print("Digite o sexo do cliente (M ou F): ");
        char sexo = scanner.next().charAt(0);
        
        // define o valor inicial da mensalidade
        double mensalidade = 0;
        
        // calcula o valor da mensalidade com base nas condições fornecidas
        if (sexo == 'M' || sexo == 'm') {
            if (idade <= 15) {
                mensalidade = 60.00;
            } else if (idade <= 18) {
                mensalidade = 75.00;
            } else if (idade <= 30) {
                mensalidade = 90.00;
            } else if (idade <= 40) {
                mensalidade = 85.00;
            } else {
                mensalidade = 80.00;
            }
        } else if (sexo == 'F' || sexo == 'f') {
            if (idade <= 18) {
                mensalidade = 60.00;
            } else if (idade <= 25) {
                mensalidade = 90.00;
            } else if (idade <= 40) {
                mensalidade = 85.00;
            } else {
                mensalidade = 80.00;
            }
        } else {
            System.out.println("Sexo inválido.");
            // fecha o scanner para evitar vazamento de recursos e encerra o programa
            scanner.close();
            return;
        }
        
        // exibe o valor da mensalidade a ser paga pelo cliente
        System.out.println("Mensalidade a ser paga pelo cliente: R$ " + mensalidade);
        
        scanner.close();
    }
}