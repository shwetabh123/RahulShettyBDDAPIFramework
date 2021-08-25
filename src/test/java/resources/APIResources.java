package resources;

public enum APIResources {
	
	
	GetPersonAPI("/persons"),

	GetSinglePersonAPI("/persons/{id}"),

	AddPersonAPI("/persons"),

	UPDATE_PERSON("/persons/{id}"),

	
	DeletePersonAPI("/persons/{id}");
	
	private String resource;
	
	APIResources(String resource)
	{
		
	this.resource=resource;
		
	}
	
	public String getResource()
	{
		
		return resource;
	}
	

}
