package com.app.application.session;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.app.domain.entities.employee.EmployeeEntity;

class UserSessionTest {

    @Test
    void startSession_SetsUserSessionInstance() {
        EmployeeEntity fakeEmployee = new EmployeeEntity(
            "John Doe",
            "john\\@example.com",
            "Tester",
            "12345678900",
            EmployeeEntity.ROLE.TECNICO,
            new java.util.Date(),
            true
        );
        UserSession.startSesion(fakeEmployee);

        assertNotNull(UserSession.getInstance(), "A instância não deve ser nula após iniciar a sessão");
        assertEquals(
            fakeEmployee,
            UserSession.getInstance().getEmployee(),
            "O funcionário da sessão deve ser o mesmo que foi passado"
        );
    }

    @Test
    void closeSession_ResetsUserSessionInstance() {
        UserSession.closeSession();
        assertNull(UserSession.getInstance(), "Instance should be null after closing session");
    }
}
