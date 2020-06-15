package br.maua;

import br.maua.interfaces.Interface1;
import br.maua.interfaces.Combo_1_2;
import br.maua.models.MinhaClasse;
import br.maua.models.UsaInterface;

public class Main {

    public static void main(String[] args) {
        MinhaClasse meuObjeto = new MinhaClasse();
        UsaInterface usaInterface = new UsaInterface();
        Depende(meuObjeto);
        chamaInterface1(meuObjeto);
        chamaInterface1(usaInterface);
    }

    public static void Depende(Combo_1_2 objeto){
        System.out.println("Método da Interface 1:" + objeto.metodo1());
        System.out.println("Método da Interface 2:" + objeto.metodo2());
    }

    public static void chamaInterface1(Interface1 interface1){
        System.out.println("Alguem que assinou a interface 1:" + interface1.metodo1());
    }
}
