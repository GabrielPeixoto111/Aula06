import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> produtos;

    public Pedido() {
        produtos = new ArrayList<>();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public Double calcularValorTotal() {
        double valor = 0.0;
        for(Produto p: produtos) {
            valor += p.getPreço() * p.getQuantidadeEstoque();
        }
        return valor;
    }
}
