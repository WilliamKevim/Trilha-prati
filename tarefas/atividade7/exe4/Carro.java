package exe4;

public class Carro implements IMeioTransporte {
    private int velocidade = 0;

    public void acelerar() {
        if (velocidade >= 180) throw new IllegalStateException("Velocidade máxima atingida!");
        velocidade += 20;
        System.out.println("Carro acelerou. Velocidade: " + velocidade);
    }

    public void frear() {
        if (velocidade == 0) throw new IllegalStateException("Carro já está parado!");
        velocidade -= 20;
        System.out.println("Carro freiou. Velocidade: " + velocidade);
    }
}
