package model.logic;

public class ScreenPlay implements Comparable <ScreenPlay> {
	
	private String name;
	

	
	public ScreenPlay (String escritor) {
		this.setEscritor(escritor);
	
	}  
	
	
	
	@Override
	public int compareTo(ScreenPlay screenPlay) {
		// TODO Auto-generated method stub
		return 0;
	}




	public String getEscritor() {
		return name;
	}



	public void setEscritor(String escritor) {
		this.name = escritor;
	}
}
