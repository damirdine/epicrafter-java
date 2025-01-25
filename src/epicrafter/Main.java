package epicrafter;

public class Main {
	public static void main (String[] args) {
		String name = "Moi";
		affiche(name);
		final int result = addition(3,3);
		System.out.println("resultat : " + result);

		
	}
	public static void affiche (String name) {
		String[] val = name.split("");
		for (String lettre : val) {			
			System.out.println("Une fonction en Java a été exécutée " + lettre );
		}
	}
	public static int addition ( final int num1, final int num2) {
		return num1 + num2;
	}
	public static int decompte(final int valeur) {
		if(valeur>= 0) {
			decompte(valeur-1);
		}
		return valeur;
	}
}