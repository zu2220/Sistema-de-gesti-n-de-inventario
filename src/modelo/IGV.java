/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author oscar
 */
public class IGV {
    private double porcentajeIGV;
    
    public IGV(){
        this.porcentajeIGV = 0.18;
    }
    
    public double calcularIGV(List<Producto> productos){
        
        double precio_total_productos = 0;
        for(Producto producto : productos) {
            precio_total_productos += producto.getPrecio()*(double)producto.getCantidad();
        }
        return precio_total_productos * this.porcentajeIGV;
    }
}
