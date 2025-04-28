package thymeleaf.stsm.business.entities.repositories;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import thymeleaf.stsm.business.entities.Variety;

import java.util.List;

class VarietyRepositoryTest {

    private VarietyRepository varietyRepository;

    @BeforeEach
    void setUp() {
        varietyRepository = new VarietyRepository();
    }

    @Test
    @DisplayName("Constructor debe inicializar variedades")
    void testConstructorInitializesVarieties() {
        List<Variety> varieties = varietyRepository.findAll();
        assertNotNull(varieties, "La lista no debe ser nula");
        assertFalse(varieties.isEmpty(), "La lista no debe estar vacía tras la construcción");
    }

    @Test
    @DisplayName("findAll() debe devolver todas las variedades inicializadas")
    void testFindAll() {
        List<Variety> varieties = varietyRepository.findAll();
        assertNotNull(varieties);
        assertTrue(varieties.size() > 0, "Debería haber al menos una variedad inicializada");
    }

    @Test
    @DisplayName("findById() debe encontrar variedad existente")
    void testFindByIdExists() {
        // Asumimos que en la inicialización hay un ID 1, adaptarlo si es otro
        Variety result = varietyRepository.findById(1);

        assertEquals(1, result.getId(), "Debería encontrar una variedad con ID 1");
     
    }

    @Test
    @DisplayName("findById() debe devolver vacío para un ID inexistente")
    void testFindByIdNotExists() {
        Variety result = varietyRepository.findById(9999); // ID que seguro no existe

        assertNull(result, "No debería encontrar ninguna variedad con un ID inexistente");
    }
}
