import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

       double numero = 0;
       String agencia = null;
       String nomeCliente = null;
       double saldo = 0;

       Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número bancário ");
        numero = scan.nextDouble();
        System.out.println("Por favor, digite o da agência ");
        agencia = scan.next();
        System.out.println("Por favor, digite seu nome ");
        nomeCliente = scan.next();
        System.out.println("Por favor, digite o número bancário ");
        saldo = scan.nextDouble();

    System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
       
    }
}
