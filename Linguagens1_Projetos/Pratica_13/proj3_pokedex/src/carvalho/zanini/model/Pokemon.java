package carvalho.zanini.model;

public class Pokemon {
    private String name;
    private double height;
    private double weight;
    private String sprite;
    private String type;
    private int id;
    private String description;

    public Pokemon(String name, double height, double weight, String sprite, String type, int id, String description) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.sprite = sprite;
        this.type = type;
        this.id = id;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getSprite() {
        return sprite;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", sprite='" + sprite + '\'' +
                ", type='" + type + '\'' +
                ", id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
