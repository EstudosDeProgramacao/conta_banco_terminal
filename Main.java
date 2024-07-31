
import src.ContaTerminal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        ContaTerminal conta = new ContaTerminal();
        Scanner in = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        conta.setAgencia(in.next());

        System.out.print("Por favor, digite o número da Conta: ");
        conta.setNumero(in.nextInt());

        System.out.print("Por favor, digite o seu nome: ");
        conta.setNomeCliente(in.next());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());
    }
}
