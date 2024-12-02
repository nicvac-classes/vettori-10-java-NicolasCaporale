//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
       Scanner scanner = new Scanner(System.in);
        int n, i;
        float somma = 0, media;
        do {
            System.out.print("Ins numero persone: ");
            n = scanner.nextInt();
        } while (n <= 0);
        String[] nomi = new String[n];
        float[] votazioni = new float[n];
        float[] crediti = new float[n];
        for (i = 0; i < nomi.length; i++) {
            System.out.print("Nome: ");
            nomi[i] = scanner.next();
            System.out.print("Voto: ");
            votazioni[i] = scanner.nextFloat();
            System.out.print("Crediti: ");
            crediti[i] = scanner.nextFloat();
        }
        for (i = 0; i < votazioni.length; i++) {
            somma += votazioni[i];
        }
        media = somma / n;
        System.out.println("Media: " + media);
        for (i = 0; i < votazioni.length; i++) {
            if (votazioni[i] > media && crediti[i] >= 6) {
                System.out.println(nomi[i] + " è sopra la media e ha almeno 6 crediti");
            }
        }
    }
}

