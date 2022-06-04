package cloud.autotests.pages;

import cloud.autotests.helpers.DriverUtils;

import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class BrowserTests {
    public static void titleNameTest () {
        step("тайтл должен содержать название 'GOG.com'", () -> {
            String expectedTitle = "GOG.com";
            String actualTitle = title();
            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    public static void consoleErrorsTest () {
        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";
            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}
