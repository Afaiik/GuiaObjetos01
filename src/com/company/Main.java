package com.company;

import com.company.Consigna1.Rectangulo;
import com.company.Consigna2.Empleado;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World ! :)");

        /* Modele el objeto Rectángulo con sus propiedades, ancho y alto. Ambas con valor  1,0 por defecto.
        Este objeto debe exponer los getters y setters necesarios.
        También  debe contar con un método para calcular el área y perímetro del mismo.
        Ejecute las  siguientes pruebas: 
        a. Inicializar un objeto Rectángulo estableciendo ancho y alto. 
        b. Imprimir por pantalla el alto y ancho. 
        c. Imprimir por pantalla el área y perímetro. 
        d. Modificar el alto y el ancho de la instancia. 
        e. Imprimir por pantalla nuevamente el cálculo del área y perímetro. 
        f. Inicializar un objeto Rectángulo con los valores por defecto y verificar. 
        */

        Rectangulo rectangulo = new Rectangulo(20,20);
        Consigna1(rectangulo);

        /*Modele el objeto Empleado que posee las siguientes características,
        dni, nombre,  apellido y salario.
        El mismo debe contar con la posibilidad de calcular el salario  anual.
        A su vez se requiere otro método que permita aumentar el salario 
        dependiendo del porcentaje que se le pase por parámetro.
        Considere crear un  método que facilite imprimir por pantalla las características del objeto
        de la  siguiente forma:  Empleado[dni=?, nombre=?, apellido=?, salario=?] 
        a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de  25000. 
        b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de  27500. 
        c. Imprima ambos objetos por pantalla 
        d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el  salario anual del mismo. 
        */
        Consigna2();

    }

    private static void Consigna1(Rectangulo rectangulo){
        System.out.println("-------- Consigna 1 --------\n");

        System.out.println("El area es " + rectangulo.GetArea());
        //b. Imprimir por pantalla el alto y ancho. 
        System.out.println("El ancho es " + rectangulo.GetAncho());
        System.out.println("El alto es " + rectangulo.GetAlto());
        //c. Imprimir por pantalla el área y perímetro. 
        System.out.println("El perimetro es " + rectangulo.GetPerimetro());
        System.out.println("El area es " + rectangulo.GetArea());
        //d. Modificar el alto y el ancho de la instancia. 
        rectangulo.SetAncho(40);
        rectangulo.SetAlto(40);
        //e. Imprimir por pantalla nuevamente el cálculo del área y perímetro. 
        System.out.println("El nuevo perimetro es " + rectangulo.GetPerimetro());
        System.out.println("El nuevo area es " + rectangulo.GetArea());
        System.out.println();
    }

    private static void Consigna2(){
        System.out.println("-------- Consigna 2 --------\n");

        //a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de  25000. 
        Empleado Carlitos = new Empleado(23456345,"Carlos", "Gutiérrez", (float)25000);
        //b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de  27500. 
        Empleado Ana = new Empleado(34234123,"Ana", "Sánchez", (float)27500);
        //c. Imprima ambos objetos por pantalla 
        System.out.println(Carlitos.toString());
        System.out.println(Ana.toString());
        //d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el  salario anual del mismo. 
        Carlitos.IncrementarSueldoByPorcentaje(15);
        System.out.println("Se ha incrementado el sueldo de "+Carlitos.getNombre()+", su nuevo salario es " + Carlitos.getSalario());
        System.out.println();
    }

}
