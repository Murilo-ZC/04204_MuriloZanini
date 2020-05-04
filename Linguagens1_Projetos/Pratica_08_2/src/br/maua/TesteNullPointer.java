package br.maua;

public class TesteNullPointer {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;
        try {
            frase = null;
            novaFrase = frase.toUpperCase();
        }
        catch (NullPointerException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Frase Original:" + frase);
        System.out.println("Frase Modificada:" + novaFrase);
    }
}
