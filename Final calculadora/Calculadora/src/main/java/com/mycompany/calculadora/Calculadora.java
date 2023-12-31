package com.mycompany.calculadora;

import java.util.Scanner;

public class Calculadora {
    // variables
    static double num1;
    static double num2;
    static double resultado;
    //////////////////////

    public static double getNum1() {
        return num1;
    }

    public static void setNum1(double num1) {
        Calculadora.num1 = num1;
    }

    public static double getNum2() {
        return num2;
    }

    public static void setNum2(double num2) {
        Calculadora.num2 = num2;
    }

    public static double getResultado() {
        return resultado;
    }

    public static void setResultado(double resultado) {
        Calculadora.resultado = resultado;
    }

    ///////////// Constructor
    public Calculadora(double num1, double num2, double resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;
    }

    ///////////////// main
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opc;

        do {
            int opc1;

            System.out.println("1. Funciones basicas \n 2.Funciones Trigonometricas "
                    + "\n 3.Raiz enesima \n 4. potencia enesima \n 5. IVA");
            System.out.println("Ingrese una opcion ");
            opc = in.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("\t CALCULADORA " + "\n 1.Suma  \n 2.Resta  "
                            + "\n 3.multiplicacion \n 4.division ");
                    opc1 = in.nextInt();

                    System.out.println("Ingrese dos numeros ");
                    num1 = in.nextDouble();
                    num2 = in.nextDouble();

                    switch (opc1) {
                        case 1:
                            resultado = num1 + num2;
                            System.out.println(" suma es :" + resultado);
                            break;
                        case 2:
                            resultado = num1 - num2;
                            System.out.println(" resta es :" + resultado);
                            break;
                        case 3:
                            resultado = num1 * num2;
                            System.out.println(" multiplicacion es :" + resultado);
                            break;
                        case 4:
                            if (num2 == 0) {
                                System.out.println("Error Division por Cero");
                                main(args);
                            }
                            resultado = num1 / num2;
                            System.out.println(" division es :" + resultado);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\t Funciones Trigonometricas" + "\n 1.seno \n 2.coseno \n 3.Tangente"
                            + " Ingrese una opcion ");
                    opc1 = in.nextInt();
                    System.out.println("Ingrese un numero ");
                    num1 = in.nextDouble();
                    num1 = Math.toRadians(num1); // Convertimos a radian
                    switch (opc1) {
                        case 1:
                            resultado = Math.sin(num1);
                            System.out.println("El seno del numero es " + resultado);
                            break;
                        case 2:
                            resultado = Math.cos(num1);
                            System.out.println("El coseno del numero es " + resultado);
                            break;
                        case 3:
                            if (num1 == 90 || num1 == 270) {
                                System.out.println("Error Tangenge Inconsistente");
                                main(args);
                            }
                            resultado = Math.tan(num1);
                            System.out.println("El tangente del numero es " + resultado);
                            break;
                    }
                    break;

                case 3:
                    System.out.println("\t Raiz Enesima \n ingrese un numero");
                    num1 = in.nextDouble();
                    break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (opc < 5);
    }
}