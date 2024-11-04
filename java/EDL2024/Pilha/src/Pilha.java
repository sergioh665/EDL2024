public class Pilha  implements Interface  {
        
    Object[] lista;
    int topo = -1; 
    int incremento = 0;


    Object pilhaArray[];

    public Pilha(int capacidade){
        this.lista = new Object[capacidade];
        this.incremento = 0;
    }

      

    @Override
    public int size() {
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override // verificar se está vazio
    public boolean isEmpty() {
        return this.topo == -1;
        /* throw new UnsupportedOperationException("Unimplemented method 'isEmpty'"); */
    }

    @Override
    public Object top() throws PilhaVaziaExcecao {
        throw new UnsupportedOperationException("Unimplemented method 'top'");
    }

    @Override
    public void push(Object o) {
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }

    @Override
    public Object pop() throws PilhaVaziaExcecao {
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }
}
