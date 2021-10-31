package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
//////// STRING ///////
    System.out.println("String:");
    String nombre = null;
    if (nombre == null) {
        System.out.println("El String Nombre tiene un valor null");
    }
    System.out.println("Asignamos el nombre a la variable");
    nombre = "Juan";
    int cantidad;
    char inicial;

    cantidad=nombre.length();
    nombre= nombre.toUpperCase();
    if (nombre.equals("JUAN"))
    {
        System.out.println(nombre);
        System.out.println("Cómo estás chupa birra?");
        System.out.println("Cantidad de caracteres:");
        System.out.println(cantidad);
    }
    inicial = nombre.charAt(0);
        System.out.println(inicial);

    Integer valor = 0;
    /*En este caso definimos y creamos un Integer, dando valor inicial 0-*/

    /*Integer num = new Integer(1);
    //En este caso asignamos a la derecha la creación de un valor inicial 1.

        System.out.println(num);*/

//////// INTEGER ///////
    System.out.println("Integer:");
    Integer valor1=10;
    Integer valor2=30;
    int comparar;

    if (valor1.equals(valor2))
        System.out.println("Son iguales");
    else
    {
        comparar=valor1.compareTo(valor2); //aqui el resultado es 1 si v1 es mayor o -1 si es menor
        if (comparar>0)
            System.out.println("Valor1 es mayor que Valor2");
    }
        System.out.println("valor1 es mayor que valor2");

     /* public int sumar(int a, int b) {
            int suma = a + b;
            return suma;
        };

        public int restar(int a, int b) {
            int resta = a - b;
            return resta;
        };

        public int dividir(int a, int b) {
            int division = a / b;
            return division;
        };

        public int multiplicar(int a, int b) {
            int multiplicacion = a * b;
            return multiplicacion;
        };*/

        //////// FLOAT ///////
        Float coeficiente = 2.5f;//la f al final quiere decir Float, si no lo ponemos se asume que es Double

        Float num = new Float(0.5);

        //////// DATE ///////

        Date fecha = new Date();
        System.out.println(fecha.toString()); //Muestra la fecha actual

        //fecha manual:
        Date fecha2 = new Date(89,0,24);
        System.out.println(fecha2);



        ///EJERCITACION PLAYGROUND STRING E INTEGER

        //Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un
        //mensaje.
        String texto1= "SOLO SE";
        String texto2= "QUE NO SE NADA";

        if (texto1.equals(texto2)) {
            System.out.println("los textos son similares");
        }else{
            System.out.println("Textos distintos:" + "'" + texto1 + "' y '" + texto2  + "'");
        }



        //Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales.
        //Informar el resultado obtenido.

        Integer numero1 = 45;
        Integer numero2 = 25;

        if(numero1.equals(numero2)){
            System.out.println("Los números son iguales");
        }else{
            if(numero1.compareTo(numero2)>0){
                System.out.println("el número 1 es mayor al número 2");
            }else{
                System.out.println("el número 2 es mayor al número 1");
            }
        }

    }








}


