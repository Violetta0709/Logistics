package org.veta.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BecomingPartner {

    private SelenideElement
            title = $("h1"),
            connectButton = $("#connectBtn"),
            pickUp = $(".top-pickup-point"),
            intro = $("#intro"),
            userName = $("#name"),
            userPhone = $("#phone"),
            userCity = $("#city"),
            userEmail = $("#mail"),
            address = $("#address"),
            submit = $("[type=submit]"),
            confirmation = $(".popup");

    private final static String TITLE_TEXT = "Партнерская программа";
    private final static String PICKUPNET = "Сеть партнерских пунктов выдачи заказов";
    private final static String THANKS_TEXT = "Спасибо за обращение!";

    public BecomingPartner openPage() {
        open("https://sblogistica.ru/partners/");
        return this;
    }

    public BecomingPartner checkTitle() {
        title.shouldHave(text(TITLE_TEXT));
        return this;
    }

    public BecomingPartner connect() {
        connectButton.click();
        return this;
    }

    public BecomingPartner checkPickup() {
        pickUp.shouldHave(text(PICKUPNET));
        return this;
    }

    public BecomingPartner becomePartner() {
        intro.click();
        return this;
    }

    public BecomingPartner setUserName(String value) {
        userName.setValue(value);
        return this;
    }

    public BecomingPartner setNumber(String value) {
        userPhone.setValue(value);
        return this;
    }

    public BecomingPartner setCity(String value) {
        userCity.setValue(value);
        return this;
    }

    public BecomingPartner setEmail(String value) {
        userEmail.setValue(value);
        return this;
    }


    public BecomingPartner setAddress(String value) {
        address.setValue(value);
        return this;
    }

    public BecomingPartner clickSubmit() {
        submit.click();
        return this;
    }

    public BecomingPartner checkResult() {
        confirmation.shouldHave(text(THANKS_TEXT));
        return this;
    }
}


