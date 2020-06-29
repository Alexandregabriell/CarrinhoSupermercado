package Principal;

public class Item {
    private int numitem;
    private Produto produto;
    private int qtd;
    private double precototalItem;

    public Item(int numitem, Produto produto, int qtd) {
        this.numitem = numitem;
        this.produto = produto;
        this.qtd = qtd;
    }

    public int getNumitem() {
        return numitem;
    }

    public void setNumitem(int numitem) {
        this.numitem = numitem;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPrecototalItem() {
        return produto.getPrecounit() * qtd;
    }

    public void setPrecototalItem(double precototalItem) {
        this.precototalItem = precototalItem;
    }
}
