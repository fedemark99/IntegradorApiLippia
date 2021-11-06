package services;

import api.model.project.ProjectResponse;
import com.crowdar.api.rest.Response;



public class ProjectService1 extends BaseService{

    public static Response post(String jsonName) {
        return post(jsonName, ProjectResponse.class);
    }


}
