
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mendoza
 */
public class GradesAverage {

     int [] grados;
    private Scanner in;
    int i=0;
   
    public static void main(String[] args) {
      
        GradesAverage aGradesAverage = new GradesAverage();
        aGradesAverage.in = new Scanner(System.in);

        System.out.print("Ingrese el numero de estudiantes: ");
        int  numStudents = aGradesAverage.in.nextInt();
                
        if (numStudents <= 0) {
            System.out.println("Numero invalido de estudiantes.");
            return;
        }
        int[] grados= new int[numStudents];
        int i=0;
        double Suma=0; 
    
         
         while (i< numStudents)
         {
             
             GradesAverage grado = new GradesAverage();   
              grado.in = new Scanner (System.in);
             System.out.println("Ingrese el grado de el estudiante: "+(i+1));
                 
              int grad= grado.in.nextInt();  
              
               if (grad>= 0 && grad <= 100 )
            {
                grados[i] = grad;
                Suma= Suma+ grad;
                i++;
            }else{
               
             System.out.println("Numero de grado invalido por favor intenta nuevamente");
               }
         }
             System.out.println("El promedio es:"+(Suma/numStudents));
              
         }
}


    
    
    
     

        
        
        
        
    
