package ar.steps;

import api.model.IntegradorApi.IntegradorGetTimeEntries;
import ar.validator.IntegradorValidator;
import com.crowdar.api.rest.APIManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import services.BaseService;
import services.IntegradorApiServiceGetTime;

public class IntegradorDeleteTimeSteps {


    @And("guardo el id de las horas del proyecto")
    public void guardoElIdDeLasHorasDelProyecto() {
        IntegradorGetTimeEntries response = (IntegradorGetTimeEntries) APIManager.getLastResponse().getResponse();
        BaseService.ID_DELETE_HOURS.set(response.getId());
    }

    @And("un id de una hora previamente creada")
    public void unIdDeUnaHoraPreviamenteCreada() {
        BaseService.ID_DELETE_HOURS.set("618564ac9e042028a1548928");
    }
}
