import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US); // Define o locale para o padrão americano (ponto como separador decimal)

        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da conta: ");
        numero = sc.nextInt();
        sc.nextLine(); // Limpa o buffer do scanner
        
        System.out.println("Por favor, digite o nome da agência: ");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        saldo = sc.nextDouble();
        sc.nextLine(); // Limpa o buffer do scanner

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}
