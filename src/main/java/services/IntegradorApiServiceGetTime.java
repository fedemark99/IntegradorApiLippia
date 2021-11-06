package services;

import api.model.IntegradorApi.IntegradorAddTimeResponse;
import api.model.IntegradorApi.IntegradorGetTimeEntries;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;


public class IntegradorApiServiceGetTime extends BaseService{

    public static Response get(String jsonName) {
        return get(jsonName, IntegradorGetTimeEntries[].class,setParams());
    }

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key-integrador",API_KEY_INTEGRADOR.get());
        params.put("id-workspace",ID_WORKSPACE_INTEGRADOR.get());
        params.put("id-user",ID_USER_INTEGRADOR.get());
        return params;
    }


}
