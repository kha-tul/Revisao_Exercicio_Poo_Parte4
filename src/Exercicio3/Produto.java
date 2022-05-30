package Exercicio3;

public class Produto {
    private String descricao;
    private float valorReal;
    private boolean operacao;
    private float percentual;
    private float valorFinal;

    public Produto(String descricao, float valorReal, boolean operacao, float percentual) {
        this.descricao = descricao;
        this.valorReal = valorReal;
        this.operacao = operacao;
        this.percentual = percentual;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorReal() {
        return valorReal;
    }

    public void setValorReal(float valorReal) {
        this.valorReal = valorReal;
    }

    public boolean isOperacao() {
        return operacao;
    }

    public void setOperacao(boolean operacao) {
        this.operacao = operacao;
    }

    public float getPercentual() {
        return percentual;
    }

    public void setPercentual(float percentual) {
        this.percentual = percentual;
    }

    public float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(float valorFinal) {
        this.valorFinal = valorFinal;
    }

    public void increaseOrDiscount() {
        float increaseOrDiscount = this.getValorReal() * (this.getPercentual() / 100);

        if (this.operacao) {
            this.valorFinal = this.valorReal + increaseOrDiscount;
            System.out.printf("O valor final do produto com aumento é: %.2f\n", this.valorFinal);

        } else {
            this.valorFinal = this.valorReal - increaseOrDiscount;
            System.out.printf("O valor final do produto com desconto é: %.2f\n", this.valorFinal);
        }
    }
}
