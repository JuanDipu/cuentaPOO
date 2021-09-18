package com.Principal;
/**
 * @author Juan Diego Pulido Rendón
 * @version 01
 * @since 05/09/2021
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        //Cuentas Corrientes
        Persona personaC1 = new Persona(123698, "Juan");
        Corriente corriente1 = new Corriente(01, personaC1, 15000, 4000);
        Persona personaC2 = new Persona(3056, "Camilo");
        Corriente corriente2 = new Corriente(02, personaC2, 3000, 4000);
        //Cuentas de ahorro
        Persona personaH1 = new Persona(123, "Diego");
        Ahorro ahorro1 = new Ahorro(03, personaH1, 15000, 3);
        Persona personaH2 = new Persona(98, "Manuel");
        Ahorro ahorro2 = new Ahorro(04, personaH2, 3000, 3);

        corriente1.deposito(5000);
        corriente1.retiro(4000);
        ahorro1.deposito(4500);
        ahorro1.retiro(1000);

        System.out.println(corriente1);
        System.out.println(ahorro1);
        System.out.println(corriente2);
        System.out.println(ahorro2);


    }
}
