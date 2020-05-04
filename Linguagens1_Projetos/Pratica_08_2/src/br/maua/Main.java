package br.maua;

public class Main {

    public static void main(String[] args) {
        System.out.println("inicio do main");
        metodo1();
        System.out.println("fim do main");
    }

    private static void metodo1() {
        System.out.println("inicio do metodo1");
//        try {
            metodo2();
//        }
//        catch (Exception exception){
//            System.out.println("Algo inexperado aconteceu!");
//            System.out.println(exception.getMessage());
//        }
        System.out.println("fim do metodo1");
    }

    private static void metodo2() throws RuntimeException{
        System.out.println("inicio do metodo2");
        int[] array = new int[10];
        try {
            for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println(i);
            }
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Tentou acessar posição inválida:");
            exception.printStackTrace();
            System.out.println(exception.getMessage());
            throw new RuntimeException("Deu Ruim Aqui!");
        }
        System.out.println("fim do metodo2");
    }
}
