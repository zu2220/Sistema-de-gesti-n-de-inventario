package modelo;

/**
 *  @author Grupo 1
 */
public class Venta {
    
    //Atributos
    private int idventa;
    private int idCliente;
    private double valorPagar;
    private String fechaVenta;
    private int estado;
    
    //constructor
    public Venta(){
        this.idventa = 0;
        this.idCliente = 0;
        this.valorPagar = 0.0;
        this.fechaVenta = "";
        this.estado = 0;
    }
    
     //constructor sobrecargado

    public Venta(int idventa, int idCliente, double valorPagar, String fechaVenta, int estado) {
        this.idventa = idventa;
        this.idCliente = idCliente;
        this.valorPagar = valorPagar;
        this.fechaVenta = fechaVenta;
        this.estado = estado;
    }

     //get and set
    
    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getEstado() {
        return estado;
    }

   
    public void setEstado(int estado) {
        this.estado = estado;
    }

    //toString
    @Override
    public String toString() {
        return "Venta{" + "idventa=" + idventa + ", idCliente=" + idCliente + ", valorPagar=" + valorPagar + ", fechaVenta=" + fechaVenta + ", estado=" + estado + '}';
    }
    
    
    
}
