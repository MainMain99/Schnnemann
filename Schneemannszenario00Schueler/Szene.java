import GLOOP.*;

public class Szene
{
    GLSchwenkkamera Kamera;
    GLLicht Licht;
    GLBoden boden;
    Baum baum;
    Schneemann schneemann1;
    Schneeflocke schneeflocke[];
    
   
    /**
     * Constructor für Objekte der Klasse Szene
     */
    public Szene(int pAnzahlSchneeflocken)
    {
        schneeflocke=new Schneeflocke[pAnzahlSchneeflocken];
        Kamera=new GLSchwenkkamera();
        Licht=new GLLicht(0,100000,0);
        Kamera.setzePosition(-400,400,600);
        boden=new GLBoden("Schnee.jpg");
        baum=new Baum();
        schneemann1=new Schneemann();
        for(int i=0;i<pAnzahlSchneeflocken;i++)
        {
            schneeflocke[i]=new Schneeflocke();
        }
        while (1+1==2)
        {
        for(int i=0;i<pAnzahlSchneeflocken;i++)
        {
            if (i<pAnzahlSchneeflocken)
            {
                schneeflocke[i].schneien();
            }
            else
            {
                i=0;
            }
        }
    }
}

}
