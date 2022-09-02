
package RCB;

import com.fasterxml.jackson.databind.json.JsonMapper;

public class rcbTeam {
	public static void main(String[] args) throws Exception, Exception {
		String json = "{\r\n"
				+ "  \"name\": \"Royal Challengers Bangalore\",\r\n"
				+ "  \"location\": \"Bangalore\",\r\n"
				+ "  \"player\": [\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Faf Du Plessis\",\r\n"
				+ "      \"country\": \"South Africa\",\r\n"
				+ "      \"role\": \"Batsman\",\r\n"
				+ "      \"price-in-crores\": \"7\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Virat Kohli\",\r\n"
				+ "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Batsman\",\r\n"
				+ "      \"price-in-crores\": \"15\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Glenn Maxwell\",\r\n"
				+ "      \"country\": \"Australia\",\r\n"
				+ "      \"role\": \"Batsman\",\r\n"
				+ "      \"price-in-crores\": \"11\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Mohammad Siraj\",\r\n"
				+ "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n"
				+ "      \"price-in-crores\": \"7\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Harshal Patel\",\r\n"
				+ "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n"
				+ "      \"price-in-crores\": \"10.75\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Wanindu Hasaranga\",\r\n"
				+ "      \"country\": \"Srilanka\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n"
				+ "      \"price-in-crores\": \"10.75\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Dinesh Karthik\",\r\n"
				+ "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Wicket-keeper\",\r\n"
				+ "      \"price-in-crores\": \"5.5\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Shahbaz Ahmed\",\r\n"
				+ "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"All-Rounder\",\r\n"
				+ "      \"price-in-crores\": \"2.4\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Rajat Patidar\",\r\n"
				+ "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Batsman\",\r\n"
				+ "      \"price-in-crores\": \"0.20\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Josh Hazlewood\",\r\n"
				+ "      \"country\": \"Australia\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n"
				+ "      \"price-in-crores\": \"7.75\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Mahipal Lomror\",\r\n"
				+ "      \"country\": \"India\",\r\n"
				+ "      \"role\": \"Bowler\",\r\n"
				+ "      \"price-in-crores\": \"7.75\"\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}";
		
		JsonMapper objMap = new JsonMapper();
		rcbClass obj = objMap.readValue(json, rcbClass.class);
		System.out.println(obj.getname());
		System.out.println(obj.getlocation());
		System.out.println(obj.getplayer());		
	}

}


