package RestTests;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;

public class RestApiPetStore {
    public void placeAnOrderForPet(String petId) throws IOException {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("petId", petId);
        jsonObject.put("shipDate", "2022-09-12T10:13:32.974Z");
        jsonObject.put("status", "placed");
        jsonObject.put("complete", true);


        RequestBody body = RequestBody.create(jsonObject.toString().getBytes());

        Request request = new Request.Builder()
                .post(body)
                .url("https://petstore.swagger.io/v2/store/order")
                .addHeader("Content-Type", "application/json")
                .build();

        Response response = new OkHttpClient().newCall(request).execute();

        System.out.println(response.code());
        String responseBody = response.body().string();

        JSONObject responseJson = new JSONObject(responseBody);
        System.out.println(responseJson.get("status"));

    }

    public void getPurchaseOrderById() throws IOException {

        Request request = new Request.Builder()
                .get()
                .url("https://petstore.swagger.io/v2/store/order/1")
                .build();

        Response response = new OkHttpClient().newCall(request).execute();
        System.out.println(response.code());
        System.out.println(response.body().string());

        }

    public void deletePurchaseOrderById() throws IOException {

        Request request = new Request.Builder()
                .delete()
                .url("https://petstore.swagger.io/v2/store/order/2")
                .build();

        Response response = new OkHttpClient().newCall(request).execute();

        System.out.println(response.code());

    }

    public void getPetInventoriesByStatus() throws IOException {

        Request request = new Request.Builder()
                .get()
                .url("https://petstore.swagger.io/v2/store/inventory")
                .build();

        Response response = new OkHttpClient().newCall(request).execute();

            System.out.println(response.code());
            System.out.println(response.body().string());

        }

}
