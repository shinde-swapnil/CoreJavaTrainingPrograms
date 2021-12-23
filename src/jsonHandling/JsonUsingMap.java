package jsonHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonUsingMap {

	public static void main(String[] args) throws IOException {
//		Map<String, String> elements = new HashMap<String, String>();
//        elements.put("Key1", "Value1");
//        elements.put("Key2", "Value2");
//        elements.put("Key3", "Value3");

		JSONObject obj = new JSONObject();
		Map<String, Integer> phonebook = new HashMap<>();

		phonebook.put("Phani", 98745632);
		phonebook.put("Deon", 7896545);
		phonebook.put("Rahul", 25646);
		phonebook.put("Abhi", 133455);

		obj.putAll(phonebook);

		FileWriter fw = new FileWriter("D:\\Workspace\\JavaTraining\\src\\jsonHandling\\MyFirstJSON.json");
		fw.write(obj.toJSONString());

		fw.close();

		System.out.println("My file is generated");

		// JSON parser object to parse read file
		JSONParser jsonParser = new JSONParser();

		FileReader reader = new FileReader("D:\\Workspace\\JavaTraining\\src\\jsonHandling\\MyFirstJSON.json");

		// Read JSON file
		JSONObject readObject = null;
		try {
			readObject = (JSONObject) jsonParser.parse(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Set<String> setObject = readObject.keySet();

		for (String key : setObject) {
			System.out.println("key : " + key);
		}

	}

}
