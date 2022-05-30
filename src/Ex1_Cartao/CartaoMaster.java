package Ex1_Cartao;

public class CartaoMaster implements PagametoCartao{
    @Override
    public void pagamentoDebito() {
        System.out.println("Pagamento efetuado com Master Debito");
    }

    @Override
    public void pagamentoCredito() {
        System.out.println("Pagamento efetuado com Master Credito");
    }
}
