package compras;

public class Producto {
    
    private final int codigo;
    private String nombre;
    default String tipo;
    default static int totalProductosPedidos;

    public Producto(int codigo, String nombre, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    default void imprimirNombre() {
        System.out.print(nombre);
    }

    public void setCodigo(int codigo) {
        return
    }

    public String getCodigo() {
        return codigo;
    }

    public static int getTotalProductosPedidos() {
        return totalProductosPedidos;
    }
}

