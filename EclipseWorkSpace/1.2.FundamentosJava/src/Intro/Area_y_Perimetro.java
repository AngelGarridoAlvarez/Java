package Intro;

public class Area_y_Perimetro {
    public static void main (String[] args){

        // Declaramos las variables para trabajar con ellas.
        double lado =5.0, area, perimetro; //double: tipo de dato decimal doble
        area = lado*lado;
        perimetro = lado+lado+lado+lado; // o bien 4*lado;

        System.out.println("El area es: " + area);

        System.out.println("El perímetro es: " + perimetro);
    }
}

//La palabra void indica que el método main no retorna ningún valor.
// La forma (String args[]) es la definición de los argumentos que recibe el método main.