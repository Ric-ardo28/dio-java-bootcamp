package list.OperacoesBasicas;

public class CarrinhoDeCompras {
    private String descricaoProduto;

    public CarrinhoDeCompras(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    @Override
    public String toString() {
        return descricaoProduto;
    }
}
