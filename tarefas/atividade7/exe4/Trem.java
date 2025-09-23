package exe4;

public class Trem implements IMeioTransporte {
    private int velocidade = 0;

    public void acelerar() {
        if (velocidade >= 300) throw new IllegalStateException("Trem no limite!");
        velocidade += 50;
        System.out.println("Trem acelerou. Velocidade: " + velocidade);
    }

    public void frear() {
        if (velocidade == 0) throw new IllegalStateException("Trem já parado!");
        velocidade -= 50;
        System.out.println("Trem freiou. Velocidade: " + velocidade);
    }
}
