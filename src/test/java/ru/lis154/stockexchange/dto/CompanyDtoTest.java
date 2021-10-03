package ru.lis154.stockexchange.dto;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import ru.lis154.stockexchange.entity.CompanyEntity;

import static org.junit.jupiter.api.Assertions.*;

class CompanyDtoTest {

    @Test
    void convertDTO() {
        CompanyDto companyDto = new CompanyDto("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", true, "12", "13", "14");
        CompanyEntity companyEnity = new CompanyEntity("5", "8", "1");
        assertEquals(companyEnity, companyDto.convertDTO());
    }
}