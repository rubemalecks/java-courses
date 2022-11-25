public class ListaSE{
  private int tamMax; // capacidade
  private int tamAtual;
  private String dados[];

  //operacao criacao
  public ListaSE(int capacidade){
      tamMax = capacidade;
      tamAtual = 0;
      dados = new String[tamMax];    
  }

  public boolean vazia(){
      if (tamAtual == 0)
        return true;
      return false;
  }

  public boolean cheia(){
      if (tamAtual == tamMax)
        return true;
      return false;
  }

  public int tamanho(){
    return tamAtual;
  }

  public boolean insere(String elem){
    if (cheia()) {
      return false;
    }

    dados[tamAtual] = elem;
    tamAtual++; // tamAtual += 1
    return true;
    
  }

  // retorna o elemento em uma posicao informada
  public String busca(int posicao){
    return dados[posicao];
  }

  // retorna a posicao de um elemento que foi informado
  // caso o elemento nao existe retorna -1
  public int busca(String elem){
    for (int i=0; i < tamAtual; i++){
      if (dados[i].equals(elem)) // elem.equals(dados[i])
        return i;
    }
    return -1;
  }

  public boolean remover(String elem){
    //1o caso: lista vazia (nao remover)
    if (vazia())
      return false;

    //2o caso: elemento nao se encontra na lista
    int pos = busca(elem);
    if (pos == -1)
      return false;

    //dois casos em um
    /*if (vazia() || pos==-1)
      return false;*/

    for (int i=pos; i< tamAtual -1; i++){
      dados[i] = dados[i+1];
    }
    tamAtual--; //tamAtual -= 1
    return true;
  }

  public void exibe(){
    for (int i=0; i < tamAtual; i++){
      System.out.print(dados[i] + " ");
    }
  }
  
  
  
}