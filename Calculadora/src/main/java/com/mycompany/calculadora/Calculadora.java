

package com.mycompany.calculadora;

import java.util.Scanner;

public class Calculadora {
// variables
         static double num1;
         static double num2;
        static double resultado;

///////// Constructor 
    public Calculadora(double num1, double num2, double resultado) {
        this.num1= num1;
        this.num2=num2;
        this.resultado=resultado;
    }
   
    ////////////////// main 
    
    public static void main(String[] args) {
         Scanner in = new Scanner( System.in);
         int opc;
         
         
         
         do{
             int opc1;
             System.out.println("\t1. Funciones basicas \n 2.Funciones Trigonometricas "
                     + "\n 3.Raiz enesima \n 4. potencia enesima \n 5. IVA");
             System.out.println("Ingrese una opcion ");
             opc= in.nextInt();
             switch (opc){
                 case 1:
                     System.out.println("\t CALCULADORA " + "\n 1.Suma  \n 2.Resta  "
                             + "\n 3.multiplicacion \n 4.division ");
                     opc1=in.nextInt();
                     
                     System.out.println("Ingrese dos numeros ");
                     num1 = in.nextDouble();
                     num2= in.nextDouble();
                     
                     switch(opc1){
                         case 1:
                             resultado = num1 + num2;
                             System.out.println(" suma es :"+ resultado);
                             break;
                          case 2:
                              resultado = num1 - num2;
                             System.out.println(" resta es :"+ resultado);
                           break;
                          case 3:
                              resultado = num1 * num2;
                             System.out.println(" multiplicacion es :"+ resultado);
                              break;
                          case 4:
                              resultado = num1 / num2;
                             System.out.println(" division es :"+ resultado);
                              break;
                     }
                     
                     break;
                 case 2:
                    System.out.println("\t Funciones Trigonometicas"+"\n 1.seno \n 2.coseno \n 3.Tangente"
                    +" Ingrese una opcion "); 
                    opc1=in.nextInt();
                     System.out.println("Ingrese un numero ");
                     num1 = in.nextDouble();
                    switch(opc1){
                        case 1:
                            resultado= Math.sin(num1);
                            System.out.println("El seno del numero es "+ resultado);
                        break;
                        case 2:
                            resultado= Math.cos(num1);
                            System.out.println("El coseno del numero es "+ resultado);
                        break;
                        case 3:
                            resultado= Math.tan(num1);
                            System.out.println("El tangente del numero es "+ resultado);
                            break;
                    }
                    
                     break;
                 case 3:
                     System.out.println("\t Raiz Enesima \n Ingrese el numero base ");
                     num1 = in.nextDouble();
                  System.out.println("Ingrese el índice de la raíz enésima: ");
                      num2 = in.nextDouble();
                  resultado= Math.pow(num1, 1.0 / num2);
                  System.out.println("La Raiz " + num2 + "-enesima de "+ num1 + "es: "+ resultado ); 
                               
                     break;
                 case 4:
                     System.out.println("\t potencia enesima \n ingrese un numero base");
                     num1 = in.nextDouble();
                   System.out.println(" ingrese un numero exponente");
                               num2=in.nextDouble();
                  resultado = math.pow(num1,num2);
                   System.out.println(num1 +" Elevado  A la "+ num2 +" Es igual  A " + resultado);            
                  
                     break;
                 case 5:
                     System.out.println("\t IVA  \n ingrese un numero ");
                     num1 = in.nextDouble();
                    System.out.println("\t Ingresa el porcentaje : ");
                  num2 = in.nextDouble();
                           resultado = num1 + num1*num2;
                            System.out.println(" El  valor final es de :  "+ resultado);
                     break;
             }
            
         }while(opc <5);
         
        
    }
}
