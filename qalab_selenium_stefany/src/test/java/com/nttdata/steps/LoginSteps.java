package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchDetailsScreen;
import com.nttdata.screens.SearchScreen;
import net.thucydides.core.annotations.Step;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginSteps {
    LoginScreen loginScreen;
    SearchScreen searchScreen;
    SearchDetailsScreen searchDetailsScreen;

    //constructor
    public LoginSteps(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Escribir el usuario
     * @param user el usuario
     */
    public void typeUser(String user){
        WebElement userInputElement = driver.findElement(LoginPage.userInput);
        userInputElement.sendKeys(user);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginPage.loginButton));


    }

    /**
     * Escribir el password
     * @param password el password del usuario
     */
    public void typePassword(String password){

        this.driver.findElement(LoginPage.passInput).sendKeys(password);
    }

    /**
     * Hacer click en el botón login
     */
    public void login(){

        this.driver.findElement(LoginPage.loginButton).click();
    }

    @Step("Click en cerrar")
    public void clickClose(){
        loginScreen.clickClose();
    }

}
