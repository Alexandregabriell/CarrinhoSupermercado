package Principal;

public class Produto {
    private int codigo;
    private String descricao;
    private double precounit;

    public Produto(int codigo, String descricao, double precounit) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precounit = precounit;
    }

    public Produto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecounit() {
        return precounit;
    }

    public void setPrecounit(double precounit) {
        this.precounit = precounit;
    }

    @Override
    public String toString() {
        return "Cod: " + getCodigo() + "|" + " Descricao: " + getDescricao() + "|" + " Valor: R$ " + getPrecounit();
    }
}
