package wcs_quetes;

public class Classroom {

	public static void main(String[] args) {
		
		Wilder gabrielle = new Wilder("Gabrielle", true);
		System.out.println(gabrielle.whoAmI());
		
		Wilder adel = new Wilder("Adel", false);
		System.out.println(adel.whoAmI());
		
		Wilder thomas = new Wilder("Thomas", true);
		System.out.println(thomas.whoAmI());
	}

}