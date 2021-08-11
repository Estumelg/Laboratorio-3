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
public class Programa2 {
    public static void main(String[] args)
    {
       double hs,s,total;
       Scanner Teclado = new Scanner(System.in);
       
       System.out.println("Ingrese las horas que trabajo en la semana: ");
       hs = Teclado.nextInt();
       System.out.println("Ingrese su sueldo por hora: ");
       s = Teclado.nextInt();
       total = hs*s;
       System.out.println("Su sueldo semanal es de: " + total);
       
      
    }
}
