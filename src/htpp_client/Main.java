package htpp_client;

import org.springframework.web.client.RestTemplate;

public class Main {
    public static void main(String[] args) {
//        HttpClient client = HttpClient.newBuilder()
//                .version(HttpClient.Version.HTTP_2)
//                .connectTimeout(Duration.ofSeconds(10))
//                .build();
//        HttpRequest request = HttpRequest.newBuilder().GET()
//                .uri(URI.create("https://provinces.open-api.vn/api/?depth=2"))
//                .setHeader("User-Agent", "Java 11 HttpClient Bot").build();
//
//        try {
//            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//            HttpHeaders headers = response.headers();
//            headers.map().forEach((k, v) -> System.out.println(k + " : " + v));
//
//            System.out.println(response.headers());
//            System.out.println("STT code");
//            System.out.println(response.statusCode());
//            System.out.println("--------------------------------");
//            System.out.println("Body");
//            System.out.println(jsonViewer(response.body()));
//        } catch (IOException | InterruptedException e) {
//            e.printStackTrace();
//        }

//        kong.unirest.HttpResponse<String> rp = Unirest.get("https://provinces.open-api.vn/api/?depth=2")
//          .header("User-Agent", "Java 11 HttpClient Bot")
//          .asString();
//        System.out.println(jsonViewer(rp.getBody()));

        RestTemplate re = new RestTemplate();
        String map = new String();
        map = re.getForObject("https://provinces.open-api.vn/api/?depth=2", String.class);
        System.out.println(map);
    }


    static String jsonViewer(String json) {
        json = json.replace(",", ",\n").replace("{", "\n{\n").replace("}", "\n}");
        return json;
    }
}
