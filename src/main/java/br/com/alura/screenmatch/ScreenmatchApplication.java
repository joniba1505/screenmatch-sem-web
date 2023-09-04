package br.com.alura.screenmatch;

import br.com.alura.screenmatch.service.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.Scanner;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        var consumoApi = new ConsumoApi();
        var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
    //    Scanner entrada = new Scanner(System.in);
//        System.out.println("Digite um cep:");
//        String cep = entrada.nextLine();
//        var json = consumoApi.obterDados("https://viacep.com.br/ws/" + cep + "/json/");
        System.out.println(json);
   // entrada.close();
    }

    public static void main(String[] args) {

        SpringApplication.run(ScreenmatchApplication.class, args);
    }


}