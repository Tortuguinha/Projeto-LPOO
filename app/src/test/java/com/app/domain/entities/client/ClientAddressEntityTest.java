package com.app.domain.entities.client;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ClientAddressEntityTest {

    @Test
    void constructor_SetsAllFieldsCorrectly() {
        ClientAddressEntity address = new ClientAddressEntity(123, "Main St", "Downtown", "Metropolis");

        assertEquals(123, address.getNumber());
        assertEquals("Main St", address.getStreet());
        assertEquals("Downtown", address.getDistrict());
        assertEquals("Metropolis", address.getCity());
    }

    @Test
    void getNumber_ReturnsCorrectNumber() {
        ClientAddressEntity address = new ClientAddressEntity(456, "Elm St", "Suburbia", "Gotham");

        assertEquals(456, address.getNumber());
    }

    @Test
    void getStreet_ReturnsCorrectStreet() {
        ClientAddressEntity address = new ClientAddressEntity(789, "Oak St", "Uptown", "Star City");

        assertEquals("Oak St", address.getStreet());
    }

    @Test
    void getDistrict_ReturnsCorrectDistrict() {
        ClientAddressEntity address = new ClientAddressEntity(101, "Pine St", "Midtown", "Central City");

        assertEquals("Midtown", address.getDistrict());
    }

    @Test
    void getCity_ReturnsCorrectCity() {
        ClientAddressEntity address = new ClientAddressEntity(202, "Teste", "Teste", "Teste");

        assertEquals("Teste", address.getCity());
    }
}