import java.util.*;

public class BST_Klient {

	private static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Zadejte pocet prvku posloupnosti");
		int pocet = sc.nextInt();
		System.out.println("Posloupnost:");
		Strom s = new Strom();		
		for(int i = 0; i < pocet; i++){
			s.vloz(sc.nextInt());
			//lù;
		}
		System.out.println("Hledany prvek:");
		while (sc.hasNextInt()){
			 int h = sc.nextInt();
			 if (h>0){
		System.out.println("Cesta k hledanemu prvku:");
		s.cesta(h);}
			 
			 else if(h==0)break;
	}
		System.out.println("Preorder:");
		s.preOrder(s.root);
		System.out.print("\n");
		
		System.out.println("Inorder:");
		s.inOrder(s.root);
		System.out.print("\n");
		
		System.out.println("Postorder:");
		s.postOrder(s.root);
		System.out.print("\n");
		}

}
