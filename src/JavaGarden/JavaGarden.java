/*
 12. feladat: Kertészet
Neptun-kód: M66MZ0
Müller György
 */
package JavaGarden;

//import javax.swing.JFrame;
import java.io.*;

public class JavaGarden {
    public static String adatmappa = System.getProperty("user.dir");
    public static String kerteszetfile = "\\kerteszet.txt";
    public static String keszletfile = "\\keszlet.txt";
    public static String vevokfile = "\\vasarlok.txt";
    
    public static void main(String[] args) {
        //*** Saját mappa létrehizása
        File f = new File(adatmappa + kerteszetfile);
        if (!f.exists()) {
            //*** Nincs a kertészet nevét tároló txt file ***
            NevBekero nb = new NevBekero();
            nb.setLocationRelativeTo(null);
            nb.setVisible(true);
        }
        
        //GUI indítása
        //GardenGUI mainscreen = new GardenGUI();
        //mainscreen.setVisible(true);
    }
    
}
