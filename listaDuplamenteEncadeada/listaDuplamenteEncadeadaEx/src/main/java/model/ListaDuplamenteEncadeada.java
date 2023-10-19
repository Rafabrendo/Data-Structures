package model;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;
    //Adicionei esse metodo para tirar a necessidade de percorrer a lista para saber o tamanho dela.

    public ListaDuplamenteEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
        //Como eu estou retornando o index e não o no, é só retornar o conteudo dele.
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i= 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public int size(){
        return tamanhoLista;
    }

}
