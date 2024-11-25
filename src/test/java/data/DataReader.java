package data;
import java.io.File;
import java.io.IOException;
import java.lang.runtime.ObjectMethods;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataReader {

	public List<HashMap<String, String>> getJsonData(String filepath) throws IOException {
		//Read JSON to Sting
		String jsonContent = FileUtils.readFileToString(new File(filepath),StandardCharsets.UTF_8);
		
		//Read String to Hashmap
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jnode = mapper.readTree(new File(filepath));
		List<HashMap<String, String>> data1 = mapper.readValue(jsonContent,
				new TypeReference<List<HashMap<String, String>>>() {
				});
		return data1;
	}
}
