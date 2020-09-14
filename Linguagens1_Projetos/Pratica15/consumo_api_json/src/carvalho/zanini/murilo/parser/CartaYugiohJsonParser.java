package carvalho.zanini.murilo.parser;

import carvalho.zanini.murilo.model.CartaYugioh;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class CartaYugiohJsonParser {
    public static CartaYugioh parseJson(String json){
        JSONObject meuJson = new JSONObject(json);
        if(meuJson.getString("status").equals("success"))
        return new CartaYugioh(
                meuJson.getJSONObject("data").getString("name"),
                meuJson.getJSONObject("data").getString("text"),
                meuJson.getJSONObject("data").getString("card_type"),
                meuJson.getJSONObject("data").getString("type"),
                meuJson.getJSONObject("data").getString("family"),
                meuJson.getJSONObject("data").getInt("atk"),
                meuJson.getJSONObject("data").getInt("def"),
                meuJson.getJSONObject("data").getInt("level"),
                meuJson.getJSONObject("data").get("property") == null? "" : meuJson.getJSONObject("data").get("property").toString()
        );
        else return new CartaYugioh();
    }
}
