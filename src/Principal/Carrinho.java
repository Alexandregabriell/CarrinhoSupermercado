package Principal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Carrinho {
    private static Date dataCompra;
    private static String nomeCliente;
    private static double precoTotal;
    private List<Item> itens = new ArrayList<>();

    public Carrinho(Date dataCompra, String nomeCliente, double precototal) {
        this.dataCompra = dataCompra;
        this.nomeCliente = nomeCliente;
        this.precoTotal = precototal;
    }

    public Carrinho() {
    }

    public static Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public static String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public static double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;

    }

    public List<Item> getItens() {
        return itens;
    }

    public void addItem(Item item) {
        itens.add(item);
    }

    private void somarCompra() {
        double soma = 0.0;

        for (Item item : itens) {
            soma += item.getPrecototalItem();
        }
        setPrecoTotal(soma);
    }

    public void mostrarResumo() {
        somarCompra();
        ArrayList<String> lines = new ArrayList<>();

        lines.add("#############################################");
        lines.add("########### RESUMO DA COMPRA ################");
        lines.add("CLIENTE: " + getNomeCliente());
        lines.add("DATA: " + getDataCompra());
        lines.add("#############################################\n");

        for (Item item : itens) {
            double qtd = item.getQtd();
            double precoItem = item.getPrecototalItem();
            Produto produto = item.getProduto();
            lines.add("ITEM " + item.getNumitem());
            lines.add("PRODUTO: " + produto.getDescricao() + "| VALOR DO ITEM: " + qtd + " x R$ " + produto.getPrecounit() + " = R$" + precoItem);
        }

        lines.add("\n##############################################");
        lines.add("VALOR TOTAL DA COMPRA: R$" + getPrecoTotal());
        lines.add("##############################################");
        lines.add("----------------------------------------------");

        mostrarResumoTela(lines);

        solicitarProcessamento(lines);
    }

    public static void solicitarProcessamento(ArrayList<String> lines){
        GeradorTxt geradorTxt = new GeradorTxt(lines);
    }

    public static void mostrarResumoTela(ArrayList<String> resumo){
        resumo.forEach(x -> System.out.println(x));

    }
}



