import java.io.*;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //creazione variabili
        int diff, sommaDiff;
        int count = 0;
        String nomeFile = "input.txt";

        try {
            Scanner in = new Scanner(new File(nomeFile));
            //conteggio linee dentro al file "input.xt"
            while(in.hasNextLine()) {
                in.hasNextLine();
                count++;
            }

            //creazione di due array
            int [] array1 = new int[count];
            int [] array2 = new int[count];
        }
        catch (FileNotFoundException e) {
            System.out.println("Errore nella lettura del file");
        }


    }
}