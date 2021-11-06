package ar.validator;

import api.model.IntegradorApi.IntegradorAddTimeResponse;
import api.model.IntegradorApi.IntegradorGetTimeEntries;
import api.model.IntegradorApi.IntegradorUpdateTimeResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class IntegradorValidator {


    public static void validateNotNull(){
        IntegradorGetTimeEntries[] response = (IntegradorGetTimeEntries[]) APIManager.getLastResponse().getResponse();
        for (IntegradorGetTimeEntries res:response) {
            Assert.assertNotNull(res.getId(),"El campo ID es nulo");
        }
    }

    public static void validateNameProject(String name){
        IntegradorAddTimeResponse response = (IntegradorAddTimeResponse) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(response.getDescription(),name,"No se encontro una descripcion de nuevas Horas agregadas");

    }

    public static void validateNameProjectModified(String name){
        IntegradorUpdateTimeResponse response = (IntegradorUpdateTimeResponse) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(response.getDescription(),name,"No se encontro una descripcion de Horas modificadas");

    }
}
