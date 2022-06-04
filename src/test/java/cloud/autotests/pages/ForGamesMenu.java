package cloud.autotests.pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class ForGamesMenu {
public static void openFullGamesMenu () {
    step("Открытие раздела меню. Детальаня форма", () ->
        $(".menu__container").$(".menu-main").$(".js-menu-link").click());
}
    public static void checkFullGamesMenu () {
    step("Проверка, что вошли в детальную форму Все игры", () -> {
        $("#catalogHeader").$(".catalog__page-header")
                .shouldHave(Condition.text("Игры для ПК / Все игры"));
    });
    }

public static void newGamesMenu () {
    step("Открыть раздел Новые игры", () -> {
    $(".menu__container").$(".menu-main").$(".js-menu-link").hover();
    $(".menu-store__submenu")
            .$(".menu-submenu-link--featured[hook-test='storeMenunew-releasesButton']").click();
    });

}
    public static void checkNewGamesMenu () {
        step("Проверка, что вошли в раздел Новые игры", () ->
                $("#catalogHeader").shouldHave(Condition.text("Новые игры"))
        );
    }

    public static void adventuresShortMenu () {
    step("Раскрыть всплываеющее меню раздела ПРиключения при наведении курсора", () -> {
                $(".menu__container").$(".menu-main").$(".js-menu-link").hover();
                $(".menu-store__submenu").$(".menu-section-layer").sibling(7).hover();
            });
    }
    public static void checkAdventuresShortMenu () {
    step("Проверка, что появилось всплывающее меню подраздела Приключения", ()->
            $(".menu-section-layer--adventure").shouldHave(Condition.text("приключения")));
    }

}

