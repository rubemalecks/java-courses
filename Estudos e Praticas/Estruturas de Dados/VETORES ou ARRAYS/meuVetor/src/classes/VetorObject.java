package classes;

public class VetorObject {

    private Object[] elementos;
    private int tamanho;

    public VetorObject(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public boolean adiciona(Object elemento) {
        aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }


    public boolean adiciona(int pos, Object elemento) {
        aumentaCapacidade();
        if (!(pos >= 0 && pos < tamanho)) { // verifica se [pos] é valida
            throw new IllegalArgumentException("Posição inválida!");
        }
        for (int i = this.tamanho - 1; i >= pos; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[pos] = elemento;
        this.tamanho++;
        return true;
    }

    public void remover(int pos){
        if (!(pos >= 0 && pos <= tamanho)) { // verifica se [pos] é valida
            throw new IllegalArgumentException("Posição inválida!");
        }
        for (int i = pos; i < this.tamanho-1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho --;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            Object[] elementosNovos = new Object[this.tamanho * 2];
            for (int i = 0; i < this.tamanho; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public Object busca(int pos) {
        if (!(pos >= 0 && pos < tamanho)) { // fora do range de [pos]
            throw new IllegalArgumentException("Posição inválida!");
        }
        return this.elementos[pos];

    }

    public int busca(Object elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("["); // parecido com list python
        for (int i = 0; i < this.tamanho - 1; i++) { // vai até o penúltimo
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) { // para o ultimo item
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");

        return s.toString();
    }

}
