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
public class Programa5 {
    public static void main(String[] args)
    {
        int prt,prcl1,prcl2,exafin;
        double pond1,pond2,pond3,pond4,total;
        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la nota de participacion sobre 100: ");
        prt=Teclado.nextInt();
        System.out.println("Ingrese la nota del primer parcial sobre 100: ");
        prcl1=Teclado.nextInt();
        System.out.println("Ingrese la nota del segundo parcial sobre 100: ");
        prcl2=Teclado.nextInt();
        System.out.println("Ingrese la nota del examen final sobre 100: ");
        exafin=Teclado.nextInt();
        pond1=prt*0.1;
        pond2=prcl1*0.25;
        pond3=prcl2*0.25;
        pond4=exafin*0.4;
        total=pond1+pond2+pond3+pond4;
        System.out.println("La nota final es de:" + total);
        
       
    }
}
