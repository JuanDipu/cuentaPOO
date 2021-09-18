package com.Principal;
/**
 * @author Juan Diego Pulido Rendón
 * @version 01
 * @since 05/09/2021
 */
public class Ahorro extends Cuenta {
    public int interes;

    public Ahorro(int numero, Persona titular, long saldo, int interes) {
        super(numero, titular, saldo);
        this.interes = interes;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "La Cuenta de Ahorro" +
                ", Numero=" + numero +
                ", titular=" + titular +
                ", interes=" + interes +
                ", saldo=" + saldo ;
    }

    @Override
    public void deposito(double dato) {
        double inter= getInteres()/100d;
        saldo += dato;
        saldo += (saldo * inter);
        System.out.println("El nuevo saldo es " + getSaldo());

    }

    @Override
    public void retiro(double dato) {
        if(dato<getSaldo()){
            saldo-=dato;
            System.out.println("El nuevo saldo es " + getSaldo());
        }else {
            System.out.println("No tiene fondos suficientes");
        }

    }
}
