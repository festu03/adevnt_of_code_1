import java.io.*;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //creazione variabili
        int diff, sommaDiff;
        int count = 0;
        int [] array1 = new int[1000];
        int [] array2 = new int[1000];
        String nomeFile = "input.txt", linea;

        try {
            Scanner in = new Scanner(new File(nomeFile));
            //conteggio righe dentro al file "input.xt e assegnazione numeri ad array"
            while(in.hasNextLine()) {
                linea = in.nextLine();
                //creazione dell'array dove inserire i numeri in String
                String [] arrayNumeri = linea.split("\\s+"); //separa i numeri che hanno spazio
                array1 [count] = Integer.parseInt(arrayNumeri[0]); //assegna il primo numero
                array2 [count] = Integer.parseInt(arrayNumeri[1]); //assegna il secondo numero
                count++;
            }
            in.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Errore nella lettura del file");
        }

        System.out.println("Numeri prima colonna: ");
        for (int i = 0; i < count; i++){
            System.out.println(array1[i]);
        }

        System.out.println("Numeri seconda colonna: ");
        for (int i = 0; i < count; i++){
            System.out.println(array2[i]);
        }
    }
}