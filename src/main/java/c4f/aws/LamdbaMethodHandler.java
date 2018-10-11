package c4f.aws;

import com.amazonaws.services.lambda.runtime.Context;

public class LamdbaMethodHandler {
    public String handleRequest(String input, Context ctx){
        ctx.getLogger().log("Input: " + input);
        //return "[LamdbaMethodHandler] Hello, world!.. " + input;
    }
}
