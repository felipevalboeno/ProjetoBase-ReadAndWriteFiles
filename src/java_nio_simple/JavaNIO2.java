package java_nio_simple;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


/**
 * @author Felipe Rocha
 * @apiNote Exemplo básico mas agora usando uma lista para percorrer mais de uma linha no arquivo.
 */
public class JavaNIO2 {
    public static void main(String[] args) {
        try{

            Path path = Paths.get("C:\\arquivos\\java-nio.txt");

            //caso não tenha mais de uma linha
            //String conteudo = Files.readString(path);
           List<String> linhas = Files.readAllLines(path);

           linhas.forEach(l -> System.out.println(l));



        }catch (Exception ex){
            ex.printStackTrace();

        }
    }
}
