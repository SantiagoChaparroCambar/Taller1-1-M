
package cuentabancaria;

import java.util.Scanner;


public class CuentaBancaria {
    // variables
int numCta;
String nombreCliente;
float saldo;
String fechaApertura;

// setts y getts
    public int getNumCta() {
        return numCta;
    }

    public void setNumCta(int numCta) {
        this.numCta = numCta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
    
//constructor 
    public CuentaBancaria(int numCta, String nombreCliente, String fechaApertura) {
        this.numCta = numCta;
        this.nombreCliente = nombreCliente;
        this.fechaApertura = fechaApertura;
    }
    
    /////////////////  main  /////////////////////////////
    
    public static void main(String[] args) {
        int opc =0;
        Scanner in = new Scanner(System.in);
        for(;;){
            System.out.println("""
                                \t Banca Mia 
                               
                                1. Crear cuenta 
                               
                                2. Consultar Cuenta 
                               
                                3. Consignar 
                               
                                4.retirar 
                               
                                5. Salir """);
            
            do {
                System.out.println("\n ");
                System.out.println("Digita Tu Opcion :  ");
                opc = in.nextInt();
              
            }while(opc < 0 || opc > 5);
            switch(opc){
                case 1 -> {
                }
                case 2 -> {
                    System.out.println("\n ");
                    System.out.println("Saldo Insuficiente : ");
                    
                }
                
                case 3 -> {
                }
            
                case 4 -> {
                }
                case 5 -> {
                }
            }
            
            if (opc == 5)
                break;
          
                    }
      System.out.println("Finalizado ");
    }
}
