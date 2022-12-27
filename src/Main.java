import javax.swing.*;

public class Main{
    public static void main(String args[]){

        String dato; //Creo una variable tipo String para almacenar el dato que vaya a introducir por el cuadro de diálogo.
        dato = JOptionPane.showInputDialog(null, "Por favor, introduce un número entero: "); //Invoco el cuadro de diálogo para introducir datos.

        //Hago un try/catch para manejar errores. En el cuadro de diálogo se tiene que introducir un número entero. En el momento que introduzco un número decimal o texto normal, coge el error y le muestra lo que quiero. Además vuelve al principio del programa.
        try{
            int intenta = Integer.parseInt(dato);
        }catch(Exception e){ //En caso de que lo introducido no sea un número entero, le muestro el tipo de error.
            JOptionPane.showMessageDialog(null, "Lo que has introducido, no es un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("El numero que has introducido es: " + dato); //Imprimo en pantalla el dato que he introducido por el cuadro de diálogo.
    }
}