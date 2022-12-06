package org.veta.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegionalOffices {

    private SelenideElement
            pageIntro = $(".page-intro"),
            city = $(".columns-list__link"),
            regionInfo = $(".region__offices");
    private final static String TITLE_TEXT = "Региональные офисы";

    public RegionalOffices openPage() {
        open("/about/regions");
        return this;
    }

    public RegionalOffices checkTitle() {
        pageIntro.shouldHave(text(TITLE_TEXT));
        return this;
    }

    public RegionalOffices chooseCity() {
        //$(".cookie-popup__button").click();
        city.click();
        return this;
    }

    public RegionalOffices checkResult() {
        regionInfo.shouldHave(text("Адрес"))
                .shouldHave(text("E-mail"));
        return this;
    }

}


