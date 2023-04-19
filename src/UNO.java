import java.util.Scanner;


public class UNO {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zum Starten, Start schreiben");
        String start = scanner.nextLine();
        if("start" .equals(start.toLowerCase())){

            //Spiler Namen Abfrage und Anzahl der Spieler

            System.out.println("Kurze Information: mind. 2 Player max. 4 Player");
            System.out.println("Enter Player Names:");
            int index;
            int PlayerAnzahl = 0;
            String Antwort;
            String PlayerNameInput;
            String PlayerName[] = new String[4];
            for(index = 0; index < 4;){
                PlayerAnzahl++;
                PlayerNameInput = scanner.nextLine();
                PlayerName[index] = PlayerNameInput;
                index++;
                if(index >= 2){
                    System.out.println("Sind das die Maximalen Spieler?");
                    Antwort = scanner.nextLine();
                    if("ja" .equals(Antwort.toLowerCase())){
                        index = 4;
                    }else {
                        System.out.println("Weitere Spieler:");
                    }
                }
            }
            //GameLoop:
            boolean win = false;
            while (!win) {
                UnoHand hand = new UnoHand();
                hand.befuellen();
                hand.mischeHand();
                hand.zeigeHand();

                win = true;
            }
        }
    }
}


