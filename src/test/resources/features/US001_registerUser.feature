@register
Feature: Register_User_Functionality


  Scenario: TC01_register_user (ilk kayit)
    When kullanıcı tarayıcıyı baslatır
    Then kullanıcı anasayfaya gider
    Then ana sayfanın gorunur oldugunu test eder
    Then kullanıcı signup-login butonuna tıklar
    And kullanıcı, New User Signup! in gorunur oldugunu test eder

  Scenario: TC02_signup_user (kayitli kullanici)
    When kullanici olarak isim ve maili gider
    Then signup butonuna tıklar
    Then acilan sayfada ENTER ACCOUNT INFORMATION yazisini gorunur oldugunu test eder
    Then kullanıcı ayrintilari (birinci bolum) doldurur
    Then kullanici Sign Up for our newsletter! checkbox ini siler
    Then kullanıcı ayrintilari (ikinci bolum) doldurur
    Then kullanıcı Create Account butonuna tıklar
    Then kullanıcı hesabın olustugunu dogrular



  Scenario: TC03_delete_account (hesap silme)