package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DeleteAccountPage;
import utilities.Driver;

public class DeleteAccountStepDefs {
    DeleteAccountPage deleteAccountPage=new DeleteAccountPage();

    @When("kullanıcı Continue butonuna tıklar")
    public void kullanıcı_continue_butonuna_tıklar() {
        deleteAccountPage.continueButton.click();
    }
    @Then("kullanıcı oturum actıgını dogrulaması gerekir\\(Logged in as username)")
    public void kullanıcı_oturum_actıgını_dogrulaması_gerekir_logged_in_as_username() {
        Assert.assertTrue(deleteAccountPage.loggedinText.isDisplayed());
    }
    @Then("kullanici Delete Account butonuna tıklar")
    public void kullanici_delete_account_butonuna_tıklar() {
        deleteAccountPage.deleteButton.click();
    }
    @Then("kullanıcı hesabin silindigini test eder")
    public void kullanıcı_hesabin_silindigini_test_eder() {
        String pageUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(pageUrl.contains("delete_account"));
    }

}
