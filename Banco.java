// Programa en Java que simula operaciones bancarias, esto es a partir de la clase personas. Simulación de un operador cajero en el cual se realizan las operaciones de apertura de cuenta, cierre de cuenta, retiro de dinero, acreditación de dinero; bajo cuatro escenarios posibles. 
// Karol Alpizar Villalobos 


package banco;

// la clase la llamo igual al documento
 
public class Banco {

    
    // el metodo main empieza la ejecucion de la aplicacion 
    public static void main(String[] args) {
        
// VARIABLES cb1, cb2, cb3, cb4, de tipo de dato CuentaBancaria.. crea un nuevo objeto CuentaBancaria
        
        // el tipo de dato CuentaBancaria esta creado en el constructor CuentaBancaria
                                               // guarda los datos id para el numero de la cuenta, monto y banco
        CuentaBancaria cb1 = new CuentaBancaria(112820447, 455, "Bonito");
        CuentaBancaria cb2 = new CuentaBancaria(1356789934, 200, "Promerica");
        CuentaBancaria cb3 = new CuentaBancaria(988769442, 2600, "Scotia");
        CuentaBancaria cb4 = new CuentaBancaria(1895639989, 1300, "Den");

// VARIABLES c1,c2,c3 de tipo Cliente. El dato tipo cliente es creado en el contructor Cliente.
        
        Cliente c1 = new Cliente("Carlos", "Jiménez", "Delgado", 113930120, 61010180, "Guadalupe");
        Cliente c2 = new Cliente("Karol", "Alpizar", "Villalobos", 123456789, 9876543, "Moravia");
        Cliente c3 = new Cliente("Jose", "Ramírez", "Quirós", 45654365, 12344323, "Santa Ana",cb3);
        Cliente c4 = new Cliente("María", "Ramírez", "Alvarado", 237462, 34213243, "Desamparados",cb4);

// VARIABLES cajero1 y cajero2, crea un nuevo objeto cajero con un id 
        
        Cajero cajero1 = new Cajero(777);
        Cajero cajero2 = new Cajero(176);


// INICIAN las operaciones en el cajero, con varios escenarios :
        
  
        //operaciones para Cliente 1  => Abrir cuenta
        // se llama a los metodos atenderCliente y abrirCuenta  
        
        cajero1.atenderCliente(c1);
        cajero1.abrirCuenta();
        cajero1.abrirCuenta();
        
        
        //operaciones para Cliente 2 => Cerrar y abrir cuenta. el cliente tiene una cuenta inicialmente.
        
         // se asigna la cuenta cb1 al cliente C2.      
        c2.cuenta = cb1;
        // se llaman a los metodos atenderCliente, cerrarCuenta, abrirCuenta
        cajero2.atenderCliente(c2);
        cajero2.cerrarCuenta();
        cajero2.abrirCuenta();
        
        //Operaciones para Cliente 3 => Retiro
        // se llama a los metodos atenderCliente,retirarDinero 
        cajero2.atenderCliente(c3);
        cajero2.retirarDinero(3000);
        cajero2.retirarDinero(500);
        
        
        //Operaciones para Cliente 4 => Retiro
        // se llama a los metodos atenderCliente,acretirarDinero  
        cajero1.atenderCliente(c4);
        cajero1.acreditarCuenta(6000);

    }

}
