package aprendizado.src;

public class ForEach {
    // laço que percorre todos os elementos de um array

    //sintaxe: for (Tipo apelido : array){
    // <comandos>
    //}

    public static void main(String[] args) {
        String[] vector = new String[]{"Maria", "João", "Ana"};

        for (String element : vector) {
            System.out.println(element);
        }
    }
}
