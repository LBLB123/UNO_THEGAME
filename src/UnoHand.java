import java.util.ArrayList;
import java.util.Collections;

public class UnoHand {
    private ArrayList<UnoKarte> hand;

    public UnoHand() {
        hand = new ArrayList<UnoKarte>();
    }

    public void fuegeKarteHinzu(UnoKarte karte) {
        hand.add(karte);
    }

    public void mischeHand() {
        Collections.shuffle(hand);
    }

    public void zeigeHand() {
        for (UnoKarte karte : hand) {
            System.out.println(karte);
        }
    }
    public Wert wertVonZahl(int zahl) {
        switch (zahl) {
            case 0:
                return Wert.Null;
            case 1:
                return Wert.Eins;
            case 2:
                return Wert.Zwei;
            case 3:
                return Wert.Drei;
            case 4:
                return Wert.Vier;
            case 5:
                return Wert.Fuenf;
            case 6:
                return Wert.Sechs;
            case 7:
                return Wert.Sieben;
            case 8:
                return Wert.Acht;
            case 9:
                return Wert.Neun;
            default:
                throw new IllegalArgumentException("Ungültige Zahl: " + zahl);
        }
    }


    public void befuellen() {
        for (Farbe farbe : Farbe.values()) {
            if (farbe == Farbe.Wild || farbe == Farbe.Wild_Draw_Four) {
                // keine Wild-Karten hinzufügen
                continue;
            }
            for (int zahl = 0; zahl <= 9; zahl++) {
                fuegeKarteHinzu(new UnoKarte(farbe, wertVonZahl(zahl)));
            }
            fuegeKarteHinzu(new UnoKarte(farbe, Wert.Richtungswechsel));
            fuegeKarteHinzu(new UnoKarte(farbe, Wert.Aussetzen));
            fuegeKarteHinzu(new UnoKarte(farbe, Wert.Zwei_Ziehen));
        }
        for (int i = 0; i < 4; i++) {
            fuegeKarteHinzu(new UnoKarte(Farbe.Wild, Wert.Wild));
            fuegeKarteHinzu(new UnoKarte(Farbe.Wild_Draw_Four, Wert.Wild_Draw_Four));
        }
    }
}
