package aprendizado.src;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Lista {
    // Lista é uma estrutura de dados homogênea, ordenada e que inicia vazia.
    // Tipo (interface) usado: List.
    // Classes que implementam: ArrayList, LinkedList, etc.

    // Vantagens: tamanho variável; facilidade para se realizar inserções e deleções.
    // Desvantagens: acesso sequencial aos elementos.

    public static void main(String[] args) {
        // sintaxe
        List<String> list = new ArrayList<String>();

        // adicionar
        list.add("Maria");
        list.add("Carlos");
        list.add(1, "Luana"); // adiciona Luana na segunda posição da lista (e Carlos vai para a próxima)

        for (String name : list) {
            System.out.println(name);
        }

        // usando stream e collectors (mais avançados no java)
        var namesWithA = list.stream().filter(name -> name.charAt(name.length() - 1) == 'a').collect(Collectors.toList());

        System.out.println(namesWithA);

        var firstNameWithA = list.stream().filter(name -> name.charAt(name.length() - 1) == 'a').findFirst().orElse(null);
        System.out.println(firstNameWithA);

        // tamanho da lista
        System.out.println(list.size());

        // posição na lista
        var position = list.indexOf("Carlos");
        System.out.println(position);

        // remover
        list.remove("Carlos"); // remover pelo nome
        System.out.println(list);

        list.remove(0); // remover pela posição
        System.out.println(list);

        list.removeIf(element -> element.charAt(0) == 'L'); // remove usando condicional

        System.out.println(list);
    }
}