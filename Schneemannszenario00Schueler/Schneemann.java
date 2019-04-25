import GLOOP.*;

public class Schneemann
{
    GLKugel Kugel1;
    GLKugel Kugel2;
    GLKugel Kugel3;
    GLKugel Auge1;
    GLKugel Auge2;
    GLKegel Nase;
    GLZylinder Hutkrempe;
    GLZylinder Hutoberteil;
    public Schneemann()
    {
        Kugel1= new GLKugel(0,35,0,50);
        Kugel2=new GLKugel(0,90,0,40);
        Kugel3=new GLKugel(0,140,0,35);
        Auge1=new GLKugel(-32.5,155,0,2);
        Auge1.setzeFarbe(0,0,0);
        Auge2=new GLKugel(-29.5,155,12,2);
        Auge2.setzeFarbe(0,0,0);
        Nase=new GLKegel(-30,150,6.5,5,30);
        Nase.setzeFarbe(1,0.5,0.25);
        Nase.setzeDrehung(0,100,0);
        Hutkrempe= new GLZylinder (0,185,0,20,10);
        Hutkrempe.setzeDrehung(90,0,0);
        
    }
}
