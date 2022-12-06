package org.veta.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RequestProposal {

    private SelenideElement
            proposalGet = $(byText("Получить предложение")),
            userName = $("[name=fio]"),
            userPhone = $("#form_business_phone"),
            userEmail = $("[name=email]"),
            leadForm = $("#lead_amoform"),
            confirmBlock = $("#formblock");

    private final static String BYE_TEXT = "Ваше сообщение отправлено!";

    public RequestProposal openPage() {
        open("/online_stores");
        $(".cookie-popup__button").click();
        return this;
    }

    public RequestProposal askProposal() {
        proposalGet.click();
        return this;
    }

    public RequestProposal setUserName(String value) {
        userName.setValue(value);
        return this;
    }

    public RequestProposal setNumber(String value) {
        userPhone.setValue(value);
        return this;
    }

    public RequestProposal setEmail(String value) {
        userEmail.setValue(value);
        return this;
    }

    public RequestProposal clickSubmit() {
        leadForm.click();
        return this;
    }

    public RequestProposal checkResult() {
        confirmBlock.shouldHave(text(BYE_TEXT));
        return this;
    }
}


