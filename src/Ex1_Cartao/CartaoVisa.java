package Ex1_Cartao;

public class CartaoVisa implements PagametoCartao {
    @Override
    public void pagamentoDebito() {
        System.out.println("Pagamento efetuado com Visa Debito");
    }

    @Override
    public void pagamentoCredito() {
        System.out.println("Pagamento efetuado com Visa Credito");
    }
}
