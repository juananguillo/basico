package basicosJuanAnt;

public class basicos {

	public static void main(String[] args) {


		cadenas();

		logicos();


		numericos();


	}

	
	public static void logicos() {
		
		boolean cierto=true;
		
		if (cierto==true) {
			System.out.println("Es cierto");
			
		} else {
			System.out.println("Es falso");
			
		}
		
	}
	 
	  public static void numericos() {

	        //Estos son los tipos básicos
	        byte elMasPeque;
	        short chiquitin;
	        int entero;
	        long duplicaEntero;
	        float grande;
	        double doble;

	        //Ejemplos de asignación de valores a las variables de tipos básicos
	        entero = 10;
	        doble = 5.6;
	   
	        //Mostrar en pantalla el contendido de las variables de tipos básicos.
	        System.out.print("Valor entero ");
	        System.out.println(entero);
	        System.out.print("Valor doble ");
	        System.out.println(doble);
	    }


	public static void cadenas() {
		
		 
        String ejemplo = "Hola mundo"; 
        System.out.println(ejemplo);
        // Carácter en la posición
        System.out.println("Carácter en la posición 1: " + ejemplo.charAt(0) + " Carácter en la posición 10: " + ejemplo.charAt(9));
        // Longitud de una cadena 
        System.out.println("Longitud de la cadena:" + ejemplo.length());
    }
		
	}

