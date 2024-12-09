import java.io.*;
import java.util.Arrays;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //creazione variabili
        int diff = 0, sommaDiff = 0, prod = 0, sommaProd = 0;
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

        //ordinamento crescente dei due arrray
        Arrays.sort(array1, 0, count);
        Arrays.sort(array2, 0, count);

        System.out.println("Numeri prima colonna: ");
        for (int i = 0; i < count; i++){
            System.out.println(array1[i]);
        }

        System.out.println("\n\nNumeri seconda colonna: ");
        for (int i = 0; i < count; i++){
            System.out.println(array2[i]);
        }

        for (int i =0; i < count; i++) {
            diff = Math.abs(array1[i] - array2[i]);//calcolo della distanza in valore assoluto
            sommaDiff = sommaDiff + diff;
        }

        System.out.println("\nLa somma delle distanze e': " + sommaDiff);

        for(int i = 0; i < count; i++) {
            int count2 = 0;
            for (int k = 0; k < count; k++) {
                if (array1[i] == array2[k]) {
                   count2++;
                }
            }
            prod = array1[i] * count2;
            sommaProd = sommaProd + prod;
        }

        System.out.println("La somma dei prodotti della ripetizione dello stesso numero e': " + sommaProd);
    }
}