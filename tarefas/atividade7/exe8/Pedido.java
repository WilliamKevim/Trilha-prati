package exe8;

import java.math.BigDecimal;

public class Pedido {
    private final BigDecimal valor;
    private final String cep;
    private CalculadoraFrete estrategia;

    public Pedido(BigDecimal valor, String cep, CalculadoraFrete estrategia) {
        if (cep == null || cep.length() != 8)
            throw new IllegalArgumentException("CEP inválido.");
        this.valor = valor;
        this.cep = cep;
        this.estrategia = estrategia;
    }

    public void setEstrategia(CalculadoraFrete estrategia) {
        this.estrategia = estrategia;
    }

    public BigDecimal calcularFrete() {
        return estrategia.calcular(this);
    }

    public BigDecimal getValor() { return valor; }
    public String getCep() { return cep; }
}
