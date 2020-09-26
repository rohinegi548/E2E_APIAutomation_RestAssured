package resources;

import java.util.ArrayList;
import gmappojo.AddPlacePayload;
import gmappojo.Location;
import gmappojo.UpdatePlacePojo;

public class TestDataBuilder {

	static UpdatePlacePojo up;
	
	public static AddPlacePayload getAddPlacePayloadPOJO(String name, String lang, String address) {

		AddPlacePayload ap = new AddPlacePayload();

		Location loc = new Location();
		loc.setLat(-38.383494);
		loc.setLng(33.427362);

		ap.setAccuracy(50);
		ap.setAddress(address);
		ap.setLanguage(lang);
		ap.setName(name);
		ap.setPhone_number("(+91) 983 893 3937");
		ap.setWebsite("http://google.com");
		ap.setLocation(loc);

		ArrayList<String> al = new ArrayList<String>();
		al.add("shoe park");
		al.add("shop");
		ap.setTypes(al);

		return ap;
	}
	
	public static String getDeletePlacePayload(String place_id){
		
		return "{\r\n" + 
				"	\"place_id\":\""+place_id+"\"\r\n" + 
				"}";
	}
	
	public static UpdatePlacePojo getUpdatePlacePayload(String placeid){
		
		up = new UpdatePlacePojo();
		up.setAddress("South Carolina, AVe 10");
		up.setKey("qaclick123");
		up.setPlace_id(placeid);
		
		return up;
	}
	
	public static String getAddress(){
		
		return up.getAddress();
	}

}
