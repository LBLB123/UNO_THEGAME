public class UnoKarte {
    private Farbe farbe;
    private Wert wert;

    public UnoKarte(Farbe farbe, Wert wert) {
        this.farbe = farbe;
        this.wert = wert;
    }

    public Farbe getFarbe() {
        return farbe;
    }

    public Wert getWert() {
        return wert;
    }

    @Override
    public String toString() {
        return farbe.toString() + " " + wert.toString();
    }
}

enum Farbe {
    Rot, Blau, Gruen, Gelb, Wild, Wild_Draw_Four
}

enum Wert {
    Null, Eins, Zwei, Drei, Vier, Fuenf, Sechs, Sieben, Acht, Neun, Aussetzen, Richtungswechsel, Zwei_Ziehen, Wild, Wild_Draw_Four
}