package br.com.alura.screenmatch.service;

import javax.imageio.IIOException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {

    public String obterDados(String endereco) {
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = null;
        try {
            response = cliente
                    .send(request, HttpResponse.BodyHandlers.ofString());
                    } catch (IOException e) {
            throw new RuntimeException();
        } catch (InterruptedException e) {
            throw  new RuntimeException();
        }

        String json = response.body();
        return json;
    }


}
