package exe5;

import java.math.BigDecimal;

public class Boleto extends FormaPagamento {
    @Override
    public void validarPagamento(String codigo) {
        if (codigo == null || codigo.length() != 47)
            throw new IllegalArgumentException("Boleto inválido.");
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        System.out.println("Boleto gerado no valor de R$" + valor);
    }
}
