package exe6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dinheiro preco1 = new Dinheiro(new BigDecimal("100.00"), Moeda.BRL);
        Dinheiro preco2 = new Dinheiro(new BigDecimal("200.00"), Moeda.BRL);
        Produto prod1 = new Produto("Livro", preco1);
        Produto prod2 = new Produto("Mouse", preco2);

        ItemCarrinho item1 = new ItemCarrinho(prod1, 2);
        ItemCarrinho item2 = new ItemCarrinho(prod2, 1);
        Carrinho carrinho = new Carrinho(Arrays.asList(item1, item2));

        System.out.println("Carrinho inicial:");
        for (ItemCarrinho item : carrinho.getItens()) {
            System.out.println(item.getProduto().getNome() + " x" + item.getQuantidade() + " - R$" + item.getProduto().getPreco().valor());
        }

        // Aplicar cupom de desconto (máx 30%)
        BigDecimal desconto = new BigDecimal("0.25"); // 25%
        Carrinho carrinhoComDesconto = aplicarCupom(carrinho, desconto);
        System.out.println("\nCarrinho com desconto de 25%:");
        for (ItemCarrinho item : carrinhoComDesconto.getItens()) {
            System.out.println(item.getProduto().getNome() + " x" + item.getQuantidade() + " - R$" + item.getProduto().getPreco().valor());
        }

        // Teste de cupom inválido
        try {
            aplicarCupom(carrinho, new BigDecimal("0.5")); // 50%
        } catch (Exception e) {
            System.out.println("\nErro ao aplicar cupom: " + e.getMessage());
        }
    }

    // Aplica cupom de desconto (máx 30%) e retorna novo carrinho
    public static Carrinho aplicarCupom(Carrinho carrinho, BigDecimal percentual) {
        if (percentual.compareTo(new BigDecimal("0.3")) > 0) {
            throw new IllegalArgumentException("Cupom não pode ser maior que 30%");
        }
        List<ItemCarrinho> novosItens = carrinho.getItens().stream().map(item -> {
            BigDecimal novoValor = item.getProduto().getPreco().valor()
                .multiply(BigDecimal.ONE.subtract(percentual))
                .setScale(2, RoundingMode.HALF_EVEN);
            Dinheiro novoPreco = new Dinheiro(novoValor, item.getProduto().getPreco().moeda());
            Produto novoProduto = new Produto(item.getProduto().getNome(), novoPreco);
            return new ItemCarrinho(novoProduto, item.getQuantidade());
        }).toList();
        return new Carrinho(novosItens);
    }
}
