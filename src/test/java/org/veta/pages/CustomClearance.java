package org.veta.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CustomClearance {

    private SelenideElement
            title = $(".landing-banner"),
            application = $(byText("Оставить заявку")),
            form = $("#form"),
            userName = $("#username"),
            userPhone = $("#userphone"),
            userEmail = $("#usermail"),
            upload = $("#fileInput"),
            submit = $("[type=submit]"),
            confirmation = $(".callback-form");

    private final static String TITLE_TEXT = "Услуги по таможенному оформлению";
    private final static String SUCCESS_TEXT = "Успешно отправлено!";

    public CustomClearance openPage() {
        open("https://sblogistica.ru/international/");
        return this;
    }

    public CustomClearance checkTitle() {
        title.shouldHave(text(TITLE_TEXT));
        return this;
    }

    public CustomClearance makeApplication() {
        application.click();
        return this;
    }

    public CustomClearance checkForm() {
        form.shouldBe(visible);
        return this;
    }

    public CustomClearance setUserName(String value) {
        userName.setValue(value);
        return this;
    }

    public CustomClearance setNumber(String value) {
        userPhone.setValue(value);
        return this;
    }

    public CustomClearance setEmail(String value) {
        userEmail.setValue(value);
        return this;
    }

    public CustomClearance uploadFile(String value) {
        upload.uploadFromClasspath(value);
        return this;
    }


    public CustomClearance clickSubmit() {
        submit.click();
        return this;
    }

    public CustomClearance checkResult() {
        confirmation.shouldHave(text(SUCCESS_TEXT));
        return this;
    }

}


