package epicrafter;

public abstract class Bloc implements IBloc {
	int longeur;

	public Bloc(final int l) {
		this.longeur = l;
	}

	public int getLongeur() {
		return longeur;
	}

	public void whoIAm() {
		System.out.println("Iam bloc!");
	}
}
