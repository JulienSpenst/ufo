import GLOOP.*;

public class Asteroid {
    GLKugel kug1;
    double xPos;
    double pY;
    int L;
    Ufo dasUfo;
    double abstand;

    public Asteroid(Ufo pUfo) {
        kug1 = new GLKugel(Math.random() * 1400 - 700, Math.random() * 1000 + 700, 0, 50);
        kug1.setzeFarbe(1, 0, 0);
        dasUfo = pUfo;
        L=3;
    }

    public void astebewege() {
        kug1.verschiebe(0, -1, 0);
        pY = kug1.gibY();
        if (getroffen()) {
            L=L-1;
            if (L==0) {
                dasUfo.explodiere();
            }
        }

        if (pY < -350) {
            kug1.setzePosition(Math.random() * 1400 - 700, Math.random() * 1000 + 700, 0);

        }
    }

    public double gibX() {
        return kug1.gibX();
    }

    public double gibY() {
        return kug1.gibY();
    }

    public double gibZ() {
        return kug1.gibZ();
    }

    public boolean getroffen() {
        abstand = Math.sqrt(Math.pow(kug1.gibX() - dasUfo.gibX(), 2) + Math.pow(kug1.gibY() - dasUfo.gibY(), 2) + Math.pow(kug1.gibZ() - dasUfo.gibZ(), 2));
        if (abstand < 50) {
            return true;
        } else {
            return false;
        }
    }

}


