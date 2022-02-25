Feature: Login_user_correct with Scenario Outline

  Scenario Outline: TC05_Login_User_With_Correct_email_and_password_used_by_Scenario_Outline
                    (Scenario_Outline kullanarak dogru e-posta ve sifre ile kullanici oturum acma)

    When kullanıcı tarayıcıyı baslatır
    Then kullanıcı anasayfaya gider
    Then ana sayfanın gorunur oldugunu test eder
    Then kullanıcı signup-login butonuna tıklar
    Then kullanıcının Login to your account yazisinin gorunur oldugunu test eder
    Then kullanıcı dogru email "<email_adress>" ve sifreyi "<password>" girer
    Then kullanıcı login butonuna tıklar
    Then kullanıcı oturum actıgını test eder(Logged in as username)
    Then kullanıcı logout butonuna basar

    Examples:
      |email_adress|password|
      |practicebatch44@gmail.com|123456|










    Examples: