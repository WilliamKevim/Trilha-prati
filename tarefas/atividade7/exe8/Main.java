package exe8;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Pedido p = new Pedido(new BigDecimal("500.00"), "12345678", new Sedex());
        System.out.println("Frete Sedex: " + p.calcularFrete());

        p.setEstrategia(new Pac());
        System.out.println("Frete PAC: " + p.calcularFrete());

        p.setEstrategia(new RetiradaNaLoja());
        System.out.println("Frete Retirada: " + p.calcularFrete());

        // Promoção: frete grátis acima de 300
        p.setEstrategia(pedido -> pedido.getValor().compareTo(new BigDecimal("300")) > 0 ? BigDecimal.ZERO : new BigDecimal("20.00"));
        System.out.println("Frete Promocional: " + p.calcularFrete());
    }
}
