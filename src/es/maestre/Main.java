package es.maestre;

public class Main {

    public static void main(String[] args) {
        CCuenta miCuenta;
        double saldoActual;

        miCuenta = new CCuenta("Rafael Nadal Parera","1000-2365-85-1230456789",2500,0);
        
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
