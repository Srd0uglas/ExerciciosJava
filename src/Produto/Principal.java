package Produto;

import Pessoa.Pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Banana", 3.65, 555);
        Produto produto2 = new Produto("Limão", 1.55, 160);
        Produto produto3 = new Produto("Morango", 5.98, 20);
        Produto produto4 = new Produto("Uva", 12.00, 13);


        ArrayList<Produto> listaProduto = new ArrayList<>();
        listaProduto.add(produto1);
        listaProduto.add(produto2);
        listaProduto.add(produto3);
        listaProduto.add(produto4);
        System.out.println("Tamanho da lista: " + listaProduto.size());
        System.out.println("Produto " + listaProduto.get(2));
//        System.out.println(listaProduto);


    }

}
