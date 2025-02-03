package epicrafter;

public class Mur extends Bloc {
    protected boolean porteur;

    public Mur(final int l,final boolean porteur) {
        super(l);
        this.porteur = porteur;
    }

    public boolean isPorteur() {
        return porteur;
    }

    @Override
    public void whoIAm() {
		System.out.println("Iam Mur!");
    }
}