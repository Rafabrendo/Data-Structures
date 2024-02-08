import model.Carro;

import java.util.LinkedList;
import java.util.Queue;


public class Main {

    public static void main(String[] args){

        Queue<Carro> queueCarro = new LinkedList<Carro>();

        queueCarro.add(new Carro("Ford"));
        queueCarro.add(new Carro("Chevrolet"));
        queueCarro.add(new Carro("Fiat"));
        System.out.println(queueCarro.add(new Carro("Peugeot")));
        System.out.println(queueCarro);
        System.out.println(queueCarro.element()); //Retorna mas não remove, the head of this queue
        //Esse metodo se difere do peek porque retorna uma exceção se a lista estiver vazia
        System.out.println(queueCarro.offer(new Carro("Renault"))); //Vai retornar false se não conseguir executar

        System.out.println(queueCarro.peek());//Vai me retornar a cabeça da fila, se ela estiver vazia, retorna null
        //obs.: Ele não remove o elemento da fila

        System.out.println(queueCarro.poll()); //Retorna e remove o primeiro(cabeça da fila)

        System.out.println(queueCarro.isEmpty());

        System.out.println(queueCarro.size());



    }

}
