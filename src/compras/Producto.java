package compras;

public class Producto {
    
    private final int codigo; //(9)private
    private String nombre;//(13) private
    default String tipo; //(14) default
    default static int totalProductosPedidos; //default

    public Producto(int codigo, String nombre, String tipo) { //(12) public?
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    default void imprimirNombre() { //(11) default, se usa en oc
        System.out.print(nombre);
    }

    public void setCodigo(int codigo) {
        return; //si?
    }

    public int getCodigo() { //(10) int
        return codigo;
    }

    public static int getTotalProductosPedidos() { //(2) public, se usa en lin20 de ObjTaller3
        return totalProductosPedidos;
    }
}
