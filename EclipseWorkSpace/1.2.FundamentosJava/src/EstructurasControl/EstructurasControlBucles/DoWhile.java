/*
do {
    bloque_de_sentencias;
    actualización;
} while (condición);
*/

package EstructurasControl.EstructurasControlBucles;

public class DoWhile {
    public  static void main(String args[]){
        int numero = 0;
        int ano = 1982;

        do {
            System.out.println("Estamos en " + (ano + numero) + ",tengo " + numero + " años.");
            numero ++;

        } while (numero <= 38);
    }
}
