

//constructor Cajero

package banco;

import java.util.Date;

// se crea un clase Cajero que contiene las variables id de tipo int y usuario de tipo cliente

public class Cajero {
    
    
// variables del cajero. un id y un usuario
    
    int id;   
    Cliente usuario;

    
// metodo que inicializa  usuario null para indicar que inicialmente no hay un cliente en el cajero
    public Cajero(int id) {
        this.id = id;
        this.usuario = null; 
    }

    
    // se crea un metodo atenderCliene
    
    public void atenderCliente(Cliente usuario) {
        this.usuario = usuario;
        System.out.println("  ");
        System.out.println("-----Empezó a trabajar el Cajero " + this.id + "-----");
        this.registrar("Se atiende el Cliente: " + this.usuario.nombre + " " + this.usuario.apellido1 + " " + this.usuario.apellido2 + ". ID: " + this.usuario.cedula);
    }
    
    // metodo que registra el cliente para agregar fecha de registro.
    // se usa el metodo date de la libreria java para incluir una fecha
    
    private void registrar(String str) {
        Date date = new Date();
        System.out.println(date.toString() + " " + str);
    }
    
    // se crea un metodo abrirCuenta
    public void abrirCuenta() {
        if (this.usuario == null) {// si no hay usuario
            return; // return; termina la ejecucion de un metodo void
        }

        if (this.usuario.cuenta == null) {
            //El monto por defecto para una cuenta nueva es de $500
            //El banco por defecto siempre es 'Central'
           
            // creo una variable numero de cuenta que se genera de manera aleatoria
            
            int numeroCuenta = (int) (Math.random() * 10000); 
            CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, 500, "Central");
            this.usuario.cuenta = cuenta;
            this.registrar("Se abrió la Cuenta: " + numeroCuenta + " para el Usuario: " + this.usuario.cedula);
            
        } else {//si ya tiene cuenta
            this.registrar("El usuario ya tenía una cuenta y por lo tanto no se le abrió una.");
        }
    }

    // se crea un metodo para cerrar cuenta
    
    public void cerrarCuenta() {
        
        // se revisa si hay un cliente
        
        if (this.usuario == null) {// si no hay usuario inicialmente termina la ejecucion
            return; // return; termina la ejecucion de un metodo void
        }

        if (this.usuario.cuenta == null) {
            this.registrar("No se le puede cerrar la cuenta al Usuario: " + this.usuario.cedula + " porque no tiene cuenta.");
        } else {
            this.usuario.cuenta = null;
            this.registrar("Se borró la cuenta para el Usuario: " + this.usuario.cedula);
        }
    }
    
    // se crea un metodo para retirar dinero de la cuenta

    public void retirarDinero(int monto) {
        if (this.usuario == null) {// si no hay usuario
            return; // return; termina la ejecucion de un metodo void
        }

        if (this.usuario.cuenta.monto < monto) {
            this.registrar("Fondos insuficientes, Cantidad solicitada: "+monto+ " Cantidad disponible: "+this.usuario.cuenta.monto);
        } else {
           this.usuario.cuenta.monto -= monto;
           this.registrar("Se retiró: "+ monto);
           this.registrar("Dinero disponible: "+this.usuario.cuenta.monto);
        }

    }
    
    // se crea un metodo para acreditar dinero a la cuenta ya existente 
    
    public void acreditarCuenta(int monto){
        if (this.usuario == null) {// si no hay usuario
            return; // return; termina la ejecucion de un metodo void
        }
        
        this.usuario.cuenta.monto += monto;
        this.registrar("Se agregó: "+monto+" a la cuenta");
        this.registrar("Dinero disponible: "+this.usuario.cuenta.monto);
    }

}
