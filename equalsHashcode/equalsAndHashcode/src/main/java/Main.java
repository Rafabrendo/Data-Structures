import model.Carro;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Carro> ListaCarros = new ArrayList<>();

        ListaCarros.add(new Carro("Ford"));
        ListaCarros.add(new Carro("Chevrolet"));
        ListaCarros.add(new Carro("Volkswagen"));

        //Vou testar se existe um carro chamado Ford
        System.out.println(ListaCarros.contains(new Carro("Ford")));//vai me retornar True or False se a lista contiver um
        //objeto igual ao objeto fornecido como argumento de acordo com a implementação do método 'equals()'.

        System.out.println(new Carro("Ford").hashCode()); //hash 2195706
        //O método 'hashCode()' retorna um valor inteiro que representa o código hash do objeto.

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");

        System.out.println(carro1.equals(carro2)); //Retornou false
        System.out.println(carro1.equals(ListaCarros.get(0))); //true
        //Porque o primeiro elemento da lista é o Ford

        System.out.println(ListaCarros);


    }

}
