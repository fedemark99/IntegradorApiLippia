package ar.steps;

import api.model.IntegradorApi.IntegradorAddTimeResponse;
import ar.validator.IntegradorValidator;
import com.crowdar.api.rest.APIManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.jsoup.Connection;
import services.BaseService;

public class IntegradorUpdateTimeSteps {


    @And("un nuevo horario de comienzo (.*)")
    public void unNuevoHorarioDeComienzoStartTime(String start) {
        BaseService.START_HOURS.set(start);
    }

    @And("un nuevo horario de finalizacion (.*)")
    public void unNuevoHorarioDeFinalizacionEndTime(String end) {
        BaseService.END_HOURS.set(end);
    }

    @Then("Obtengo el nombre de las horas modificadas al proyecto (.*)")
    public void obtengoElNombreDeLasHorasModificadasAlProyectoName(String name) {
        IntegradorValidator.validateNameProjectModified(name);
    }

    @And("un id de la Hora editada")
    public void unIdDeLaHoraEditadaHour() {
       //BaseService.ID_EDIT_HOURS.set("61847df3856abd29fef73600");

    }
}
