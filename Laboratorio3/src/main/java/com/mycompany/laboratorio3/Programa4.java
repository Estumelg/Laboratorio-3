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
public class Programa4 {
    public static void main(String[] args)
    {
        double cantidad, monto;
        double comision, salario;
        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidada de carros vendidos: ");
        cantidad = Teclado.nextInt();
        System.out.println("Ingrese el monto total por los carros vendidos: ");
        monto = Teclado.nextInt();
        comision = monto * 0.05;
        salario = 1000 + (150 * cantidad) + comision;
        System.out.println("El salario a cobrar total es de: " + salario);
        System.out.print("Quetzales");
    }
}
