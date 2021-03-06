

public class ABR {
	private ABR arbreDroite;
	private ABR arbreGauche;
	private int valeur;
	private boolean vide;
	
	public ABR(){
		this.vide=true;
	}
	
	
	
	/*public ArrayList<ABR> getArbre(){
		return(arbre);
	}*/
	
	public boolean isEmpty(){
		return(this.vide);
	}
	
	
	public void insert(int i){
		if (vide){
			this.valeur = i;
			this.vide=false;
			this.arbreDroite = new ABR();
			this.arbreGauche = new ABR();
		}
		else{
			if (i<this.valeur){
				this.arbreGauche.insert(i);
			}
			else{
				if (i>this.valeur){
					this.arbreDroite.insert(i);
				}
			}
		}
		
	}
	
	public int nbElements(){
		if (this.vide){
			return(0);
		}
		else{
			return(1+this.arbreDroite.nbElements() + this.arbreGauche.nbElements());
		}
	}
	
	public boolean contains(int i){
		if (this.vide){
			return(false);
		}
		else{
			if (this.valeur == i){
				return(true);
			}
			else{if(i<this.valeur){
				return(arbreGauche.contains(i));
			}
			else{
				return(arbreDroite.contains(i));
			}
			}
			
		}
		
		}
		
	
	

			
}
