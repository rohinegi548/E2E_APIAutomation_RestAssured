package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Properties;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Utilities {

	public static RequestSpecification req;
	static Properties prop;
	static OutputStream os;
	static PrintStream ps;
	// static OutputStream os;
	// ResponseSpecification res;

	public RequestSpecification getReqSpecification() throws IOException {

		if (req == null) {
			ps = new PrintStream(new FileOutputStream("logs\\APIExecution.logs"));
			req = new RequestSpecBuilder().setBaseUri(getGlobalProperty("baseURI")).addQueryParam("key", "qaclick123")
					.setContentType(ContentType.JSON).addFilter(RequestLoggingFilter.logRequestTo(ps))
					.addFilter(ResponseLoggingFilter.logResponseTo(ps)).addFilter(new AllureRestAssured()).build();
		}
		return req;
	}
	
	public static PrintStream logPutResponse(){
		
		return ps;
	}

	/*
	 * public ResponseSpecification getResSpecification() {
	 * 
	 * res = new ResponseSpecBuilder().expectContentType(ContentType.JSON).
	 * expectStatusCode(200).build(); return res; }
	 */

	public static String getGlobalProperty(String key) throws IOException {

		Properties p = new Properties();
		FileInputStream fs = new FileInputStream("src\\test\\java\\resources\\global.properties");
		p.load(fs);

		return p.getProperty(key);
	}

	/*public Properties setGlobalProperty(String key, String value) throws IOException {

		if (prop == null) {
			prop = new Properties();
			os = new FileOutputStream("src\\test\\java\\resources\\globaltemp.properties");
		}
		
		prop.setProperty(key, value);
		prop.store(os, "Added "+key+" key & its value");
		System.out.println(prop.entrySet());
		System.out.println(prop);
		System.out.println("hello");
		prop.remove(key);
		return prop;
	}*/

	public static String getGlobalRuntimeProperty(String key) throws IOException {

		Properties p = new Properties();
		FileInputStream fs = new FileInputStream("src\\test\\java\\resources\\globaltemp.properties");
		p.load(fs);
		fs.close();
		return p.getProperty(key);
	}
	
	public static void setGlobalRuntimeProperty(String key, String newAddress) throws IOException {
		Properties props = new Properties();
		String file = "src\\test\\java\\resources\\globaltemp.properties";
		FileInputStream fs = new FileInputStream(file);
		props.load(fs);
		fs.close();
		
		props.setProperty(key, newAddress);
		OutputStream out = new FileOutputStream(file);
		props.store(out, "Updated properties");
		out.close();
		/*Properties p = new Properties();
		OutputStream fs = new FileOutputStream("src\\test\\java\\resources\\globaltemp.properties");
		//p.load(fs);
*/		//prop.setProperty(key, newAddress);
		/*prop.setProperty(key, newAddress);
		//prop.replace(key, oldAddress, newAddress);
		System.out.println(prop);
		System.out.println("hello");
		prop.store(os, "Updated existing Address");*/
		//prop.remove(key);
	}

	public String getReskeyValue(Response res, String key) {

		JsonPath js = new JsonPath(res.asString());
		/*String temp = js.get(key);
		System.out.println(temp)*/;
		return js.get(key);
	}
}
