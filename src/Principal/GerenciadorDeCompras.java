package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GerenciadorDeCompras {

    static String solicitarNomeCliente() {
        System.out.println("DIGITE SEU NOME");
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        return nome;
    }

    public static void mostrarProdutos(List<Produto> produtos){
        System.out.println("################### PRODUTOS ###################");
        for (Produto produto : produtos){
            String msg = produto.toString();
            System.out.println(msg);
        }
    }

    public static List<Produto> solicitarEscolhaDoProduto(List<Produto> produtos){
        System.out.println("\nESCOLHA O CODIGO DO PRODUTO");
        Scanner sc = new Scanner(System.in);
        int escolha = sc.nextInt();
        List<Produto> produto= produtos.stream().filter(x -> x.getCodigo() == escolha).collect(Collectors.toList());

        return produto;
    }

    public static boolean solicitarConfirmacao(){
        System.out.println("DIGITE 'S' PARA CONTINUAR OU 'N' PARA SAIR");
        Scanner sc = new Scanner(System.in);
        String confirmacao = sc.next();
        if (confirmacao.equals("s") || confirmacao.equals("S")){
            return true;
        }else {
            return false;
        }
    }

    public static int solicitarQtd(){
        System.out.println("DIGITE A QUANTIDADE DO PRODUTO");
        Scanner sc = new Scanner(System.in);
        int qtd = sc.nextInt();

        return qtd;
    }

    public static void mostrarResumoCompra(Carrinho carrinho){
        carrinho.mostrarResumo();
    }

    public static List<Produto> instanciarProdutos(){
        List<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto(1 , "COMPUTADOR ", 2000.00);
        Produto produto2 = new Produto(2 , "NOTEBOOK ", 1500.00);
        Produto produto3 = new Produto(3 , "MOUSE ", 50.00);
        Produto produto4 = new Produto(4 , "TV ", 2500.00);
        Produto produto5 = new Produto(5 , "HD ", 300.00);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);

        return produtos;
    }
}
