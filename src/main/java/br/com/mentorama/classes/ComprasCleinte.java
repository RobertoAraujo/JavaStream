package br.com.mentorama.classes;

import br.com.mentorama.constantes.Turno;

public class ComprasCleinte extends Cliente {
    private int idCompra;
    private double compraValor;
    private Turno turno;

    public ComprasCleinte(int idCompra, double compraValor, Turno turno, String nome, String cpf, int idProduto, String nomeProduto, Long quantidade, double valor) {
        super(idCompra, nome, cpf, idProduto, nomeProduto, Math.toIntExact(quantidade), valor);
        this.idCompra = idCompra;
        this.compraValor = compraValor;
        this.turno = turno;
    }

    public ComprasCleinte() {

    }

    public int getIdCliente() {
        return idCompra;
    }

    public void setIdCliente(int idCliente) {
        this.idCompra = idCliente;
    }

    public double getCompraValor() {
        return compraValor;
    }

    public void setCompraValor(double compraValor) {
        this.compraValor = compraValor;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Object somaCompra(Cliente cliente) {
        if (cliente.getIdCliente() == cliente.getIdCliente()) {
            double compra = (cliente.getValor() + cliente.getValor());
            return compra;
        } else {
            System.out.println("Sem explicação, mais acho que o cliente não é o mesmo! ");
        }
        return null;
    }

    @Override
    public String toString() {
        return "CompraDeCleinte{" +
                ", idCompra=" + idCompra +
                ", compraValor=" + getCompraValor() +
                ", turno=" + getTurno() +
                ", idCliente=" + getIdCliente() +
                ", nomeProduto=" + getNome() +
                ", cpf=" + getCpf() +
                ", idProduto=" + getIdProduto() +
                ", nomeProduto=" + getNome() +
                ", quantidade=" + getQuantidade() +
                ", valor=" + getValor() +
                '}';
    }
}
