public class Produto {
    private String nome;
    private Double preço;
    private Integer quantidade;

    public Produto(String nome, Double preço, Integer quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    public Integer getQuantidadeEstoque() {
        return quantidade;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidade = quantidadeEstoque;
    }
}
