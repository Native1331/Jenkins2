package tests.demoqa;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Configuration.baseUrl;

import static com.codeborne.selenide.Selenide.*;


@Tag("demoqa")
public class RegistrationFormTests extends tests.demoqa.TestBase {
        @Test
        @DisplayName("Successful  test")
        void shouldFindSelenide() {
            open(baseUrl);
            //ввести в поле поиска selenide и нажать Enter
            $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
            sleep(5000);
            //нажать на линк от первого результата поиска
            $$("ul.repo-list li").first().$("a").click();
            //проверка:
            $("h2").shouldHave(Condition.text("selenide / selenide"));
        }
    }



