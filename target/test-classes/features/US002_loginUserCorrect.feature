@login
Feature: Login_user_correct

  Scenario: TC04_Login_User_With_Correct_email_and_password
            (Dogru e-posta ve sifre ile kullanici oturum acma)
    When kullanıcı tarayıcıyı baslatır
    Then kullanıcı anasayfaya gider
    Then ana sayfanın gorunur oldugunu test eder
    Then kullanıcı signup-login butonuna tıklar
    Then kullanıcının Login to your account yazisinin gorunur oldugunu test eder
    Then kullanıcı dogru email ve sifreyi girer
          |email|passwords|
          |batch44team08@gmail.com|123456|
    Then kullanıcı login butonuna tıklar
    Then kullanıcı oturum actıgını test eder(Logged in as username)
    Then kullanıcı logout butonuna basar
