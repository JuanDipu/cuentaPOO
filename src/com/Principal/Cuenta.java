package com.Principal;
/**
 * @author Juan Diego Pulido Rendón
 * @version 01
 * @since 05/09/2021
 */
public abstract class Cuenta {
    protected int numero;
    protected Persona titular;
    protected long saldo;

    public Cuenta(int numero, Persona titular, long saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public abstract void deposito(double dato);
    public abstract void retiro(double dato);
}
