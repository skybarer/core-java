package Json;

import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFileRead {

	public static void main(String args[]) {

		ObjectMapper mapper = new ObjectMapper();
		InputStream is = JsonFileRead.class.getResourceAsStream("/test.json");
		try {
			@SuppressWarnings("unused")
			JsonFileRead testObj = mapper.readValue(is, JsonFileRead.class);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
