package exe5;

import java.math.BigDecimal;

public class Pix extends FormaPagamento {
    @Override
    public void validarPagamento(String chave) {
        if (chave == null || chave.isEmpty())
            throw new IllegalArgumentException("Chave Pix inválida.");
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        System.out.println("Pix enviado no valor de R$" + valor);
    }
}
