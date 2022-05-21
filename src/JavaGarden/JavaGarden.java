/*
 12. feladat: Kertészet
Neptun-kód: M66MZ0
Müller György
 */
package JavaGarden;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.ArrayList;



public class JavaGarden {
    public static String adatmappa = System.getProperty("user.dir");
    public static String kerteszetfile = "\\kerteszet.txt";
    public static String keszletfile = "\\keszlet.txt";
    public static String vevokfile = "\\vasarlok.txt";
    public static ArrayList<Noveny> novenyek = new ArrayList<Noveny>();
    
    
    public static void main(String[] args) {
        
        novenyek.add(new Noveny(1,"Muskátli",12,990));
        novenyek.add(new Noveny(2,"Rózsa",32,1090));
        novenyek.add(new Noveny(3,"Tulipán",154,1990));
        novenyek.add(new Noveny(4,"Ibolya",55,490));
        novenyek.add(new Noveny(5,"Krizantém",48,890));

        for (int i=0; i<novenyek.size();i++){
            System.out.println(novenyek.get(i).toString());
        }
        Collections.sort(novenyek, Noveny.ArKomparator());
        
        for (Noveny nov : novenyek) {
            System.out.println(nov.toString());
        }
        //*** Saját mappa létrehozása
        /*File f = new File(adatmappa + kerteszetfile);
        if (!f.exists()) {
            //*** Nincs a kertészet nevét tároló txt file ***
            NevBekero nb = new NevBekero();
            nb.setLocationRelativeTo(null);
            nb.setVisible(true);
        } else {
            //GUI indítása
            GardenGUI mainscreen = new GardenGUI();
            mainscreen.setLocationRelativeTo(null);
            mainscreen.setVisible(true);
        }*/
    }
}
