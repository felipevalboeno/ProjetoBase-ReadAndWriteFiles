package java_nio_simple;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Felipe Rocha
 * @apiNote Exemplo melhorado de como escrever no arquivo, usando ArrayList e stringBuilder.
 * Obs: ele cria o arquivo também caso não exista.
 */
public class JavaNIO3 {

    public static void main(String[] args) {
        try{

            // Pegando o caminho do arquivo
            Path path = Paths.get("C:\\arquivos\\java-nio.txt");


            //criando uma lista de nomes
            List<String> nomes = new ArrayList<>();
            //adicionando nomes na lista
            nomes.add("Joao");
            nomes.add("Maria");

            //instanciando stringbilder pra manipular as strings da lista
            StringBuilder conteudo = new StringBuilder();
            //percorrendo a lista de nomes e adicionando cada conteudo encontrado na lista separando por quebra de linha
            nomes.forEach(n -> conteudo.append(n + "\n") );

            //escrevendo o conteúdo do stringbuilder no arquivo path
            //o String builder precisa ser convertido pra uma String final por isso o toString
            Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
            System.out.println(conteudo);


        }catch (Exception ex){
            ex.printStackTrace();

        }
    }
}
