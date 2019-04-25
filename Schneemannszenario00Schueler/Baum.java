
import GLOOP.*;

public class Baum
{
    /**
     * Attribute und Objektvariablen werden hier festgelegt.
     */
    GLZylinder Stamm;       //Ein Baum besteht aus einem Stamm, der zylinderförmig wirkt
    GLKegel Krone;          //und einer Krone, die bei einer Tanne Kegelförmig ist

    /**
     * Diese Methode ist der Konstruktor einer Klasse. 
     * Er wird aufgerufen, wenn ein Objekt aus der Klasse erstellt wird.
     * Hier werden Objekte erzeugt, aus denen 
     */
    public Baum()
    {
        Stamm=new GLZylinder(0,-10,0,10,50);
        Stamm.drehe(90,0,0);
        Stamm.setzeFarbe(0.50,0.25,0.10);
        Krone=new GLKegel(0,40,0,20,60);
        Krone.drehe(90,0,0);
        Krone.setzeTextur("Schnee.jpg");
    }
    
    public void verschiebeDich()
    {
        Stamm.verschiebe(500000,0,45);
        Krone.verschiebe(500000,0,45);
    }
    public void verschiebeDich2()
    {
        Stamm.verschiebe(20,0,60);
        Krone.verschiebe(20,0,60);
    }
}
