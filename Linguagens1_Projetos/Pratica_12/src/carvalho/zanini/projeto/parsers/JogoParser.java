package carvalho.zanini.projeto.parsers;

import carvalho.zanini.enumeracoes.Status;
import carvalho.zanini.projeto.model.Jogo;
import org.json.JSONObject;

public class JogoParser {
    public static JSONObject toJson(Jogo jogo){
        JSONObject json = new JSONObject();
        json.put("plataforma", jogo.getPlataforma());
        json.put("nome", jogo.getNome());
        json.put("status", jogo.getStatus());
        return json;
    }

    public static Jogo fromJson(JSONObject json){
        Jogo jogo = new Jogo(
                json.getString("plataforma"),
                json.getString("nome")
        );
        jogo.setStatus(
                StatusParser.toStatus(json.getString("status"))
        );
        return jogo;
    }
}
