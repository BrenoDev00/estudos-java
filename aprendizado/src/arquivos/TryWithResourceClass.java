package aprendizado.src.arquivos;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResourceClass {
    public static void main(String[] args) {
        String pathName = "C:\\Users\\DTF-SEFAZ\\development\\repos\\estudos-java\\aprendizado\\src\\arquivos\\text.txt";

        try (BufferedReader bf = new BufferedReader(new FileReader(pathName))) {
            String line = bf.readLine();

            while (line != null) {
                System.out.println(line);
                line = bf.readLine();

            }
        } catch (Exception e) {
            System.out.println("erro ao ler arquivo: " + e.getMessage());
        }
    }
}
