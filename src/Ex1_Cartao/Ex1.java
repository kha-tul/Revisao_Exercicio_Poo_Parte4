package Ex1_Cartao;
import Ex1_Cartao.CartaoMaster;
import Ex1_Cartao.CartaoVisa;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, n1, n2;

        System.out.println("Selecione a forma de pagamento ");
        System.out.println("1 - Visa");
        System.out.println("2 - Master");

        n = entrada.nextInt();

        if (n == 1) {
            CartaoVisa visa = new CartaoVisa();
            System.out.println("Selecione:");
            System.out.println("1 - Debito");
            System.out.println("2 - Credito");
            n1 = entrada.nextInt();

            if (n1 == 1) {
                visa.pagamentoDebito();
            } else if (n1 == 2) {
                visa.pagamentoCredito();
            } else {
                System.out.println("Numero invalido, Selecione opção 1 ou 2");
                entrada.close();
            }

        } else if (n == 2) {
            CartaoMaster master = new CartaoMaster();
            System.out.println("Selecione:");
            System.out.println("1 - Debito");
            System.out.println("2 - Credito");
            n2 = entrada.nextInt();

            if (n2 == 1) {
                master.pagamentoDebito();
            } else if (n2 == 2) {
                master.pagamentoCredito();
            } else {
                System.out.println("Numero invalido, Selecione opção 1 ou 2");
                entrada.close();
            }

        } else {
            System.out.println("Numero invalido, Selecione opção 1 ou 2");
            entrada.close();
        }

    }
}
