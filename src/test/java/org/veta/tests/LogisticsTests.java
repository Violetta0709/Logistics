package org.veta.tests;

import com.codeborne.pdftest.PDF;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.veta.pages.*;

import java.io.File;

import static com.codeborne.pdftest.assertj.Assertions.assertThat;
import static io.qameta.allure.Allure.step;
import static org.veta.tests.TestData.*;


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
        step("Open page", () -> {
            request.openPage();
        });
        step("Filling form", () -> {
            request.askProposal()
                    .setUserName(fullName)
                    .setNumber(phone)
                    .setEmail(email)
                    .clickSubmit();
        });
        step("Checking form successfully sent", () -> {
            request.checkResult();
        });
    }

    //@Disabled
    @Test
    @DisplayName("Checking info about regional offices")
    void checkRegionalOfficesInfoTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Open page", () -> {
            regional.openPage();
        });
        step("Choose region", () -> {
            regional.checkTitle();
        });
        step("Checking required info exist", () -> {
            regional.chooseCity()
                    .checkResult();
        });
    }

    //@Disabled
    @Test
    @DisplayName("Becoming partner")
    void fillFormBecomePartnerTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Open page", () -> {
            partner.openPage();
        });
        step("Open and fill form", () -> {
            partner.checkTitle()
                    .connect()
                    .checkPickup()
                    .becomePartner()
                    .setUserName(fullName)
                    .setNumber(phone)
                    .setCity(city)
                    .setEmail(email)
                    .setAddress(address)
                    .clickSubmit();
        });
        step("Checking form successfully sent", () -> {
            partner.checkResult();
        });
    }

    //@Disabled
    @Test
    @DisplayName("Ordering custom clearance services")
    void fillFormCustomClearanceTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Open page", () -> {
            services.openPage();
        });
        step("Filling application", () -> {
            services.checkTitle()
                    .makeApplication()
                    .checkForm()
                    .setUserName(fullName)
                    .setNumber(phone)
                    .setEmail(email)
                    .uploadFile(filePath)
                    .clickSubmit();
        });
        step("Filling application", () -> {
            services.checkResult();
        });
    }

    //@Disabled
    @Test
    @DisplayName("Ordering freight")
    void fillFormForFreightTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Open page", () -> {
            freight.openPage()
                    .orderFreight()
                    .popupClose()
                    .checkTitle1()
                    .checkTitle2();
        });
        step("Filling form", () -> {
            freight.setShipmentAddress(address)
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
                    .checkDocReturn();
        });
        step("Checking form successfully sent", () -> {
            freight.clickSubmit()
                    .checkResult();
        });
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
        step("Open page", () -> {
            tracking.openPage();
        });
        step("Insert tracking number", () -> {
            tracking.setTrackingNumber(tracknumber);
        });
        step("Checking tacking info", () -> {
            tracking.clickSubmit()
                    .checkResult();
        });
    }
}

