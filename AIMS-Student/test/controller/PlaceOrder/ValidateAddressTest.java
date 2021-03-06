package controller.PlaceOrder;

import controller.PlaceOrderController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidateAddressTest {
    private PlaceOrderController placeOrderController;
    @BeforeEach
    void setUp() {
        placeOrderController = new PlaceOrderController();
    }
    @ParameterizedTest
    @CsvSource({
            "105 Bach Mai, true",
            "So . 105 Bach Mai, false",
            ", false"
    })
    void validateAddress(String address, boolean expected){
        //when
        boolean actual = placeOrderController.validateAddress(address);
        //then
        assertEquals(expected, actual);
    }
}
