package model.logic;


public class Producer implements Comparable <Producer> {
	
	private String name;
	
	
	public Producer (String producer) {
		this.setProducer(producer);
	
	}  
	
	
	
	@Override
	public int compareTo(Producer producer) {
		// TODO Auto-generated method stub
		return 0;
	}




	public String getProducer() {
		return name;
	}



	public void setProducer(String producer) {
		this.name = producer;
	}
}
