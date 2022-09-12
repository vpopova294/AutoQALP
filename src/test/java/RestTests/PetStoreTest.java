package RestTests;

import org.testng.annotations.Test;

import java.io.IOException;

public class PetStoreTest {
    @Test
    public void orderGetTest() throws IOException {
        RestApiPetStore restTestPost1 = new RestApiPetStore();

        //post an order for pet
        restTestPost1.placeAnOrderForPet("2");

        //get purchase order by ID
        restTestPost1.getPurchaseOrderById();

        //delete purchase order by ID
        restTestPost1.deletePurchaseOrderById();

        //get pet inventories by status

        restTestPost1.getPetInventoriesByStatus();
    }
}
