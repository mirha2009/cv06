
public class Vrchol {

	int klic;
	Vrchol left;
	Vrchol right;
	Vrchol previous;
	Vrchol (int klic){
		this.klic=klic;
	}
	void tiskVrcholu (){
		System.out.print(klic + " ");
	}
}
