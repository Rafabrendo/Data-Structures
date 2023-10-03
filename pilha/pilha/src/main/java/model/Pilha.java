package model;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha(){
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAauxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAauxiliar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
        //var retorno = refNoEntradaPilha == null ? true : false;
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){

        String stringReorno = "----------\n";
        stringReorno += "    Pilha   \n";
        stringReorno += "----------\n";

        No noAuxiliar = refNoEntradaPilha;
        //No que vou usar para percorrer a pilha

        while(true){
            if(noAuxiliar != null){
                stringReorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo(); //recebe a referencia para o próximo nó


            }else{
                break;
            }
        }
        stringReorno += "===========\n";
        return stringReorno;

    }

}
