package com.app.domain.entities.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

class CompanyEntityTest {

    @Test
    void constructor_SetsAllFieldsCorrectly() {
        Date now = new Date();
        CompanyEntity company = new CompanyEntity("Tech Corp", "info@techcorp.com", "12345678000199", true, now);

        assertEquals("Tech Corp", company.getCompanyName());
        assertEquals("info@techcorp.com", company.getEmail());
        assertEquals("12345678000199", company.getCNPJ());
        assertTrue(company.getStatus());
        assertEquals(now, company.getCreatedAt());
    }

    @Test
    void getId_ReturnsCorrectId() {
        CompanyEntity company = new CompanyEntity("Biz Inc", "contact@bizinc.com", "98765432000188", false, new Date());
        company.setId(1);

        assertEquals(1, company.getId());
    }

    @Test
    void getCompanyName_ReturnsCorrectCompanyName() {
        CompanyEntity company = new CompanyEntity("Alpha Ltd", "alpha@alphaltd.com", "11122233000177", true, new Date());

        assertEquals("Alpha Ltd", company.getCompanyName());
    }

    @Test
    void getEmail_ReturnsCorrectEmail() {
        CompanyEntity company = new CompanyEntity("Beta LLC", "beta@betallc.com", "22233344000166", false, new Date());

        assertEquals("beta@betallc.com", company.getEmail());
    }

    @Test
    void getCNPJ_ReturnsCorrectCNPJ() {
        CompanyEntity company = new CompanyEntity("Gamma GmbH", "gamma@gammagmbh.com", "33344455000155", true, new Date());

        assertEquals("33344455000155", company.getCNPJ());
    }

    @Test
    void getStatus_ReturnsCorrectStatus() {
        CompanyEntity company = new CompanyEntity("Delta Co", "delta@deltaco.com", "44455566000144", false, new Date());

        assertFalse(company.getStatus());
    }

    @Test
    void getCreatedAt_ReturnsCorrectCreatedAt() {
        Date now = new Date();
        CompanyEntity company = new CompanyEntity("Epsilon Ltd", "epsilon@epsilonltd.com", "55566677000133", true, now);

        assertEquals(now, company.getCreatedAt());
    }
}