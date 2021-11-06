package ar.steps;

import api.model.IntegradorApi.IntegradorAddTimeResponse;
import api.model.IntegradorApi.IntegradorGetTimeEntries;
import ar.validator.IntegradorValidator;
import com.crowdar.api.rest.APIManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.BaseService;

public class IntegradorSteps {

    @Given("Mi cuenta creada en clockify y mi Api-Key generada")
    public void miCuentaCreadaEnClockifyYMiApiKeyGenerada() {
        BaseService.API_KEY_INTEGRADOR.set("NTY3MDMzZDItZmJlMy00YjI3LTg2YTMtZjliMGMzNTQ3NjIz");
    }

    @And("un workspace-id valido")
    public void unWorkspaceIdValido() {
        BaseService.ID_WORKSPACE_INTEGRADOR.set("61732c98a31e1203a8a8197c");
    }

    @And("un user-id valido")
    public void unUserIdValido() {
        BaseService.ID_USER_INTEGRADOR.set("616f3ece49ce6917a9963cec");
    }

    @And("valido que los campos no sean nulos")
    public void validoQueLosCamposNoSeanNulos() {
        IntegradorValidator.validateNotNull();
    }

    @And("un id de proyecto")
    public void unIdDeProyecto() {
        BaseService.ID_PROJECT.set("61732d1b0be7933405e4d89a");
    }

    @And("^una descripcion de las horas agregadas (.*)$")
    public void unaDescripcionDeLasHorasAgregadasName(String name) {
        BaseService.NAME_HOURS.set(name);
    }


    @Then("Obtengo el nombre de las horas agregadas al proyecto (.*)")
    public void obtengoElNombreDeLasHorasAgregadasAlProyectoName(String name) {
        IntegradorValidator.validateNameProject(name);
    }

    @And("guardo el id de las horas agregadas")
    public void guardoElIdDeLasHorasAgregadas() {
        IntegradorAddTimeResponse response = (IntegradorAddTimeResponse) APIManager.getLastResponse().getResponse();
        BaseService.ID_EDIT_HOURS.set(response.getId());
    }
}
