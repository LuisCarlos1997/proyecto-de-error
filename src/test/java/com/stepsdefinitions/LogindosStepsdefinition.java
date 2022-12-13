package com.stepsdefinitions;

import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class LogindosStepsdefinition {

    @Managed
    WebDriver hisdriver;

    @Before
    public void before() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Luis");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisdriver));
    }

    @Given("^Luis open th pages$")
    public void luisOpenThPages() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("www.google.com"));


    }
}
