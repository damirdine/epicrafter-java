package epicrafter;

public class Rempart {
    private Mur mur;

    Rempart(final Mur m) {
        this.mur = m;
    }

    public boolean isTraversable() {
        return !mur.isPorteur();
    }
}
