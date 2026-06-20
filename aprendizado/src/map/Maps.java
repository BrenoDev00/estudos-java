package aprendizado.src.map;

import java.util.Map;
import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        // Map é uma coleção de pares chave/valor
        // não admite repetições do objeto chave
        // os elementos são indexados pelo objeto chave (não possuem posição)
        // acesso, inserção e remoção de elementos são rápidos

        Map<String, String> cookies = new HashMap<>();
        // inserir
        cookies.put("username", "Breno");
        cookies.put("email", "breno@mail.com");
        cookies.put("phone", "00 999-999");

        // remover
        cookies.remove("phone");

        // obter valor específico
        System.out.println("name: " + cookies.get("username"));

        // obter todos os valores existentes
        System.out.println("values: " + cookies.values());

        // obter todas as chaves existentes
        System.out.println("keys: " + cookies.keySet());

        // percorrendo a coleção
        System.out.println("\nMap:");
        for (String prop : cookies.keySet()) {
            System.out.println(prop + ": " + cookies.get(prop));
        }
    }
}
