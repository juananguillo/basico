package basicosJuanAnt;

public class basicos {

	public static void main(String[] args) {
		cadenas();

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

