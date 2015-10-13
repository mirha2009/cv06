public class Strom {
//pokus pro git
	Vrchol root;
	Vrchol previous;

	public Strom() {
		root = null;
	}

	void vloz(int klic) {
		Vrchol a = root;
		previous = null;
		while (a != null) {//hleda sparavne misto pro vlozeni prvku, pokud jiz existuje vrchol stromu
			previous = a;//ulozi novy prvek za koren
			if (klic > a.klic) {//porovna 2 prvky a pokud je vetsi, uloyi ho do stromu na pravo a naopak
				a = a.right;
			} else
				a = a.left;
		}
		Vrchol b = new Vrchol(klic);// jedna se o prvni prvek (vrchol stromu)
		b.previous = previous;
		if (previous == null) {// jedna se o prvni prvek (vrchol stromu)
			root = b;
		} else if (klic > previous.klic) {
			previous.right = b;
		} else
			previous.left = b;
	}
	/*
	 * metoda na vypsani cesty k hledanemu prvku
	 */
	void cesta (int klic){
		Vrchol a = root;
		String path = "";
		while ((a!=null)&&(klic!=a.klic)){//pokud jiz existuje prvek ve stromu a zaroven neni stejny
			path = path + a.klic + " ";
			if(klic > a.klic) {
				a=a.right;
			}
			else {
				a=a.left;
			}
		}		
		if (a!=null){//existuje strom
			System.out.print(path);
			a.tiskVrcholu();
			System.out.println();
		}
		else System.out.println("Prvek nenalezen");
	}
	public void preOrder(Vrchol vrchol){
		if(vrchol == null){
			return;
		}
		vrchol.tiskVrcholu();
		preOrder(vrchol.left);
		preOrder(vrchol.right);
	}
	
	public void inOrder(Vrchol vrchol){
		if(vrchol == null){
			return;
		}
		inOrder(vrchol.left);
		vrchol.tiskVrcholu();
		inOrder(vrchol.right);
	}
	
	public void postOrder(Vrchol vrchol){
		if(vrchol == null){
			return;
		}
		postOrder(vrchol.left);
		postOrder(vrchol.right);
		vrchol.tiskVrcholu();
	}

}
