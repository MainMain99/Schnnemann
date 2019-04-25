import GLOOP.*;

public class Schneeflocke extends GLKugel
{
    
    public Schneeflocke()
    {
      super (Math.random()*10000-5000,Math.random()*1000,Math.random()*10000-5000,5);
      super.setzeTextur("Schnee.jpg");
    }
     
    public void schneien()
    {
        if(super.gibY()>0)
        {
            super.verschiebe(0,-0.05,0);
        }
        else
        {
            super.verschiebe(0,1000,0);
        }
    }
    
}
