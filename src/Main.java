import java.io.*;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //creazione variabili
        int diff, sommaDiff;
        int count = 0;
        int [] array1 = new int[0];
        int [] array2 = new int[0];
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
        }
        catch (FileNotFoundException e) {
            System.out.println("Errore nella lettura del file");
        }


    }
}