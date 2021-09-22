package javaTraining;

import org.testng.annotations.DataProvider;

public class DataProvider_Data {
	@DataProvider(name = "LoginScenario")
    public Object[][] getDataforLoginDifferentScenarios() {
        return new Object[][] { 
                { "admin", "", "Password cannot be empty"},
                { "", "admin123", "Username cannot be empty" }, 
                { "AdminWrong", "admin123", "Invalid credentials" },
                { "admin", "admin", "Invalid credentials" }, 
                { "admin", "admin123", "Dashboard" } };

 

    }
	
	
}
