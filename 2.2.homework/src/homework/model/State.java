package homework.model;

public class State {
	
	private int id;
	private String name;
	
	public State() {} 
	
	public State(int id, String name) {
		this.setId(id);
		this.setName(name);
	}	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
