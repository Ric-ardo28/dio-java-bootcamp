package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    private List<CarrinhoDeCompras> carrinhoDeComprasList;

    public ListaDeCompras() {
        this.carrinhoDeComprasList = new ArrayList<>();
    }

    public void adicionarCompras(String descricaoProduto) {
        carrinhoDeComprasList.add(new CarrinhoDeCompras(descricaoProduto));
    }

    public void removerCompras(String descricaoProduto) {
        List<CarrinhoDeCompras> produtoParaRemover = new ArrayList<>();
        for (CarrinhoDeCompras c : carrinhoDeComprasList) {
            if (c.getDescricaoProduto().equals(descricaoProduto)) {
                produtoParaRemover.add(c);
            }
        }
        carrinhoDeComprasList.removeAll(produtoParaRemover);
    }

    public int TotalDeProdutos() {
        return carrinhoDeComprasList.size();
    }

    public void obterDescricaoProduto() {
        System.out.println(carrinhoDeComprasList);
    }

    public static void main(String[] args) {
        ListaDeCompras listaDeCompras = new ListaDeCompras();
        System.out.println("Numero total de compras: " + listaDeCompras.TotalDeProdutos());
        listaDeCompras.adicionarCompras("Arroz");
        listaDeCompras.adicionarCompras("Feijão");
        listaDeCompras.adicionarCompras("Manteiga");
        listaDeCompras.adicionarCompras("Sal");
        System.out.println("Numero total de compras: " + listaDeCompras.TotalDeProdutos());
        listaDeCompras.obterDescricaoProduto();
    }
}
