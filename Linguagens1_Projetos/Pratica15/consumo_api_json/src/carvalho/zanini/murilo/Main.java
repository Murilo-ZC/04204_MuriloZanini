package carvalho.zanini.murilo;

import carvalho.zanini.murilo.model.CartaYugioh;
import carvalho.zanini.murilo.parser.CartaYugiohJsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diga o nome da carta:");
        String nome = scanner.nextLine();
        String json_retorno = leituraJavaTradicional(String.format("http://yugiohprices.com/api/card_data/%s", nome));
        CartaYugioh cartaYugioh = CartaYugiohJsonParser.parseJson(json_retorno);
        System.out.println("Carta:" + cartaYugioh);
    }

    public static String leituraJavaTradicional(String request_url) throws Exception{
        URL url = new URL(request_url);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        int statusCode = con.getResponseCode();
//        System.out.println("Status Code:" + statusCode);

        BufferedReader in = new BufferedReader( new InputStreamReader(con.getInputStream()));
        String result;
        StringBuffer content = new StringBuffer();
        while((result = in.readLine()) != null){
            content.append(result);
        }
        in.close();
//        System.out.println("Recebidos:" + content);
        return content.toString();
    }

    public static String leituraJava11(String request_url) throws Exception{
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(10))
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create(request_url)).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

//        System.out.println("Status Code:" + response.statusCode());
//        System.out.println("Body:" + response.body());
        return response.body();
    }

}
