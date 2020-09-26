package gmappojo;

public class UpdatePlacePojo {
	
	private String place_id;
	private String address;
	private String key;
	
	public String getPlace_id() {
		return place_id;
	}
	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
/*public static UpdatePlacePojo getUpdatePlacePayload(String placeid){
		
		UpdatePlacePojo up = new UpdatePlacePojo();
		up.setAddress("South Carolina, AVe 10");
		up.setKey("qaclick123");
		up.setPlace_id(placeid);
		
		return up;
	}



public static void main(String [] args) throws IOException{
	
	RequestSpecification request = given()
			.spec(new RequestSpecBuilder().setBaseUri(Utilities.getGlobalProperty("baseURI")).setContentType(ContentType.JSON).build())
			.body(getUpdatePlacePayload("664ce6ecb4ed2c100eed41be1726050f"));
	
	UpdatePlacePojo response = request.log().all().expect().defaultParser(Parser.JSON)
			.when().put("/maps/api/place/update/json")
			.then().log().all().extract().response().as(UpdatePlacePojo.class);
	System.out.println("hello "+response.getAddress());
	//setGlobalProperty("address", upj.getAddress());
	Utilities.updateGlobalRuntimeProperty("address","South BLVD. Ave 22",response.getAddress());
	System.out.println("hello "+response.getAddress());
}*/
	

}
