package exe4;

public class Bicicleta implements IMeioTransporte {
    private int velocidade = 0;

    public void acelerar() {
        if (velocidade >= 40) throw new IllegalStateException("Velocidade máxima da bicicleta atingida!");
        velocidade += 5;
        System.out.println("Bike acelerou. Velocidade: " + velocidade);
    }

    public void frear() {
        if (velocidade == 0) throw new IllegalStateException("Bike já parada!");
        velocidade -= 5;
        System.out.println("Bike freiou. Velocidade: " + velocidade);
    }
}
