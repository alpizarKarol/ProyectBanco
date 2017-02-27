
package banco;


public class Cliente {
    
    String nombre;
    String apellido1;
    String apellido2;
    int cedula;
    int telefono;
    String direccion;
    CuentaBancaria cuenta;

    //Cliente sin cuenta
    public Cliente(String nombre, String apellido1, String apellido2, int cedula, int telefono, String direccion) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cuenta =  null; // Se inicializa en null en caso de que se desee explicitamente que el cliente no tenga cuenta bancaria
    }

    //Segundo constructor en caso de que se desee crear un cliente que ya tenga una cuenta
    public Cliente(String nombre, String apellido1, String apellido2, int cedula, int telefono, String direccion, CuentaBancaria cuenta) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cuenta = cuenta;
    }

    

    
    
}
