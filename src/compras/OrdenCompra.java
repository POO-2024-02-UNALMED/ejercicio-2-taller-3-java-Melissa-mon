package compras;

import Empleado; // (1) Empleado, se usa un objeto empleado en lin13 en el constructor
import java.util.ArrayList;

public class OrdenCompra { //(3) OrdenCombra, la unica clase publica debe tener el nombre del archivo, ademas constructor en 13 tiene el nombre de la clase

    public int codigo; //publico
    private String tipo; //private
    private Empleado comprador; //private
    public ArrayList<Producto> productos; //public

    public OrdenCompra(int codigo, String tipo, Empleado comprador,
            ArrayList<Producto> productos) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.comprador = comprador;
        this.productos = productos;
        Producto.totalProductosPedidos += productos.size();
    }

    public void agregarProducto(Producto producto) { //public
        if (producto.tipo.equals(tipo)) {
            productos.add(producto);
            Producto.totalProductosPedidos++;
        }
    }

    public void retirarProducto(Empleado empleado, Producto producto) {
        if (!empleado.tengoPermiso()) {
            return; //return
        }
        retirarProducto(producto);
    }

    private void retirarProducto(Producto producto) {
        for (int i = 0; i < productos.size(); i++) {
            if (producto.getCodigo() == productos.get(i).getCodigo()) {
                productos.remove(i);
                producto.totalProductosPedidos--;
                producto.imprimirNombre();
                System.out.println(" retirado");
                break;
            }
        }
    }

    public void descontar() { //void
        Producto.totalProductosPedidos -= productos.size();
    }

}
