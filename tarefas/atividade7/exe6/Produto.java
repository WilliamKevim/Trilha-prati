package exe6;

public class Produto {
    private final Dinheiro preco;
    private final String nome;

    public Produto(String nome, Dinheiro preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public Dinheiro getPreco() { return preco; }
}
