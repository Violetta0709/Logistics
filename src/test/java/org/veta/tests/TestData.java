package org.veta.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;

import java.time.Month;
import java.util.Locale;

import static com.codeborne.selenide.Configuration.baseUrl;

public class TestData {
    private static final Faker faker = new Faker(new Locale("en"));
    public static String
            fullName = faker.name().fullName(),
            email = faker.internet().emailAddress(),
            phone = "9"+faker.phoneNumber().subscriberNumber(9),
            city = faker.address().cityName(),
            address = faker.address().fullAddress(),
            companyName = faker.company().name(),
            filePath = "pdf/3.pdf",
            shipDate = "20" + "01" + "2023",//не могу найти локаторы для календаря и времени, помогите, пожалуйста
            shipTime = "11" + "00",
            delDate = "27" + "01" + "2023",
            delTime = "11" + "00",
            packType = "Короб",//как правильно оформить опции выпадающего списка? чз ENUM? напишите, пожалуйста, пример
            transpCapacity = "1т / 7м3 / 3пал.", //как правильно оформить опции выпадающего списка? чз ENUM? напишите, пожалуйста, пример
            transpType = "Фургон (будка)", //как правильно оформить опции выпадающего списка? чз ENUM? напишите, пожалуйста, пример
            loadType = "Задняя загрузка", //как правильно оформить опции выпадающего списка? чз ENUM? напишите, пожалуйста, пример
            cargoType = faker.funnyName().name(),
            cargoQty = String.valueOf(faker.number().numberBetween(1, 1000)),
            cargoWeight = String.valueOf(faker.number().numberBetween(1, 1000000)),
            cargoVolume = String.valueOf(faker.number().numberBetween(1, 1000000)),
            cost = String.valueOf(faker.number().numberBetween(1, 10000000)),
            tracknumber = "123456789",// нужен диапазон валидных значений
            info = "ПОЛЬЗОВАТЕЛЬСКОЕ СОГЛАШЕНИЕ";//как составить перечень фраз?

}
