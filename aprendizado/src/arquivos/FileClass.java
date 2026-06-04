package aprendizado.src.arquivos;

import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        String pathName = "C:\\Users\\DTF-SEFAZ\\development\\repos\\estudos-java\\aprendizado\\src\\arquivos\\text.txt";
        File file = new File(pathName);
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo. " + e.getMessage());
        } finally {
            if (sc != null) sc.close();
        }
    }
}
