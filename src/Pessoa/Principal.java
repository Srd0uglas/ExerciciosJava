package Pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setIdade(19);
        pessoa1.setNome("Douglas");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setIdade(31);
        pessoa2.setNome("Bryan");

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setIdade(10);
        pessoa3.setNome("sophia");

        ArrayList<Pessoa> listaPessoa = new ArrayList<>();
        listaPessoa.add(pessoa1);
        listaPessoa.add(pessoa2);
        listaPessoa.add(pessoa3);
        System.out.println("Tamanho da Lista: " + listaPessoa.size());
//        System.out.printf("Primeira pessoa " + listaPessoa.get(0).toString());

        for(Pessoa pessoa : listaPessoa){
            System.out.println(pessoa);

        }



    }
}
