package JavaGarden;

public class Vasarlo {
    int id;
    String nev;
    int egyenleg;
    int kedvezmeny;

    public Vasarlo(int id, String nev, int egyenleg, int kedvezmeny) {
        this.id = id;
        this.nev = nev;
        this.egyenleg = egyenleg;
        this.kedvezmeny = kedvezmeny;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setEgyenleg(int egyenleg) {
        this.egyenleg = egyenleg;
    }

    public void setKedvezmeny(int kedvezmeny) {
        this.kedvezmeny = kedvezmeny;
    }

    public int getEgyenleg() {
        return egyenleg;
    }

    public int getKedvezmeny() {
        return kedvezmeny;
    }
}
