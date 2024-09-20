package David_Burger.Person;

public class Human {
    private String name;
	
	/**
	 * Constructor
	 */
	public Human(String name) {
		this.name = name;
		
	}

    
    /** 
     * @return String
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
