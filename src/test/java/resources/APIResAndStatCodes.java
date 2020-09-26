package resources;

public enum APIResAndStatCodes {

	AddPlaceAPI("/maps/api/place/add/json"), 
	GetPlaceAPI("/maps/api/place/get/json"), 
	DeletePlaceAPI("/maps/api/place/delete/json"), 
	UpdatePlaceAPI("/maps/api/place/update/json"),
	StatCode200("200"),
	StatCode404("404");
	
	private String resource;

	APIResAndStatCodes(String resource) {
		this.resource = resource;
	}

	public static String getResource(String res) {
		APIResAndStatCodes ar = APIResAndStatCodes.valueOf(res);
		return ar.resource;
		
	}

}
