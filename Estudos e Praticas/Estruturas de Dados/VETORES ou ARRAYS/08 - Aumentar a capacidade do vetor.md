# Aumentar Capacidade do vetor

````java
    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.tamanho*2];
            for (int i = 0; i < this.tamanho; i++){
                elementosNovos[i] = this.elementos[i];
                }
            this.elementos = elementosNovos;
            }
        }   
````

````java 
aumentaCapacidade()
````
 // deve ser adicionado logo apos a assinatura dos métodos "adiciona()"