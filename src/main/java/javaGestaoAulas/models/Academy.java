package javaGestaoAulas.models;

public class Academy extends Entity_ <T> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String type;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	@Override
	public String toString() {
		return "Academy [name=" + name + ", type=" + type + "]";
	}
	
	

}
