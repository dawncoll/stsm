package thymeleaf.stsm.web.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import thymeleaf.stsm.business.services.SeedStarterService;
import thymeleaf.stsm.business.services.VarietyService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(SeedStarterMngController.class)
class SeedStarterMngControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private VarietyService varietyService; 
    
    @MockitoBean
    private SeedStarterService seedStarterService;


    @Test
    @DisplayName("Debe cargar la página de seed starters correctamente")
    void testShowSeedstarters() throws Exception {
        mockMvc.perform(get("/seedstartermng"))
                .andExpect(status().isOk())
                .andExpect(view().name("seedstartermng"));
    }
}

