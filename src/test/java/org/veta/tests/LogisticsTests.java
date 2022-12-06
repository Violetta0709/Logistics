package org.veta.tests;

import com.codeborne.pdftest.PDF;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.veta.pages.*;

import java.io.File;

import static com.codeborne.pdftest.assertj.Assertions.assertThat;
import static com.codeborne.selenide.Selenide.*;
import static org.veta.tests.testdata.TestData.*;
import static io.qameta.allure.Allure.step;


public class LogisticsTests extends TestBase {
    RequestProposal request = new RequestProposal();
    RegionalOffices regional = new RegionalOffices();
    BecomingPartner partner = new BecomingPartner();
    CustomClearance services = new CustomClearance();
    OrderingFreight freight = new OrderingFreight();
    TrackingParcel tracking = new TrackingParcel();
    UserAgreement content = new UserAgreement();

    //@Disabled
    @Test
    @DisplayName("Request proposal for business")
    void fillFormForProposalTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        request.openPage()
                .askProposal()
                .setUserName(fullName)
                .setNumber(phone)
                .setEmail(email)
                .clickSubmit()
                .checkResult();
    }

    //@Disabled
    @Test
    @DisplayName("Checking info about regional offices")
    void checkRegionalOfficesInfoTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        regional.openPage()
                .checkTitle()
                .chooseCity()
                .checkResult();
    }

    //@Disabled
    @Test
    @DisplayName("Becoming partner")
    void fillFormBecomePartnerTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        partner.openPage()
                .checkTitle()
                .connect()
                .checkPickup()
                .becomePartner()
                .setUserName(fullName)
                .setNumber(phone)
                .setCity(city)
                .setEmail(email)
                .setAddress(address)
                .clickSubmit()
                .checkResult();
    }

    //@Disabled
    @Test
    @DisplayName("Ordering custom clearance services")
    void fillFormCustomClearanceTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        services.openPage()
                .checkTitle()
                .makeApplication()
                .checkForm()
                .setUserName(fullName)
                .setNumber(phone)
                .setEmail(email)
                .uploadFile(filePath)
                .clickSubmit()
                .checkResult();
    }

    //@Disabled
    @Test
    @DisplayName("Ordering freight")
    void fillFormForFreightTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        freight.openPage()
                .orderFreight()
                .popupClose()
                .checkTitle1()
                .checkTitle2()
                .setShipmentAddress(address)
                .setShipmentDate(shipDate)
                .setShipmentTime(shipTime)
                .setShipmentCompany(companyName)
                .setShipmentPhone(phone)
                .setShipmentName(fullName)
                .checkAddShipment()
                .checkTitle3()
                .setDeliveryAddress(address)
                .setDeliveryDate(delDate)
                .setDeliveryTime(delTime)
                .setDeliveryCompany(companyName)
                .setDeliveryPhone(phone)
                .setDeliveryName(fullName)
                .checkAddDelivery()
                .setCargoDescription(cargoType)
                .selectPackType(packType)
                .setCargoQty(cargoQty)
                .setCargoWeight(cargoWeight)
                .setCargoVolume(cargoVolume)
                .checkAddCargo()
                .selectTransportCapacity(transpCapacity)
                .selectTransportType(transpType)
                .selectTransportLoadType(loadType)
                .checkExtraEquip()
                .setDesiredCost(cost)
                .checkDocReturn()
                .clickSubmit()
                .checkResult();
    }

    //@Disabled
    @Test
    @DisplayName("Check user agreement content")
    void checkUserAgreementTest() throws Exception {
        SelenideLogger.addListener("allure", new AllureSelenide());

        content.openPage();
        File downloadedFile = content.getLink().download();
        PDF pdf = new PDF(downloadedFile);
        assertThat(pdf.text).contains(info);
    }

    //@Disabled
    @Test
    @DisplayName("Tracking parcel")
    void trackParcelTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        tracking.openPage()
                .setTrackingNumber(tracknumber)
                .clickSubmit()
                .checkResult();
    }
}


