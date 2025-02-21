package com.app.domain.entities.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeAddressEntityTest {

    @Test
    void getNumber_ReturnsCorrectNumber() {
        EmployeeAddressEntity address = new EmployeeAddressEntity(123, "Main St", "Downtown", "Metropolis");
        assertEquals(123, address.getNumber());
    }

    @Test
    void getStreet_ReturnsCorrectStreet() {
        EmployeeAddressEntity address = new EmployeeAddressEntity(123, "Main St", "Downtown", "Metropolis");
        assertEquals("Main St", address.getStreet());
    }

    @Test
    void getDistrict_ReturnsCorrectDistrict() {
        EmployeeAddressEntity address = new EmployeeAddressEntity(123, "Main St", "Downtown", "Metropolis");
        assertEquals("Downtown", address.getDistrict());
    }

    @Test
    void getCity_ReturnsCorrectCity() {
        EmployeeAddressEntity address = new EmployeeAddressEntity(123, "Main St", "Downtown", "Metropolis");
        assertEquals("Metropolis", address.getCity());
    }

    @Test
    void constructor_ThrowsException_WhenNumberIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            new EmployeeAddressEntity(-1, "Main St", "Downtown", "Metropolis");
        });
    }

    @Test
    void constructor_ThrowsException_WhenStreetIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new EmployeeAddressEntity(123, null, "Downtown", "Metropolis");
        });
    }

    @Test
    void constructor_ThrowsException_WhenDistrictIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new EmployeeAddressEntity(123, "Main St", null, "Metropolis");
        });
    }

    @Test
    void constructor_ThrowsException_WhenCityIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new EmployeeAddressEntity(123, "Main St", "Downtown", null);
        });
    }
}