package api.config;

import services.*;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }

    },
    RESPONSE_HEADERS {
        @Override
        public Class<?> getEntityService() {
            return ResponseHeadersService.class;
        }
    },
    INTEGRADOR {
        @Override
        public Class<?> getEntityService() {
            return IntegradorApiServiceGetTime.class;
        }
    },
    INTEGRADOR_AGREGAR_HORAS {
        @Override
        public Class<?> getEntityService() {
            return IntegradorAgregarHorasService.class;
        }
    },
    INTEGRADOR_MODIFICAR_HORAS {
        @Override
        public Class<?> getEntityService() {
            return IntegradorModificarHorasService.class;
        }
    },
    INTEGRADOR_CONSULTAR_HORA {
        @Override
        public Class<?> getEntityService() {
            return IntegradorConsultarHoraService.class;
        }
    },
    INTEGRADOR_ELIMINAR_HORAS {
        @Override
        public Class<?> getEntityService() {
            return IntegradorEliminarHoraService.class;
        }
    },
    WORKSPACE {
        @Override
        public Class<?> getEntityService() {
            return WorkspaceService.class;
        }
    },
    WORKSPACE_SIN_PARAMETRO {
        @Override
        public Class<?> getEntityService() {
            return WorkspaceSinParametroService.class;
        }
    },
    WORKSPACE_ERROR {
        @Override
        public Class<?> getEntityService() {
            return WorkspaceErrorService.class;
        }
    },
    PROJECT {
        @Override
        public Class<?> getEntityService() {
            return ProjectService.class;
        }
    },
    PROJECT_MODIFICAR {
        @Override
        public Class<?> getEntityService() {
            return ProjectModificarService.class;
        }
    },
    PROJECT_ERROR {
        @Override
        public Class<?> getEntityService() {
            return ProjectErrorService.class;
        }
    },

    PROJECT1 {
        @Override
        public Class<?> getEntityService() {
            return ProjectService1.class;
        }
    };

    public abstract Class<?> getEntityService();
}
