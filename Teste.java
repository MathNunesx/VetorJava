import java.net.SocketOption;

public class Teste {
    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(5);

        try{
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Quantidade de informações no vetor: " + vetor.tamanho());

        System.out.println("Conteúdo do vetor: " + vetor.toString());

        System.out.println("Informação armazenada no vetor na posição informada: " + vetor.busca(1));

        System.out.println("posição do vetor onde está armazenada a informaçãp: " + vetor.busca1("elemento 1"));

        if(vetor.adicionainicio(0, "elemento 0") == true){
            System.out.println("Elemento inserido com sucesso!");
        } else {
            System.out.println("Falha na inserção de dados!");
        }

        System.out.println("Quantidade de informações no vetor: " + vetor.tamanho());

        System.out.println("conteúdo do vetor: " + vetor.toString());

    }
}
