package carvalho.zanini.murilo.parser;

import carvalho.zanini.murilo.model.CartaPokemon;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class CartaPokemonParser {

    public static List<CartaPokemon> parseJson(String json){
        JSONObject retorno = new JSONObject(json);
        JSONArray cartasJson = retorno.getJSONArray("cards");
        List<CartaPokemon> cartas = new ArrayList<>();
        for (Object carta :
                cartasJson) {
            cartas.add(new CartaPokemon(
                    ((JSONObject)carta).getString("name"),
                    ((JSONObject)carta).getString("imageUrl")
            ));
        }
        return cartas;
    }

}
