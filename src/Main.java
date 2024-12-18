import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Creazione variabili
        int diff = 0, sommaDiff = 0, prod = 0, sommaProd = 0;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        String nomeFile = "input.txt", linea;


        try {
            Scanner in = new Scanner(new File(nomeFile));
            // Conteggio righe dentro al file "input.xt"
            while(in.hasNextLine()) {
                linea = in.nextLine();
                // Creazione dell'array dove inserire i numeri in String
                String [] arrayNumeri = linea.split("\\s+"); // Separa i numeri che hanno spazio
                list1.add(Integer.parseInt(arrayNumeri[0]));
                list2.add(Integer.parseInt(arrayNumeri[1]));
            }
            in.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Errore nella lettura del file");
        }

        // Ordinamento crescente dei due ArrayList
        Collections.sort(list1);
        Collections.sort(list2);

        System.out.println("Numeri prima colonna: ");
        for (int num : list1){
            System.out.println(num);
        }

        System.out.println("\n\nNumeri seconda colonna: ");
        for (int num : list2){
            System.out.println(num);
        }

        for (int i = 0; i < list1.size(); i++) {
            // Calcolo della distanza in valore assoluto
            diff = Math.abs(list1.get(i) - list2.get(i));
            sommaDiff = sommaDiff + diff;
        }

        System.out.println("\nLa somma delle distanze e': " + sommaDiff);

        for(int i = 0; i < list1.size(); i++) {
            int count = 0;
            for (int k = 0; k < list2.size(); k++) {
                if (list1.get(i).equals(list2.get(k))) {
                   count++;
                }
            }
            prod = list1.get(i) * count;
            sommaProd = sommaProd + prod;
        }

        System.out.println("La somma dei prodotti della ripetizione dello stesso numero e': " + sommaProd);
    }
}