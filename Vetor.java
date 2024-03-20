import java.util.Arrays;

public class Vetor {
  private String[] elementos;
  private int tamanho;

  //METODO CONSTRUTOR

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    //METODO PARA ADICIONAR


    public void adiciona(String elemento)throws Exception{
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }
    }

    private void aumentaCapacidade() {
    }

    //METODO PARA INFORMAR A QUANTIDADE DE DADOS DO VETOR

    public int tamanho(){
        return this.tamanho;
    }

    //METODO PARA EXIBIÇÃO DO VETOR

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i=0; i < this.tamanho - 1; i++){
            s.append(this.elementos[i]);
            s.append(",");
        }

        if(this.tamanho > 0){
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");

        return s.toString();
    }

    //MÉTODO DE BUSCA

    public String busca(int posicao)throws Exception{
        if(posicao >=0 && posicao < tamanho){
            return elementos[posicao];
        }else{
            throw new Exception("posição Inválida");
        }
    }

    //MÉTODO DE BUSCA VETOR PELO CONTEUDO

    public int busca1 (String elemento){
        for (int i=0; i < tamanho; i++){
            if(elementos[i].equalsIgnoreCase(elemento)){
                return i;
            }
        }
        return -1;
    }
    //MÉTODO PARA ADICIONAR INFORMAÇÕES ENO VETOR DE UMA POSIÇÃO ESPECÍFICA

    public boolean adicionainicio(int posicao, String elemento)throws Exception{

        this.aumentaCapacidade();
        if(posicao >=0 && posicao < tamanho){
            for (int i=this.tamanho-1; i >= posicao; i--){
                this.elementos[i+1] = this.elementos[i];
            }
            this.elementos[posicao] = elemento;
            this.tamanho++;
        }else{
            throw new Exception("posição Inválida");
        }
        return true;
    }

    // MÉTODO PARA AUMENTAR CAPACIDADE

    private void aumentarcapacidade(){
        if(this.tamanho == this.elementos.length){
            String[] elementosnovos = new String[this.elementos.length * 2];
            for(int i = 0; i < this.elementos.length; i++){
                elementosnovos[i] = this.elementos[i];
            }
            this.elementos = elementosnovos;
        }
    }

    //METODO PARA REMOVER DADOS DO VETOR

    public void remove(int posicao)throws Exception{
        if(posicao >= 0 && posicao < tamanho){
            for(int i = posicao; i < this.tamanho-1; i++){
                this.elementos[i] = this.elementos[i+1];
            }
            this.tamanho--;
        }else{
            throw new Exception("posição inválida");
        }
    }

}
