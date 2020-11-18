package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormTest {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }


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
               currentAddress = "улица Пушкина, дом Колотушкина",
               state = "",
               city = "";


        open("https://demoqa.com/automation-practice-form");

        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        $("#firstName").val(firstName);
        $("#lastName").val(lastName);
        $("#userEmail").val(email);
        $("#genterWrapper").$(byText("Other")).click();
        $("#userNumber").val(mobile);

        //dateOfBirth
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("January");
        $(".react-datepicker__year-select").selectOption("1994");
        $(".react-datepicker__day--005").click();


        //subject
        //$("#subjectsContainer").click();
        $("#subjectsInput").val("e");
        $(".subjects-auto-complete__menu-list").$(byText("Computer Science")).click();

    }
}
