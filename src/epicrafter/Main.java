package epicrafter;

public class Main {
	public static void main(String[] args) {
		String name = "Moi";
		afficher(name);
		Bloc bloc = new Bloc(6);
		System.out.println("resultat : " + bloc.getLongeur());
	}

	public static void afficher(final String name) {
		String[] val = name.split("");
		for (String lettre : val) {
			System.out.println("Une fonction en Java a été exécutée " + lettre);
		}
	}

	public static int decompte(final int valeur) {
		if (valeur >= 0) {
			decompte(valeur - 1);
		}
		return valeur;
	}
}