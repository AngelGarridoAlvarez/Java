/*
do {
    bloque_de_sentencias;
    actualizaci�n;
} while (condici�n);
*/

package EstructurasControl.EstructurasControlBucles;

public class DoWhile {
    public  static void main(String args[]){
        int numero = 0;
        int ano = 1982;

        do {
            System.out.println("Estamos en " + (ano + numero) + ",tengo " + numero + " a�os.");
            numero ++;

        } while (numero <= 38);
    }
}
