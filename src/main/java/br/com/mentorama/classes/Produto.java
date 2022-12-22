package br.com.mentorama.classes;

public class Produto {
    private int idProduto;
    private String nome;
    private int quantidade;
    private double valor;

    public Produto(int idProduto, String nome, int quantidade, double valor) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Produto() {
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", nome='" + nome + "\'" +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                '}';
    }
}
