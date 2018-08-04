import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;

import com.google.gson.Gson;

public class GsonFetchNetworkJson {

    public static void main(String[] args) throws Exception {

        URL url = new URL("https://httpbin.org/get?color=red&shape=oval");
        InputStreamReader reader = new InputStreamReader(url.openStream());
        MyDto dto = new Gson().fromJson(reader, MyDto.class);

        // using the deserialized object
        System.out.println(dto.headers);
        System.out.println(dto.args);
        System.out.println(dto.origin);
        System.out.println(dto.url);
    }

    private class MyDto {
        Map<String, String> headers;
        Map<String, String> args;
        String origin;
        String url;
    }
}