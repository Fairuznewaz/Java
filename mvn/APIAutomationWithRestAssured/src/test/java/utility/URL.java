package utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class URL {


    private static Logger log = LogManager.getLogger(utility.URL.class.getName());
    // Base URL
    public static final String URL = "https://jnswdazms1.execute-api.us-east-1.amazonaws.com/dev";

    public static String getEndPoint(){
        log.info("Base URI : " + URL);
        return URL;
    }

    public static String getEndPoint(String resource){
        log.info("URI End Point : " + URL + resource);
        return URL + resource;
    }

}