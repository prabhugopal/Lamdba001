package c4f.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LamdbaRequestHandler implements RequestHandler<String, String> {
    public String handleRequest(String s, Context context) {
        context.getLogger().log("Input: " + s);
        return "[LamdbaRequestHandler] Hello, world!.." + s;
    }
}
