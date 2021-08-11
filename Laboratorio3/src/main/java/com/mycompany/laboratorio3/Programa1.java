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
public class Programa1 {
    public static void main(String[] args)
    {
        int nu1,nu2,nu3,suma,total;
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("Ingrese la primer nota: ");
        nu1=Teclado.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        nu2=Teclado.nextInt();
        System.out.println("Ingrese la tercera nota: ");
        nu3=Teclado.nextInt();
        suma = nu1 + nu2 +nu3;
        total = suma/3;
        System.out.println("El promedio es de: " + total);   
       
    }
}
