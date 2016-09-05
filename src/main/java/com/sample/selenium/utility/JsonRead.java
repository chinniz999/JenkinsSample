package com.sample.selenium.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.sample.selenium.constants.Setup;

public class JsonRead implements Setup {
	static Logger log = Logger.getLogger(JsonRead.class);

	public JSONObject readJSON(String sJsonFile) {

		JSONParser parser = new JSONParser();
		JSONObject JsonObjet = null;
		try {
			Object obj;
			try {
				obj = parser.parse(new FileReader(sJsonFile));
				JsonObjet = (JSONObject) obj;
				log.info("Testing");
				// String Name = (String) JsonObjet.get(sKey);
			//	System.out.println(JSONObject.toJSONString(JsonObjet));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return JsonObjet;
	}
	
	public static void main(String[] args) {
		
		JsonRead fileRead = new JsonRead();
		JSONObject JsonObjet= fileRead.readJSON(JSONFILE);		System.out.println("------"+(String)JsonObjet.get("Name2"));
		log.info("testing");
	}
}
