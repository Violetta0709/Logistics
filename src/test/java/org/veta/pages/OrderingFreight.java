package org.veta.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OrderingFreight {

    private SelenideElement
            order = $("a[href*='/business/freight/order']"),
            popup = $(".cookie-popup__button"),
            banner = $(".hero"),
            shipment = $("#shipment"),
            shipmentAddress = $("#shipment_address"),
            shipmentDate = $("#shipment_date"),
            shipmentTime = $("#shipment_time"),
            shipmentCompany = $("#shipment_company_name"),
            shipmentPhone = $("#shipment_phone"),
            shipmentName = $("#shipment_full_name"),
            addShipment = $("#add_shipment"),
            delivery = $("#delivery"),
            deliveryAddress = $("#delivery_address"),
            deliveryDate = $("#delivery_date"),
            deliveryTime = $("#delivery_time"),
            deliveryCompany = $("#delivery_company_name"),
            deliveryPhone = $("#delivery_phone"),
            deliveryName = $("#delivery_full_name"),
            addDelivery = $("#add_delivery"),
            cargo = $("#cargo_description"),
            packType = $("#cargo_pack_type"),
            cargoQty = $("#cargo_places_quantity"),
            cargoWeight = $("#cargo_weight"),
            cargoVolume = $("#cargo_volume"),
            addCargo = $("#add_cargo"),
            transportCapacity = $("#transport_capacity"),
            transportType = $("#transport_type"),
            transportLoadType = $("#transport_loading_type"),
            additionalEquip = $(".checkboxes-new__item"),
            desiredCost = $("#desired_cost"),
            docReturn = $("[for=documents_return]"),
            submit = $(byText("Оформить заявку")),
            confirmation = $("#freight_order");

    private final static String TITLE_TEXT = "Заказать грузоперевозку";
    private final static String SHIPMENT_TEXT = "Место отправки";
    private final static String DELIVERY_TEXT = "Место доставки";
    private final static String SUCCESS_TEXT = "Успешно отправлено!";

    public OrderingFreight openPage() {
        open("/business/freight");
        return this;
    }

    public OrderingFreight orderFreight() {
        order.click();
        return this;
    }

    public OrderingFreight popupClose() {
        popup.click();
        return this;
    }

    public OrderingFreight checkTitle1() {
        banner.shouldHave(text(TITLE_TEXT));
        return this;
    }

    public OrderingFreight checkTitle2() {
        shipment.shouldHave(text(SHIPMENT_TEXT));
        return this;
    }

    public OrderingFreight setShipmentAddress(String value) {
        shipmentAddress.setValue(value);
        return this;
    }

    public OrderingFreight setShipmentDate(String value) {
        shipmentDate.setValue(value);
        return this;
    }

    public OrderingFreight setShipmentTime(String value) {
        shipmentTime.setValue(value);
        return this;
    }

    public OrderingFreight setShipmentCompany(String value) {
        shipmentCompany.setValue(value);
        return this;
    }

    public OrderingFreight setShipmentPhone(String value) {
        shipmentPhone.setValue(value);
        return this;
    }

    public OrderingFreight setShipmentName(String value) {
        shipmentName.setValue(value);
        return this;
    }

    public OrderingFreight checkAddShipment() {
        addShipment.shouldBe(visible);
        return this;
    }

    public OrderingFreight checkTitle3() {
        delivery.shouldHave(text(DELIVERY_TEXT));
        return this;
    }

    public OrderingFreight setDeliveryAddress(String value) {
        deliveryAddress.setValue(value);
        return this;
    }

    public OrderingFreight setDeliveryDate(String value) {
        deliveryDate.setValue(value);
        return this;
    }

    public OrderingFreight setDeliveryTime(String value) {
        deliveryTime.setValue(value);
        return this;
    }

    public OrderingFreight setDeliveryCompany(String value) {
        deliveryCompany.setValue(value);
        return this;
    }

    public OrderingFreight setDeliveryPhone(String value) {
        deliveryPhone.setValue(value);
        return this;
    }

    public OrderingFreight setDeliveryName(String value) {
        deliveryName.setValue(value);
        return this;
    }

    public OrderingFreight checkAddDelivery() {
        addDelivery.shouldBe(visible);
        return this;
    }

    public OrderingFreight setCargoDescription(String value) {
        cargo.setValue(value);
        return this;
    }

    public OrderingFreight selectPackType(String value) {
        packType.selectOptionByValue(value);
        return this;
    }

    public OrderingFreight setCargoQty(String value) {
        cargoQty.setValue(value);
        return this;
    }

    public OrderingFreight setCargoWeight(String value) {
        cargoWeight.setValue(value);
        return this;
    }

    public OrderingFreight setCargoVolume(String value) {
        cargoVolume.setValue(value);
        return this;
    }

    public OrderingFreight checkAddCargo() {
        addCargo.shouldBe(visible);
        return this;
    }

    public OrderingFreight selectTransportCapacity(String value) {
        transportCapacity.selectOptionByValue(value);
        return this;
    }

    public OrderingFreight selectTransportType(String value) {
        transportType.selectOption(value);
        return this;
    }

    public OrderingFreight selectTransportLoadType(String value) {
        transportLoadType.selectOption(value);
        return this;
    }

    public OrderingFreight checkExtraEquip() {
        additionalEquip.click();
        return this;
    }

    public OrderingFreight setDesiredCost(String value) {
        desiredCost.setValue(value);
        return this;
    }

    public OrderingFreight checkDocReturn() {
        docReturn.click();
        return this;
    }

    public OrderingFreight clickSubmit() {
        submit.click();
        return this;
    }

    public OrderingFreight checkResult() {
        confirmation.shouldHave(text(SUCCESS_TEXT));
        return this;
    }

}


