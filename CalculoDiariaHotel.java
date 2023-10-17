import java.util.Scanner;

public class CalculoDiariaHotel {
    public static void main(String[] args) {
        // cria um scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // solicita e lê o tipo de apartamento (Simples ou Duplo)
        System.out.print("Digite o tipo de apartamento (S para Simples ou D para Duplo): ");
        char tipoApartamento = scanner.next().charAt(0);
        
        // solicita e lê o número de diárias
        System.out.print("Digite o número de diárias: ");
        int numeroDiarias = scanner.nextInt();
        
        // define o preço inicial da diária de acordo com o tipo de apartamento
        double precoDiaria = 0;
        if (tipoApartamento == 'S' || tipoApartamento == 's') {
            if (numeroDiarias < 10) {
                precoDiaria = 100.00;
            } else if (numeroDiarias >= 10 && numeroDiarias <= 15) {
                precoDiaria = 90.00;
            } else {
                precoDiaria = 80.00;
            }
        } else if (tipoApartamento == 'D' || tipoApartamento == 'd') {
            if (numeroDiarias < 10) {
                precoDiaria = 140.00;
            } else if (numeroDiarias >= 10 && numeroDiarias <= 15) {
                precoDiaria = 120.00;
            } else {
                precoDiaria = 100.00;
            }
        } else {
            System.out.println("Tipo de apartamento inválido.");
            // fecha o scanner para evitar vazamento de recursos e encerra o programa
            scanner.close();
            return;
        }
        
        // calcula o total a ser pago pelo hóspede
        double totalPagar = precoDiaria * numeroDiarias;
        
        // exibe o total a ser pago
        System.out.println("Total a ser pago pelo hóspede: R$ " + totalPagar);
        
        scanner.close();
    }
}