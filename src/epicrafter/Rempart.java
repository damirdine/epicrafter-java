package epicrafter;

public class Rempart {
    private IBloc mur;

    Rempart(final IBloc m) {
        this.mur = m;
    }

    public boolean isTraversable() {
        return !mur.isPorteur();
    }
}
