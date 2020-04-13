package com.company;

public class Main {

    public static void main(String[] args) {
        Ninja ninja = new Ninja("Naruto", "Uzumaki");
        mostrarTreino(ninja);
        Ninja academicStudent = new AcademicStudent("Sasuke", "Uchiha");
        mostrarTreino(academicStudent);
        Chuunin chuunin = new Chuunin("Iruka","Umino", "Treinar XYZ");
        mostrarTreino(chuunin);
        chuunin.goToMission();
        Jounin jounin = new Jounin("Kakashi", "Hatake", "Train Sasuke!");
        mostrarTreino(jounin);

    }

    static void mostrarTreino(Ninja ninja){
        ninja.train();
    }
}
