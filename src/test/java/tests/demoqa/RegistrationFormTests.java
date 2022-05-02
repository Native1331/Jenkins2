package tests.demoqa;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Tag("demoqa")
public class RegistrationFormTests extends tests.demoqa.TestBase {
        @Test
        @DisplayName("Successful  test")
        void shouldFindSelenide() {
            //открыть страницу github.com
            open("https://github.com");
            //ввести в поле поиска selenide и нажать Enter
            $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
            sleep(5000);
            //нажать на линк от первого результата поиска
            $$("ul.repo-list li").first().$("a").click();
            //проверка:
            $("h2").shouldHave(Condition.text("selenide / selenide"));
        }
    }



