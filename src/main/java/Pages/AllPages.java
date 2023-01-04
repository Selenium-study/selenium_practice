package Pages;

public class AllPages {
    public AllPages(){}

    private HomePage homePage;
    private MyAccount myAccount;
    private MyAccount_LoginPage myAccount_loginPage;
    private MyAccount_RegistrationPage myAccount_registrationPage;
    private ShopPage shopPage;

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public MyAccount myAccount() {
        if (myAccount == null) {
            myAccount = new MyAccount();
        }
        return myAccount;
    }

    public MyAccount_LoginPage myAccount_loginPage() {
        if (myAccount_loginPage == null) {
            myAccount_loginPage = new MyAccount_LoginPage();
        }
        return myAccount_loginPage;
    }

    public MyAccount_RegistrationPage myAccount_registrationPage() {
        if (myAccount_registrationPage == null) {
            myAccount_registrationPage = new MyAccount_RegistrationPage();
        }
        return myAccount_registrationPage;
    }

    public ShopPage shopPage() {
        if (shopPage == null) {
            shopPage = new ShopPage();
        }
        return shopPage;
    }




}
