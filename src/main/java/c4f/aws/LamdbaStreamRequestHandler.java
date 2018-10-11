package c4f.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class LamdbaStreamRequestHandler implements RequestStreamHandler {
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context){
        try {
            String input = IOUtils.toString(inputStream, "UTF-8");
            outputStream.write(("Hello, world!.." + input).getBytes()) ;
        } catch ( IOException ex) {
            ex.printStackTrace();
        }

    }
}
