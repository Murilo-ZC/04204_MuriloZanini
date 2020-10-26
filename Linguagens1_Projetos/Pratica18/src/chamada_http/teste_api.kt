package chamada_http

import org.json.JSONObject
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

fun main() {
    val client = HttpClient.newBuilder().build();
    val request = HttpRequest.newBuilder()
        .uri(URI.create("http://roll.diceapi.com/json/d6/d20"))
        .build();
    val response = client.send(request, HttpResponse.BodyHandlers.ofString());
    val json = JSONObject(response.body())
    println(response.body())
    println(json.getJSONArray("dice"))
}