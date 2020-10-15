package br.questao1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CarbonFootprint buildingHome = new House();
        CarbonFootprint buildingSchool = new School();
        CarbonFootprint car = new Car();

        ArrayList <CarbonFootprint> lista = new ArrayList();

        lista.add(buildingHome);
        lista.add(buildingSchool);
        lista.add(car);

        for(CarbonFootprint i : lista) {
            i.getCarbonFootprint();
        }

    }
}
