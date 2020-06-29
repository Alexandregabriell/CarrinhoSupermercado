package Principal;

import Excecoes.ProductExeption;

import java.util.*;

public class Aplicacao {
    public static void main(String[] args) throws ProductExeption {
        List<Produto> produtos = new ArrayList<>();//instanciando lista de produtos
        produtos = GerenciadorDeCompras.instanciarProdutos();
        comecarProcesso(produtos);
    }

    private static void comecarProcesso(List<Produto> produtos) throws ProductExeption {
        Carrinho carrinho = new Carrinho();
        int indice = 0;
        boolean flag = true;

        String nomeCliente = GerenciadorDeCompras.solicitarNomeCliente();
        carrinho.setNomeCliente(nomeCliente);
        carrinho.setDataCompra(new Date(System.currentTimeMillis()));

        while (flag) {
            try {
                GerenciadorDeCompras.mostrarProdutos(produtos);
                Produto prod = GerenciadorDeCompras.solicitarEscolhaDoProduto(produtos).get(0);
                int qtd = GerenciadorDeCompras.solicitarQtd();

                if (prod != null) {
                    indice++;
                    carrinho.addItem(new Item(indice, prod, qtd));
                } else {
                    throw new ProductExeption("PRODUTO NAO ENCONTRADO");
                }
                flag = GerenciadorDeCompras.solicitarConfirmacao();

            } catch (Exception e) {
                System.out.println("PRODUTO NAO ENCONTRADO");
            }
        }
        GerenciadorDeCompras.mostrarResumoCompra(carrinho);
    }

}