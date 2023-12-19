// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        String[] materia = {"Mate","fisica","lenguaje"};
        int[] numero = new int[3];

        System.out.println("Ejercicios 1");
       //ARRAYS
        String[] marcas = {"Nissan","Mercedes","Chevrolet","Kia","Corsa","Ferrari","Toyota","Honda","Hyudai","Renault"};
        int[] pares={2,4,6,8,10,12,14,16,18,20};

        //System.out.println(marcas[0]);
        for (int i =0; i < 3; i++){
            System.out.println(marcas[i]);
        }
        marcas[0]="Toyota";
        System.out.println("valor nuevo");
        for (int i =0; i < 3; i++){
            System.out.println(marcas[i]);
        }
        System.out.println(marcas.length);

        //ARRAYS DE DOS DIMENSIONES
        int [][] numeros={{1,2,3,4},{5,6,7,8}};
        //imprime 2
        System.out.println(numeros.length);

        //imprime 4 por la longitud de la fila 1
        System.out.println(numeros[0].length);

        //acceder a los elementos internos
        System.out.println(numeros[0][0]);

        //imprime la direccion de memoria
        System.out.println(numeros[0]);

        //for anidado para imprimir todos los elementos del array
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                System.out.println(numeros[i][j]);
            }
        }

        //tomando en cuenta arrays crear un programa que permita ingresar por
        // teclado las calificaciones de tres materias en este tipo de estructura
        //y tambien las imprima
        /*System.out.println("ejercicio 1");
        Scanner entrada= new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("Ingresa la calificacion "+ i+  ": ");
            numero[i-1] = entrada.nextInt();
        }
        for (int i = 0; i < numero.length; i++) {
            System.out.println(materia[i] + " : " + numero[i]);
        }

       */



        //CONVERSIONES O CAST
        //de pequeño a grande
        int mi_entero = 9;
        double mi_double = mi_entero;
        double otro_double = 9.0;
        System.out.println(mi_entero);
        System.out.println(mi_double);
        System.out.println(otro_double);

        //de grande a pequeño
        System.out.println("de grande a pequeño");
        double mi_double2=9.46d;
        int mi_entero2=(int)mi_double2;
        System.out.println(mi_entero2);
        System.out.println(mi_double2);

        System.out.println("de string a int ");
        String mystring= "1234";
        //me permite "valueOf" transformar de string a int
        int numeroconvertido = Integer.valueOf(mystring);
        float numerodos= Float.valueOf(mystring);
        System.out.println(numeroconvertido+1);
        System.out.println(numerodos);

        System.out.println("Manejo de excepciones");
        try {
            // esto es lo que va a intentar
            int num = Integer.parseInt("cuarenta");
        } catch (Exception e) {
            // esto es lo que se va a hacer si se ejecuta error
            System.out.println("El usuario debe ingresar valores numericos");
        }
        finally{
            //este codigo se ejecuta si sale bien o sale mal la operacion
            System.out.println("Muchas gracias por usar el programa");
        }

        //utilizando el pretcatch implementar en el indice
        //de mas corpora
        Scanner entrada= new Scanner(System.in);
        float altura=0, masa=0, resultado=0;

        while(true) {
            try {
                System.out.println("Ingrese su altura: ");
                altura = entrada.nextFloat();
            } catch (Exception e) {
                altura=-2;
                System.out.println("El usuario debe ingresar valores numericos");
                entrada.nextLine();
            } finally {
                System.out.println("Muchas gracias por usar el programa");
            }
            if (altura>0){
                break;
            }
        }

        while(true) {
            try {
                // esto es lo que va a intentar
                System.out.println("Ingrese su masa corporal: ");
                masa = entrada.nextFloat();
            } catch (Exception e) {
                masa = 0;
                System.out.println("ingrese un numero positivo");
                //esto es como en cin es decir debe ignorarle
                entrada.nextLine();
            } finally {

                System.out.println("Muchas gracias por usar el programa");
            }
            if (masa>0){
                break;
            }
        }
        resultado= masa/(altura*altura);
        System.out.println("Su IMC es : "+ resultado);


        System.out.println("arreglo dinamino modificar su tamaño");
        //List<String> lista = new ArrayList<>()=ArrayList.asList(marca);
        "Nissan","Mercedes","Chevrolet","Kia","Corsa","Ferrari","Toyota","Honda","Hyudai","Renault"
        ArrayList<String> vehiculos = new ArrayList<String>();
        vehiculos.add("Nissan");
        vehiculos.add("Mercedes");
        vehiculos.add("Chevrolet");
        vehiculos.add("Honda");
        vehiculos.add("Honda");

    }
}