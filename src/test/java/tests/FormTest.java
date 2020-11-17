package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormTest {
    @Test
    void testForm() {
        String firstName = "Константин",
               lastName = "Ляличев",
               email = "smithjohn6387@gmail.com",
               gender ="",
               mobile ="1234567890",
               dateOfBirth = "",
               subjects ="",
               hobbies ="",
               picture = "",
               currentAddress = "",








        open("https://demoqa.com/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
    }
}
