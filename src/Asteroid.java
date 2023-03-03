import GLOOP.*;

public class Asteroid{
    GLKugel kug1;
    double xPos;
    double pY;
    public Asteroid(){
        xPos = (Math.random()*1000);
        kug1 = new GLKugel(xPos-500,1000,0,50);
    }
    public void astebewege(){kug1.verschiebe(0,-1,0);
   pY = kug1.gibY();
        if (pY < -350) {
        kug1.setzePosition(xPos - 500, 1000, 0);
    }
    }

    public double gibX(){
        return kug1.gibX();
    }
}
