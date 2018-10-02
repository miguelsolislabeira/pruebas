public class EjercicioClase {
public static void main (String[] args) {

//Pedir dos números y decir cuál es el mayor o si son iguales

System.out.println("Introduzca dos números separados por espacio: ");

String teclado = System.console().readLine();
int num1 = Integer.parseInt(teclado);
int num2 = Integer.parseInt(teclado);

 if ((num1>num2))  {
 System.out.println ("El " + num1 + " es mayor que " + num2);
 
 }
 
 if ((num1<num2)) {
   System.out.println("El " + num1 + " es mayor que " + num2);
   
 }
 
 }
}
  
  
 }


}
}
