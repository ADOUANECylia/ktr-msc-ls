
public class Utilisateur implements Profile{
	private String nom;
	private String nomCompanie; 
	private String email;
	private int numTel;
	
	public Utilisateur (String nom, String companie, String email, int tel) {
		this.nom= nom;
		this.nomCompanie= companie;
		this.email= email;
		this.numTel= tel;
	}
	
	@Override 
	public void nom (String nom) {
		this.nom= nom;
		
	}
	
	
	@Override 
	public void companie (String companie) {
		this.nomCompanie= companie;
		
	}
	
	@Override 
	public void email (String email){
		this.email= email;
		
	}
	
	@Override 
	public void tel (int tel){
		this.numTel= tel;
		
	}
	

}
