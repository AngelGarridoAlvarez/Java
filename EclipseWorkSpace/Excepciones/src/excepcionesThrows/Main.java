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
	            respuesta="Se han introducido caracteres no num�ricos";
	        }catch(ArithmeticException ex){
	            respuesta="Divisi�n entre cero";
	        }catch(ExcepcionIntervalo ex){
	            respuesta=ex.getMessage();
	        }
	        System.out.println(respuesta);

	        try  {
	//espera la pulsaci�n de una tecla y luego RETORNO
	            System.in.read();
	        }catch (Exception e) {  }
	    }
	     
	    }
}