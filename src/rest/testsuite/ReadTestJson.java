package rest.testsuite;

import java.io.File;
import java.io.IOException;

import com.dto.AddPlace;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadTestJson {
	public String testDataJson;

	public void readJson() throws Exception {
		AddPlace place = null;
		System.out.println("Hello rest api");

		File file = new File(
				"C:\\Users\\ajayj\\eclipse-workspace\\com.lattu\\src\\test\\java\\resources\\googlemaps\\addplace.json");
		ObjectMapper om = new ObjectMapper();

		place = om.readValue(file, AddPlace.class); // read json > class variables

		place.setLanguage("Telugu"); // update > update class variables

		testDataJson = om.writeValueAsString(place); // write > class variables to Json

		System.out.println(testDataJson);

	}

	public String returnJson() {
		return testDataJson;
	}

}
