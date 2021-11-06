package services;

import com.crowdar.api.rest.MethodsService;

public class BaseService extends MethodsService {

    public static final ThreadLocal<String> API_KEY = new ThreadLocal<String>();
    public static final ThreadLocal<String> ID_WORKSPACE = new ThreadLocal<String>();
    public static final ThreadLocal<String> NAME = new ThreadLocal<String>();

    // parte del integrador
    public static final ThreadLocal<String> API_KEY_INTEGRADOR = new ThreadLocal<String>();
    public static final ThreadLocal<String> ID_WORKSPACE_INTEGRADOR = new ThreadLocal<String>();
    public static final ThreadLocal<String> ID_USER_INTEGRADOR = new ThreadLocal<String>();
    public static final ThreadLocal<String> ID_PROJECT = new ThreadLocal<String>();
    public static final ThreadLocal<String> NAME_HOURS = new ThreadLocal<String>();

    public static final ThreadLocal<String> START_HOURS = new ThreadLocal<String>();
    public static final ThreadLocal<String> END_HOURS = new ThreadLocal<String>();
    public static final ThreadLocal<String> ID_EDIT_HOURS = new ThreadLocal<String>();
    public static final ThreadLocal<String> ID_DELETE_HOURS = new ThreadLocal<String>();


}
