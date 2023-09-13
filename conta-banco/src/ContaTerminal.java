import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    private static Scanner scanner;

    public static void main(String[] args) throws Exception {

        int numero;
        String agencia, nomeCliente;
        double saldo;

        scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da conta ! ");
        numero = lerInteiro();
                
        System.out.print("Por favor, digite o número da Agência ! ");
        agencia = scanner.nextLine();
        
        System.out.print("Por favor, digite o nome do cliente ! ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da conta ! ");
        saldo = lerNumerico();

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }

    private static int lerInteiro() {
        String digitado = "";    
        digitado = scanner.nextLine();    
        return Integer.parseInt(digitado);
    }
    
    private static double lerNumerico() {
        String digitado = "";    
        digitado = scanner.nextLine();    
        return Double.parseDouble(digitado);
    }
}
