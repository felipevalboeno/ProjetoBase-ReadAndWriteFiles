package java_nio_simple;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 * @author: felipe rocha
 * @apiNote: Exemplo básilo de leitura de arquivo lendo e convertendo bytecode
 *
 */
public class JavaNIO1 {

    public static void main(String[] args) {
        try{

            Path path = Paths.get("C:\\arquivos\\java-nio.txt");

            //Lendo o path e convertendo todos os caracteres de uma só vez
            byte[] bytesArquivo = Files.readAllBytes(path);

            // como são bytes, podemos criar uma string agora
            String conteudo = new String(bytesArquivo);
            System.out.println(conteudo);

        }catch (Exception ex){
            ex.printStackTrace();

        }

    }
}
