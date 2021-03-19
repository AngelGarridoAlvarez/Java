package excepcionesThrows;

import ExcepcionIntervalo;

public class Main {
	 public static void main(String[] args) {
	        String str1="99";
		    String str2="0";
	        String respuesta;
		    int numerador, denominador, cociente;
	        try{
	            numerador=Integer.parseInt(str1);
	            denominador=Integer.parseInt(str2);
	            rango(numerador, denominador);
	            cociente=numerador/denominador;
	            respuesta=String.valueOf(cociente);
	        }catch(NumberFormatException ex){
	            respuesta="Se han introducido caracteres no numéricos";
	        }catch(ArithmeticException ex){
	            respuesta="División entre cero";
	        }catch(ExcepcionIntervalo ex){
	            respuesta=ex.getMessage();
	        }
	        System.out.println(respuesta);

	        try  {
	//espera la pulsación de una tecla y luego RETORNO
	            System.in.read();
	        }catch (Exception e) {  }
	    }
	     
	    }
}