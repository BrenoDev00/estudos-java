package aprendizado.src;

public class MetodosString{
    public static void main(String[] args){
        var text = " abc DeF e ghI ";

        // formatar: toLowerCase(), toUpperCase(), trim()
        // recortar: substring(inicio), substring(inicio, fim) - retorna o valor de uma string com base em um intervalo
        // substituir: replace(char,char), replace(string, string)
        // buscar: indexOf, lastIndexOf - retorna o index da posição de uma string
        // str.split("") - retorna um array com base no separador declarado no parâmetro

        exemplos(text);
    }

    public static void exemplos(String text){
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.trim());
        System.out.println(text.trim().toUpperCase());
        System.out.println(text.substring(5));
        System.out.println(text.substring(5,8));
        System.out.println(text.replace("hI", " new string"));
        System.out.println(text.indexOf("a"));
        System.out.println(text.lastIndexOf("e"));

        String fruits = "apple orange lemon";
        String[] fruitsArray = fruits.split(" ");

        System.out.println(fruitsArray[1]);
        System.out.println(fruitsArray[2]);
    }
}