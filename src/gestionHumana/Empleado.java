package gestionHumana; //(4) gestionHumana, es la carpeta

public class Empleado {

    public final long cedula; //(5) public
    private String nombre; //(6) private
    private String cargo; //(7) private
    
    public Empleado(long cedula, String nombre, String cargo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public boolean tengoPermiso() { //(8) public
        return cargo.contains("Administrador");
    }
}
