// Exercício 5 — Abstração (Sistema de Pagamentos)
// Implemente a classe abstrata FormaPagamento com validarPagamento() e processarPagamento(BigDecimal valor). Crie CartaoCredito, Boleto e Pix com
// validações específicas (ex.: número do cartão, formato de boleto, chave Pix). Simule o uso de cada forma por polimorfismo e trate erros de validação com exceções
// específicas (ex.: PagamentoInvalidoException).

package exe5;

import java.math.BigDecimal;

public abstract class FormaPagamento {
    public abstract void validarPagamento(String identificador);
    public abstract void processarPagamento(BigDecimal valor);
}

