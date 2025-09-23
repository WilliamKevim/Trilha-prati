// Exercício 2 — Encapsulamento com Validação de Regra (Desconto)
// Estenda Produto com o método aplicarDesconto(double porcentagem). Permita apenas valores entre 0 e 50 (inclusive) e lance exceção (IllegalArgumentException
// ou DescontoInvalidoException) se a regra for violada. Mostre, em um main ou testes, o preço antes/depois do desconto e a reação a entradas inválidas.

package exe2;

import exe1.Produto;

public class ProdutoComDesconto extends Produto {

    public ProdutoComDesconto(String nome, double preco, int quantidadeEmEstoque) {
        super(nome, preco, quantidadeEmEstoque);
    }

    public void aplicarDesconto(double porcentagem) {
        if (porcentagem < 0 || porcentagem > 50) {
            throw new IllegalArgumentException("Desconto deve estar entre 0% e 50%.");
        }
        double novoPreco = getPreco() * (1 - porcentagem / 100);
        setPreco(novoPreco);
    }
}

