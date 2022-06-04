package cloud.autotests.pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class SearchPanel {
    public static void openSearchPanel() {
        step("Открыть поиск и ввести название игры", () ->
                $(".menu__container").$(".js-menu-search").click());
    }
    public static void enterSomeGameName () {
        step("Ввести название игры в поисковую панель", () -> {
            $(".menu-search-input").click();
            $(".menu-search-input__field").setValue("neverwinter nights");
        });
    }
    public static void checkTabWithTheGameName () {
        step("Проверка наличия искомой игры", () ->
                $(".menu-search__results-list").
                        shouldHave(Condition.text("neverwinter nights")));
    }
}
