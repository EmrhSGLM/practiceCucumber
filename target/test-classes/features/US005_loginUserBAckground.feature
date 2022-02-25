Feature: Login_user_With_Excel

  Background: siteye giris kismi
    When kullanıcı tarayıcıyı baslatır
    Then kullanıcı anasayfaya gider
    Then ana sayfanın gorunur oldugunu test eder
    Then kullanıcı signup-login butonuna tıklar
    Then kullanıcının Login to your account yazisinin gorunur oldugunu test eder

  Scenario: TC06_Login_User_With_Correct_email_and_password_with_Excel
    Then kullanıcı dogru email ve sifreyi excel ile girer
    Then kullanıcı login butonuna tıklar
    Then kullanıcı oturum actıgını test eder(Logged in as username)
    Then kullanıcı logout butonuna basar


  Scenario: TC06_Login_User_With_Wrong_email_and_password_with_Excel
  (Excel kullanarak yanlis e-posta ve sifre ile kullanici oturum acamaz)

    Then kullanıcı yanlis email ve sifreyi excel ile girer
    Then kullanıcı login butonuna tıklar
    Then kullanıcı Your email or password is incorrect! yazisinin goruldugunu test eder