package com.company;

import com.company.Consigna1.Rectangulo;

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




    }

    private static void Consigna1(Rectangulo rectangulo){
        //a. Inicializar un objeto Rectángulo estableciendo ancho y alto. 

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
    }


}
