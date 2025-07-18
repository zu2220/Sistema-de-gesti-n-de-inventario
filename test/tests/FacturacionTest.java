package tests;

import java.util.Scanner;
import org.junit.Test;
import org.junit.Assert;
import modelo.Producto;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import modelo.IGV;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author oscar
 */
public class FacturacionTest {
    private static final double DELTA = 1e-15;
    @Test
    public void testCalcularIGV() throws Exception{
        
        IGV igv = new IGV();

        List<Producto> productos = new ArrayList<>(Arrays.asList(
            new Producto("mazamorra morada", 4, 2.5),
            new Producto("arroz con leche", 2, 1.5)
        ));
                
        //calculo del igv
        double total_igv = igv.calcularIGV(productos);
        
        Assert.assertEquals(2.34, total_igv, DELTA);
    
    }
    
    @Test
    public void testCalcularVuelto() throws Exception{
        //1. Ingresamos total a pagar e ingresamos el pago
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar total a pagar");
        double precio_total = 22.5;
        System.out.println("Ingresar pago");
        double pagamos = 30.0;
        
        //2. Validamos que el pago sea mayor que el total a pagar
        while(pagamos<precio_total){
            System.out.println("El pago debe ser mayor al total por pagar");
            System.out.println("Ingrese el pago de nuevo");
            pagamos = sc.nextDouble();
        }
        
        //3. Hacemos el cálculo del vuelto
        double vuelto = pagamos - precio_total;
        
        Assert.assertEquals(7.5, vuelto, DELTA);
    }
    
    @Test
    public void testCalcularTotalAPagar() throws Exception{
        List<Producto> productos = new ArrayList<>(Arrays.asList(
                new Producto("mazamorra morada", 4, 2.5),
                new Producto("arroz con leche", 2, 1.5)
        ));
        
        double total = 0;
        
        for(Producto producto : productos){
            total += (double)producto.getCantidad() * producto.getPrecio();
        }
        
        Assert.assertEquals(13.0, total, DELTA);
    }
}
