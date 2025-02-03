package epicrafter;

public class Mur extends Bloc {
    protected boolean porteur;

    public Mur(int l, boolean porteur) {
        super(l);
        this.porteur = porteur;
    }

    public boolean isPorteur() {
        return porteur;
    }
}