package JavaGarden;

public class Vasarlo {
    int id;
    String nev;
    int egyenleg;
    int kedvezmeny;

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
