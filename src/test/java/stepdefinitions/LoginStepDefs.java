package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class LoginStepDefs {
    LoginPage loginPage=new LoginPage();

    @Then("kullanıcının Login to your account yazisinin gorunur oldugunu test eder")
    public void kullanıcının_login_to_your_account_yazisinin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(loginPage.loginYourAccountText.isDisplayed());
    }
    @Then("kullanıcı dogru email ve sifreyi girer")
    public void kullanıcı_dogru_email_ve_sifreyi_girer(DataTable credentials) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        List<String> loginCredentials = credentials.row(1);//// datatable row lari 1 den basalar
        // datatable in credential lari  bir nevi  sifirinci satirdadir diyebiliriz..
        // data table daki 1. satir daki ilk eleman 0. index gibi alinir.. yanindaki de 1. idexdir..
        // feature dosyasinda hangi methoda aitse data table daki datalari cagirmak icin bu sekilde kullanim mevcuttur
        loginPage.loginemailElement.sendKeys(loginCredentials.get(0));
        loginPage.loginPasswordBox.sendKeys(loginCredentials.get(1));


    }
    @Then("kullanıcı login butonuna tıklar")
    public void kullanıcı_login_butonuna_tıklar() {
        loginPage.loginButton.click();

    }
    @Then("kullanıcı oturum actıgını test eder\\(Logged in as username)")
    public void kullanıcı_oturum_actıgını_test_eder_logged_in_as_username() {
        Assert.assertTrue(loginPage.loginYourAccountText.isDisplayed());
    }
    @Then("kullanıcı logout butonuna basar")
    public void kullanıcı_logout_butonuna_basar() {
        loginPage.logoutButton.click();
    }

    @Then("kullanıcı dogru email {string} ve sifreyi {string} girer")
    public void kullanıcıDogruEmailVeSifreyiGirer(String email, String psw) {
        loginPage.loginemailElement.sendKeys(email);
        loginPage.loginPasswordBox.sendKeys(psw);
    }


    @Then("kullanıcı dogru email ve sifreyi excel ile girer")
    public void kullanıcıDogruEmailVeSifreyiExcelIleGirer() {
        String path="src/test/testData/testData.xlsx";
        String sheetName= "Sayfa1";
        ExcelUtil excel = new ExcelUtil(path,sheetName );

        List<Map<String, String>> loginData = excel.getDataList();

        loginPage.loginemailElement.sendKeys(loginData.get(0).get("Email"));
        loginPage.loginPasswordBox.sendKeys(loginData.get(0).get("Password"));

    }

    @Then("kullanıcı yanlis email ve sifreyi excel ile girer")
    public void kullanıcı_yanlis_email_ve_sifreyi_excel_ile_girer() {
        String path="src/test/testData/testData.xlsx";
        String sheetName= "Sayfa1";
        ExcelUtil excel = new ExcelUtil(path,sheetName );

        List<Map<String, String>> loginData = excel.getDataList();

        loginPage.loginemailElement.sendKeys(loginData.get(1).get("Email"));
        loginPage.loginPasswordBox.sendKeys(loginData.get(1).get("Password"));

    }
    @Then("kullanıcı Your email or password is incorrect! yazisinin goruldugunu test eder")
    public void kullanıcı_your_email_or_password_is_incorrect_yazisinin_goruldugunu_test_eder() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
