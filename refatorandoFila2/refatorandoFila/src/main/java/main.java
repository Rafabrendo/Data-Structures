import model.Fila;
import model.No;

public class main {
    public static void main(String[] args){

        Fila<String> minhaFila = new Fila<>();
        //FIFO(First in, First out)
        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");


        System.out.println(minhaFila);
        System.out.println();
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila.first());

        minhaFila.enqueue("ultimo");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

    }
}
