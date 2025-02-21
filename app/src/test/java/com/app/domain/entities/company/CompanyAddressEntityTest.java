package com.app.domain.entities.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CompanyAddressEntityTest {

    @Test
    void constructor_SetsAllFieldsCorrectly() {
        CompanyAddressEntity address = new CompanyAddressEntity(123, "Main St", "Downtown", "Metropolis");

        assertEquals(123, address.getNumber());
        assertEquals("Main St", address.getStreet());
        assertEquals("Downtown", address.getDistrict());
        assertEquals("Metropolis", address.getCity());
    }

    @Test
    void getNumber_ReturnsCorrectNumber() {
        CompanyAddressEntity address = new CompanyAddressEntity(456, "Elm St", "Suburbia", "Gotham");

        assertEquals(456, address.getNumber());
    }

    @Test
    void getStreet_ReturnsCorrectStreet() {
        CompanyAddressEntity address = new CompanyAddressEntity(789, "Oak St", "Uptown", "Star City");

        assertEquals("Oak St", address.getStreet());
    }

    @Test
    void getDistrict_ReturnsCorrectDistrict() {
        CompanyAddressEntity address = new CompanyAddressEntity(101, "Pine St", "Midtown", "Central City");

        assertEquals("Midtown", address.getDistrict());
    }

    @Test
    void getCity_ReturnsCorrectCity() {
        CompanyAddressEntity address = new CompanyAddressEntity(202, "Maple St", "Old Town", "Coast City");

        assertEquals("Coast City", address.getCity());
    }
}