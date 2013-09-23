/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alumno 
 */
public class ComFpmislataDaw2Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        //4a)
        List<Coche> coches = new ArrayList<>();
        //4b)
        coches.add(new Coche(Marca.RENAULT, "Ocasion", 400, "12345678J"));
        coches.add(new Coche(Marca.FORD, "Fiesta", 300, "98765432L"));
        coches.add(new Coche(Marca.FORD, "Fiesta", 300, "87654321D"));
        coches.add(new Coche(Marca.SEAT, "Leon", 350, "66666666A"));
        coches.add(new Coche(Marca.CITROEN, "Picaso", 360, "18273645B"));


        //4c)
        int count = 0;
        for (Coche coche : coches) {
            count++;
            if (count == 2) {
                System.out.println("Marca: " + coche.getMarca() + ", modelo: " + coche.getModelo() + ", cilindrada: " + coche.getCilindrada() + ", DNI del Propietario: " + coche.getDniPropietario() + ".\n");
            }
        }

        //4d)
        for (Coche coche : coches) {
            System.out.println("Marca: " + coche.getMarca() + ", modelo: " + coche.getModelo());
        }

        //4e)
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIntroduzca el DNI del propietario");
        String dniPropietario = sc.next();
        for (Coche coche : coches) {
            if (coche.getDniPropietario().equals(dniPropietario)) {
                System.out.println("Modelo: " + coche.getModelo() + ".\n");
            }
        }

        //4f)
        for (Coche coche : coches) {
            if (coche.getMarca() == Marca.FORD) {
                System.out.println("Marca: " + coche.getMarca() + ", modelo: " + coche.getModelo() + ", cilindrada: " + coche.getCilindrada() + ", DNI del Propietario: " + coche.getDniPropietario());
            }
        }


        //5a)
        Map<String, Coche> mapCoches = new HashMap<String, Coche>();

        //5b)
        mapCoches.put("12345678J", new Coche(Marca.RENAULT, "Ocasion", 400, "12345678J"));
        mapCoches.put("12345678Z", new Coche(Marca.FORD, "Fiesta", 360, "12345678Z"));
        mapCoches.put("12345678J", new Coche(Marca.CITROEN, "Picaso", 300, "66633610O"));
        mapCoches.put("12345678J", new Coche(Marca.FORD, "Fiesta", 350, "42424242H"));
        mapCoches.put("12345678J", new Coche(Marca.SEAT, "Leon", 400, "22426881O"));

        //5c)
        System.out.println("Marca: " + mapCoches.get("12345678Z").getMarca() + ", modelo: " + mapCoches.get("12345678Z").getModelo() + ", cilindrada: " + mapCoches.get("12345678Z").getCilindrada() + ", DNI: " + mapCoches.get("12345678Z").getDniPropietario());

        //5d)
        for (String dni : mapCoches.keySet()) {
            System.out.println("Marca: " + mapCoches.get(dni).getMarca() + ", modelo: " + mapCoches.get(dni).getModelo());
        }

        //5e)
        System.out.println("Intoduce el DNI del Propietario");
        String dniPropietarioMap = sc.next();
        System.out.println("Modelo: " + mapCoches.get(dniPropietarioMap).getModelo());
        //5f)
        for (String dni : mapCoches.keySet()) {
            
            System.out.println("Marca: " + mapCoches.get(dni).getMarca() + ", modelo: " + mapCoches.get(dni).getModelo());
        }
    }
}
