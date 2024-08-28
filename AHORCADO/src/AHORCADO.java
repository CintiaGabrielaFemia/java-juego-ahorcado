import java.util.Scanner;

public class AHORCADO {
    public static void main(String[] args) throws Exception {


     // Clase escanner que nos permite que el usuario escriba   
     Scanner scanner = new Scanner (System.in);

     //Declaracion y asignaciones
     String palabraSecreta = "inteligencia";
     int intentosMaximos = 10;
     int intentos = 0;
     boolean palabraAdivinada = false;


     //Arreglos:
     char[] letrasAdivinadas = new char[palabraSecreta.length()];

//Estruccura de control: interacctiva (bucle)
     for (int i = 0; i < letrasAdivinadas.length; i++) {
        letrasAdivinadas[i] ='_';
}


// Estrucctura de control: interactva (bucle)


while (!palabraAdivinada && intentos < intentosMaximos){
                                               // Esto se utiliza cuando tenemos una palabra de chars
    System.out.println("Palabra adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + "letras)");

    System.out.println("Introduce una letra, por favor");

    //Utilizamos la clase scanner para pedir una letra
    char letra = Character.toLowerCase (scanner.next().charAt(0));

    boolean letraCorrecta = false;

// Estrucctura de control: Interactiva (bucle)
    for (int i = 0; i < palabraSecreta.length(); i++) {

    // Estrucctura de control condicional
        if (palabraSecreta.charAt(i) == letra) {
            letrasAdivinadas[i] = letra;
            letraCorrecta = true;
            
        }
        
    }
     if (!letraCorrecta) {
        intentos++;
        System.out.println("Incorrecto! Te quedan " + (intentosMaximos - intentos) + " intentos" );
     }
      
        
        if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
            palabraAdivinada = true;
            System.out.println("Felicidades has adivinado la palabra secreta: " + palabraSecreta);
            
        }
        
     
     }

     if (!palabraAdivinada) {
        System.out.println("Que pena te has quedado sin intentos! GAME OVER");
        
     }
     scanner.close();
    }
    }

