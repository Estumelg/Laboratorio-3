/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laboratorio3;

import java.util.*;
/**
 *
 * @author Estuardo Melgar
 */
public class Programa3 {
    public static void main (String[] args)
    {
        double ROD,AND,EST,total;
        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("Ingrese los dolares que tiene Rodrigo: ");
        ROD=Teclado.nextInt();
        AND = ROD/2;
        EST = (AND+AND)/2;
        total = ROD+AND+EST;
        System.out.println("Rodrigo tiene: " + ROD + "dolares");
        System.out.println("Andrea tiene: " + AND + "dolares");
        System.out.println("Esteban tiene: " + EST + "dolares");
        System.out.println("En total juntos poseen: " +total + "dolares");
        
    }
}
