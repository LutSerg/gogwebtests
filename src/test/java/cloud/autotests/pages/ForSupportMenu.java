package cloud.autotests.pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class ForSupportMenu {
    public static void openSupportMenu() {
        step("Раскрыть раздел Поддержка", () ->
                $(".menu-main").$(".js-menu-support").hover());    }

    public static void openOrdersAndPayments() {
        step("Перейти в раздел Заказы и оплата", () ->
                $(".js-menu-support")
                        .$("a[href*='https://support.gog.com/hc/ru/categories/201552965?product=gog']")
                        .click()
        );
    }
    public static void checkopenOrdersAndPayments () {
            step("Проверка, что зашел в раздел Заказы и оплата", () ->
                    $(".page-header").$("h1.h2")
                            .shouldHave(Condition.text("ЗАКАЗ И ОПЛАТА")));
    }

}
