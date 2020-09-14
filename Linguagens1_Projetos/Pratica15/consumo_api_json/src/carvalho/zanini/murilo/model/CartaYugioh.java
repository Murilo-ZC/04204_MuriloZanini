package carvalho.zanini.murilo.model;

//Adaptado de https://yugiohprices.docs.apiary.io/#reference/getting-card-data/retrieve-all-information-for-a-card-using-its-name/retrieve-all-information-for-a-card-using-its-name?console=1

public class CartaYugioh {
    private String name;
    private String text;
    private String card_type;
    private String type;
    private String family;
    private int atk;
    private int def;
    private int level;
    private String property;

    public CartaYugioh(String name, String text, String card_type, String type, String family, int atk, int def, int level, String property) {
        this.name = name;
        this.text = text;
        this.card_type = card_type;
        this.type = type;
        this.family = family;
        this.atk = atk;
        this.def = def;
        this.level = level;
        this.property = property;
    }

    public CartaYugioh() {

    }

    @Override
    public String toString() {
        return "CartaYugioh{" +
                "name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", card_type='" + card_type + '\'' +
                ", type='" + type + '\'' +
                ", family='" + family + '\'' +
                ", atk=" + atk +
                ", def=" + def +
                ", level=" + level +
                ", property='" + property + '\'' +
                '}';
    }
}
