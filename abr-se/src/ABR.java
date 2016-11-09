import java.util.ArrayList;

public class ABR {
	private ArrayList<ABR> Arbre;
	
	public ABR(){
		Arbre= new ArrayList<ABR>();
	}
	
	public ArrayList<ABR> getArbre(){
		return(Arbre);
	}
	
	public boolean isEmpty(){
		ArrayList<ABR> a = new ArrayList<ABR>();
		return(this.Arbre == a);
	}
}
