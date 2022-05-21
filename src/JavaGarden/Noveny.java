package JavaGarden;

import java.text.Collator;

public class Noveny implements Comparable<Noveny>{
    private int id;
    private String megnevezes;
    private int keszlet;
    private int egysegar;

    public Noveny(int id, String megnevezes, int keszlet, int egysegar) {
        this.id = id;
        this.megnevezes = megnevezes;
        this.keszlet = keszlet;
        this.egysegar = egysegar;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setMegnevezes(String megnevezes) {
        this.megnevezes = megnevezes;
    }

    public void setKeszlet(int keszlet) {
        this.keszlet = keszlet;
    }

    public void setEgysegar(int egysegar) {
        this.egysegar = egysegar;
    }

    public int getId() {
        return id;
    }

    public String getMegnevezes() {
        return megnevezes;
    }

    public int getKeszlet() {
        return keszlet;
    }

    public int getEgysegar() {
        return egysegar;
    }

    @Override
    public int compareTo(Noveny masikNoveny){
       return this.egysegar - masikNoveny.egysegar;
    }

    @Override
    public String toString() {
        return "Noveny{" + "id=" + id + ", megnevezes=" + megnevezes + ", keszlet=" + keszlet + ", egysegar=" + egysegar + '}';
    }
    
    public static NovenyArComparator ArKomparator () {
        return new NovenyArComparator();
    }
}
