/*
for (inicialización; condición; actualización) {
    bloque_de_sentencias;
}
 */
package EstructurasControl.EstructurasControlBucles;

public class For {

    public static  void  main(String[] args) {
        for (int numero = 2018; numero <=2048; numero++ ){
            System.out.println("Estamos en " + numero + ", mi hijo tiene " + (numero - 2018) + "y yo tengo " + (numero - 1982));
        }
    }

}
