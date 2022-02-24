package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FillDetailsPage;
import utilities.Driver;

public class FillDetailsStepDefs {
    FillDetailsPage fillDetailsPage =new FillDetailsPage();

    @Then("kullanıcı ayrintilari \\(birinci bolum) doldurur")
    public void kullanıcıAyrintilariBirinciBolumDoldurur() {
        fillDetailsPage.genderBox.click();
        fillDetailsPage.passwordBox.sendKeys("123456");
        Driver.selectByIndex(fillDetailsPage.dayDropdown,4);
        Driver.selectByIndex(fillDetailsPage.monthDropdown,5);
        Driver.selectByIndex(fillDetailsPage.yearDropdown,25);

    }

    @Then("kullanici Sign Up for our newsletter! checkbox ini siler")
    public void kullaniciSignUpForOurNewsletterCheckboxIniSiler() {
        fillDetailsPage.newsletterSignupBox.click();


    }

    @Then("kullanıcı ayrintilari \\(ikinci bolum) doldurur")
    public void kullanıcıAyrintilariIkinciBolumDoldurur() {
        fillDetailsPage.specialOfferBox.click();
        fillDetailsPage.firstNameBox.sendKeys("emrah");
        fillDetailsPage.lastNameBox.sendKeys(Faker.instance().name().lastName());
        fillDetailsPage.companyBox.sendKeys("abc");
        fillDetailsPage.addressBox.sendKeys(Faker.instance().address().fullAddress());
        Driver.selectByIndex(fillDetailsPage.countryDropdown,2);
        fillDetailsPage.stateBox.sendKeys(Faker.instance().address().state());
        fillDetailsPage.cityBox.sendKeys(Faker.instance().address().city());
        fillDetailsPage.zipcodeBox.sendKeys(Faker.instance().address().zipCode());
        fillDetailsPage.mobileNumberBox.sendKeys(Faker.instance().phoneNumber().cellPhone());
    }

    @Then("kullanıcı Create Account butonuna tıklar")
    public void kullanıcıCreateAccountButonunaTıklar() {
        fillDetailsPage.createAccountButton.click();
    }


    @Then("kullanıcı hesabın olustugunu dogrular")
    public void kullanıcıHesabınOlustugunuDogrular() {
        Assert.assertTrue(fillDetailsPage.accountCreatedText.isDisplayed());
    }
}
