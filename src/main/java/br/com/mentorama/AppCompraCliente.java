package br.com.mentorama;

import br.com.mentorama.classes.ComprasCleinte;
import br.com.mentorama.classes.Produto;
import br.com.mentorama.constantes.Turno;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class AppCompraCliente {
    public static void main(String[] args) {


        ComprasCleinte comprasCleinte01 = new ComprasCleinte(1, 30.05, Turno.MANHA, "Roberto A Moraes", "000.000.000-00", 1, "Batata Palha", 1L, 2.50);
        ComprasCleinte comprasCleinte02 = new ComprasCleinte(2, 120.05, Turno.MANHA, "Arthur A Moraes", "000.000.000-00", 2, "Batata ", 3L, 5.50);
        ComprasCleinte comprasCleinte03 = new ComprasCleinte(3, 30.05, Turno.MANHA, "Raimunda C Cruz", "000.000.000-00", 3, "Café", 3L, 2.50);
        ComprasCleinte comprasCleinte04 = new ComprasCleinte(4, 150.05, Turno.MANHA, "Herinque A Moraes", "000.000.000-00", 4, "Lasanhã Congelada", 1L, 10.50);
        ComprasCleinte comprasCleinte05 = new ComprasCleinte(5, 30.05, Turno.MANHA, "Raimunda C Cruz", "000.000.000-00", 5, "Arroz", 1L, 2.50);
        ComprasCleinte comprasCleinte06 = new ComprasCleinte(6, 30.05, Turno.MANHA, "Raimunda C Cruz", "000.000.000-00", 6, "feijão", 1L, 2.50);
        ComprasCleinte comprasCleinte07 = new ComprasCleinte(7, 30.05, Turno.MANHA, "Roberto A Moraes", "000.000.000-00", 1, "Coca Cola", 2L, 5.50);
        ComprasCleinte comprasCleinte08 = new ComprasCleinte(8, 30.05, Turno.MANHA, "Herinque A Moraes", "000.000.000-00", 1, "Batata Palha", 2L, 2.50);
        ComprasCleinte comprasCleinte09 = new ComprasCleinte(9, 30.05, Turno.MANHA, "Herinque A Moraes", "000.000.000-00", 7, "Babalu Chicle de Bola", 50L, 1.50);
        ComprasCleinte comprasCleinte10 = new ComprasCleinte(10, 30.05, Turno.MANHA, "Herinque A Moraes", "000.000.000-00", 1, "Batata Palha", 1L, 2.50);

        List<ComprasCleinte> comprasList = List.of(comprasCleinte01, comprasCleinte02, comprasCleinte03, comprasCleinte04, comprasCleinte05, comprasCleinte06,
                comprasCleinte07, comprasCleinte08, comprasCleinte09, comprasCleinte10);

        System.out.println(comprasList);

        Object compra01 = comprasCleinte01.somaCompra(comprasCleinte01);
        Object compra02 = comprasCleinte01.somaCompra(comprasCleinte02);
        Object compra03 = comprasCleinte01.somaCompra(comprasCleinte03);
        Object compra04 = comprasCleinte01.somaCompra(comprasCleinte04);
        Object compra05 = comprasCleinte01.somaCompra(comprasCleinte05);
        Object compra06 = comprasCleinte01.somaCompra(comprasCleinte06);
        Object compra07 = comprasCleinte01.somaCompra(comprasCleinte07);
        Object compra08 = comprasCleinte01.somaCompra(comprasCleinte08);
        Object compra09 = comprasCleinte01.somaCompra(comprasCleinte09);
        Object compra10 = comprasCleinte01.somaCompra(comprasCleinte10);

        System.out.println("Compra compra01 R$ " + compra01 + " Compra compra02 R$ " + compra02 + " Compra compra03 R$ " + compra03 + " Compra compra04 R$ " + compra04 + " Compra compra05 R$ " + compra05 +
                " Compra compra06 R$ " + compra06 + " Compra compra07 R$ " + compra07 + " Compra compra08 R$ " + compra08 + " Compra compra09 R$ " + compra09 + " Compra compra10 R$ " + compra10);

        Optional<ComprasCleinte> maiorCompra = comprasList.stream().max(Comparator.comparing(ComprasCleinte::getValor));
        Optional<ComprasCleinte> menorCompra = comprasList.stream().min(Comparator.comparing(ComprasCleinte::getValor));

        Stream<ComprasCleinte> stream = comprasList.stream();
        DoubleStream doubleStream = stream.mapToDouble(Produto::getValor);
        OptionalDouble optionalDouble = doubleStream.average();
        double media = optionalDouble.orElse(0.0);

        System.out.println("maior " + maiorCompra);
        System.out.println("menor " + menorCompra);
        System.out.println("Media Aqui " + media);

    }
}
