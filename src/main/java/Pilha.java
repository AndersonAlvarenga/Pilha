public class Pilha {

    private No noReferencia;

    public Pilha() {
        this.noReferencia = null;
    }

    public boolean isEmpty() {
        /*if(this.noReferencia == null){
            return true
        }else{
            return false;*/
        //pode refatorar desta forma pra ficar em apenas uma linha
        return this.noReferencia == null ? true : false;
    }

    public No top() {
        return this.noReferencia;
    }

    public void push(No novoNo) {
        No noAux = this.noReferencia;
        this.noReferencia = novoNo;
        this.noReferencia.setProximoNo(noAux);

    }
    public No pop(){
        if(!isEmpty()){
            No ref = this.noReferencia;
            this.noReferencia=this.noReferencia.getProximoNo();
            return ref;
        }else{
            return null;
        }
    }
    @Override
    public String toString(){
        String stringRetorno = "----------------------\n";
        stringRetorno+="         Pilha\n";
        stringRetorno+="------------------------\n";

        No noAux = this.noReferencia;
        while(true){
            if(noAux != null){
                stringRetorno += "[No{dado="+noAux.getDado()+"}]\n";
                noAux=noAux.getProximoNo();
            }else{
                break;
            }
        }
        stringRetorno+="===========================";
        return stringRetorno;
    }
}

