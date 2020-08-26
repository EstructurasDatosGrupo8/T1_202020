package model.logic;


public class Editor implements Comparable <Editor> {
	
	
	private String name;
	
	

	
	public Editor (String editor) {
		this.setEditor(editor);
	
	}  
	
	
	@Override
	public int compareTo(Editor editor) {
		// TODO Auto-generated method stub
		return 0;
	}




	public String getEditor() {
		return name;
	}



	public void setEditor(String editor) {
		this.name = editor;
	}
}
