package de.emg_haar.schafkopfdeluxe.game.card;

//Festlegung der Farbe einer Karte mithilfe eines Enums
public enum CardColor {
    //Festlegung der 4 Farben
    EICHEL("eichel"),
    LAUB("laub"),
    HERZ("herz"),
    SCHELLEN("schellen");

    //Name der jeweiligen Farbe (z.B. "eichel")
    private String name;

    //Konstruktor der Klasse
    CardColor(String name) {
        this.name = name;
    }

    //getter Methode für name
    public String getName() {
        return name;
    }

    public int convertToInt()
    {
        if(getName().equals("eichel"))
        {
            return 3;
        }

        else if(getName().equals("laub"))
        {
            return 2;
        }
        else if(getName().equals("schellen"))
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
