package services;

import api.model.IntegradorApi.IntegradorUpdateTimeResponse;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;


public class IntegradorModificarHorasService extends BaseService{

    public static Response put(String jsonName) {
        return put(jsonName, IntegradorUpdateTimeResponse.class,setParams());
    }

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key-integrador",API_KEY_INTEGRADOR.get());
        params.put("id-workspace",ID_WORKSPACE_INTEGRADOR.get());
        params.put("id-project",ID_PROJECT.get());
        params.put("descripcion-Horas",NAME_HOURS.get());
        params.put("start",START_HOURS.get());
        params.put("end",END_HOURS.get());
        params.put("id-time",ID_EDIT_HOURS.get());
        return params;
    }


}
