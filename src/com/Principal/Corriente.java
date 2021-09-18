package com.Principal;
/**
 * @author Juan Diego Pulido Rendón
 * @version 01
 * @since 05/09/2021
 */
public class Corriente extends Cuenta {
    public int sobregiro;

    public Corriente(int numero, Persona titular, long saldo, int sobregiro) {
        super(numero, titular, saldo);
        this.sobregiro = sobregiro;
    }

    public int getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(int sobregiro) {
        this.sobregiro = sobregiro;
    }

    @Override
    public String toString() {
        return "La Cuenta Corriente" +
                ", Numero=" + numero +
                ", Titular=" + titular +
                ", Sobregiro=" + sobregiro +
                ", Saldo=" + saldo
                ;
    }

    @Override
    public void deposito(double dato) {
        saldo += dato;
        System.out.println("Tiene un abono de " + dato + " a la deuda");
    }

    @Override
    public void retiro(double dato) {
        if (dato > sobregiro) {
            System.out.println("No puede realizar el sobregiro");
        } else {
            saldo -= dato;
            System.out.println("El nuevo saldo es " + getSaldo());
        }
    }
}
