package br.com.mentorama.classes;

import java.util.Objects;

public class Cliente extends Produto{
    private int idCliente;
    private  String nome;
    private String cpf;

    public Cliente(int idCliente, String nome, String cpf, int idProduto, String nomeProduto, int quantidade, double valor) {
        super(idProduto, nomeProduto, quantidade, valor);
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(idCliente, cliente.idCliente) && Objects.equals(nome, cliente.nome) && Objects.equals(cpf, cliente.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, nome, cpf);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idProduto=" + getIdProduto() +
                ", nomeProduto='" + getNome() + "\'"+
                ", quantidade=" + getQuantidade() +
                ", valor=" + getValor() +
                '}';
    }
}
