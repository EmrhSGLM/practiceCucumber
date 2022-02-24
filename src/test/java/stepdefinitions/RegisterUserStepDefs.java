package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MainPageFunctionalities;
import utilities.ConfigReader;
import utilities.Driver;

public class RegisterUserStepDefs {
    MainPageFunctionalities mainPageFunctionalities= new MainPageFunctionalities();

    @When("kullanıcı tarayıcıyı baslatır")
    public void kullanıcı_tarayıcıyı_baslatır() {
        Driver.getDriver();

    }
    @Then("kullanıcı anasayfaya gider")
    public void kullanıcı_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("automation_url"));
    }
    @Then("ana sayfanın gorunur oldugunu test eder")
    public void ana_sayfanın_gorunur_oldugunu_test_eder() {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Automation Exercise", actualTitle);
    }
    @Then("kullanıcı signup-login butonuna tıklar")
    public void kullanıcı_signup_login_butonuna_tıklar() {
        mainPageFunctionalities.signupButton.click();

    }
    @Then("kullanıcı, New User Signup! in gorunur oldugunu test eder")
    public void kullanıcı_new_user_signup_in_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(mainPageFunctionalities.signupText.isDisplayed());
    }


    @When("kullanici olarak isim ve maili gider")
    public void kullaniciOlarakIsimVeMailiGider() {
        mainPageFunctionalities.nameBox.sendKeys("emrah");
        mainPageFunctionalities.emailBox.sendKeys("emrah7106@gmail.com");
    }

    @Then("signup butonuna tıklar")
    public void signupButonunaTıklar() {
        mainPageFunctionalities.accountCreatSignupButton.click();
    }
    @Then("acilan sayfada ENTER ACCOUNT INFORMATION yazisini gorunur oldugunu test eder")
    public void acilanSayfadaENTERACCOUNTINFORMATIONYazisiniGorunurOldugunuTestEder() {
        Assert.assertTrue(mainPageFunctionalities.createAccountPageVerification.isDisplayed());
    }

}
