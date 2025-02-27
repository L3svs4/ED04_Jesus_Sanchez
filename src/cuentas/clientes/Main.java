package cuentas.clientes;

/**
 * Clase principal.
 * 
 * @author Jesus Sanchez
 * @version 1.0.1
 * @since 27/02/25
 */
public class Main {

    /**
     * Método principal.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados).
     * @throws No captura excepciones, lo hará operativa_cuenta.
     * @return No devuelve ningún valor.
     */
    public static void main(String[] args) {
        operativa_cuenta(0);
    }

    /**
     * Realiza operaciones sobre una cuenta bancaria: Creación, retirada e ingreso de dinero.
     * 
     * @param cantidad Cantidad inicial para la cuenta (No se utiliza, ha sido añadida solo para el ejercicio).
     * @throws Captura excepciones genericas relacionadas con las operaciones de ingreso o retirada.
     * @return No retorna ningun valor.
     */
    private static void operativa_cuenta(float cantidad) {
        Cuenta miCuenta;
        double saldoActual;

        miCuenta = new Cuenta("Rafael Nadal Parera","1000-2365-85-1230456789",2500,0);
        
        System.out.println("El saldo actual es:"+ miCuenta.estado() );

        try {
            miCuenta.retirar(2300);
            System.out.println("El saldo actual es:"+ miCuenta.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
            System.out.println("El saldo actual es:"+ miCuenta.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
