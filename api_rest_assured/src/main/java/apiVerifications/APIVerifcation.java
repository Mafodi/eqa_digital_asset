//package apiVerifications;
//
//import io.restassured.response.Response;
//import org.json.JSONArray;
//import org.json.JSONObject;
//import org.testng.Assert;
//
//
//public class APIVerifcation {
//
//    public static void responseCodeValidation(Response response, int statusCode){
//
//        try{
//            Assert.assertEquals(response.getStatusCode(),statusCode);
//            //we can add logger here
//            System.out.println("Status code verified succesfully");
//        }catch(AssertionError e) {
//            System.err.println("Status code error" +e);
//        }catch(Exception exp){
//            System.err.println("Exception" + exp);
//        }
//    }
//
//    public static void responseKeyValidationFromJsonArray(Response response, String key){
//
//        try{
//            JSONArray array = new JSONArray(response.getBody().asString());
//            for(int i=0;i<array.length();i++){
//                JSONObject obj= array.getJSONObject(i);
//                System.out.println("Values are : "+obj.get(key));
//            }
//        }catch(Exception e){
//                System.out.println(e.fillInStackTrace());
//        }
//    }
//
//    public static void responseKeyValidationFromJsonObject(Response response, String key){
//
//        try{
//            JSONObject json = new JSONObject(response.getBody().asString());
//            if(json.has(key) && json.get(key)!=null){
//                System.out.println("Value is successfully validated. Value of " + key+ " is "+ json.get(key));
//            }else
//                System.out.println("Key is not available");
//
//        }catch(Exception e){
//            System.out.println(e.fillInStackTrace());
//        }
//
//    }
//
//    public static void responseTimeValidation(Response response){
//
//        try{
//            long time = response.time();
//            System.out.println("API executed within given time frame. It took "+time + " miliseconds");
//        }catch(Exception e){
//            System.out.println(e.fillInStackTrace());
//        }
//    }
//
//}
