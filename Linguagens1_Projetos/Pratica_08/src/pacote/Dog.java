package pacote;

public class Dog {
    private int weight;
    public Dog(int weight){
        this.weight = weight;
    }
    public void bark(){
        for(int i = 0; i < weight; i += 5){
            System.out.println("Playstation!!");
        }
    }
}
