public class main {
    public static void main(String[] args) {
        //Cria a pilha
        Pilha pilha = new Pilha();

        //Add item na pilha

        pilha.push(new No(1));
        pilha.push(new No(2));
        System.out.println(pilha);

        //Verifica se a pilha ta vazia
        System.out.println(pilha.isEmpty());

        //Exibe o item do topo
        System.out.println(pilha.top());

        System.out.println(pilha.pop());
        System.out.println(pilha);

    }
}
