package exe6;

import java.math.BigDecimal;
import java.util.Objects;

public record Dinheiro(BigDecimal valor, Moeda moeda) {
    public Dinheiro {
        if (valor.compareTo(BigDecimal.ZERO) < 0)
            throw new IllegalArgumentException("Valor não pode ser negativo.");
        Objects.requireNonNull(moeda);
    }
}
