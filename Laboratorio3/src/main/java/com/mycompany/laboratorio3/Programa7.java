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
public class Programa7 {
    public static void main(String[] args)
    {
       int hrstot,sem,dias,hrs;
       Scanner Teclado= new Scanner(System.in);
       System.out.println("Ingrese el total de horas");
       hrstot=Teclado.nextInt();
       sem=hrstot/(24*7);
       dias=hrstot % (24*7)/24;
       hrs=hrstot % 24;
       System.out.println("las horas totales son: " + sem + " semanas " + dias + " dias y " + hrs + " horas");
       
    }
}
