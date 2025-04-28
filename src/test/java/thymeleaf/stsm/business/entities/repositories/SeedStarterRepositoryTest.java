package thymeleaf.stsm.business.entities.repositories;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import thymeleaf.stsm.business.entities.SeedStarter;

import java.util.List;

class SeedStarterRepositoryTest {

    private SeedStarterRepository seedStarterRepository;

    @BeforeEach
    void setUp() {
        seedStarterRepository = new SeedStarterRepository();
    }

    @Test
    @DisplayName("Debe iniciar vacío y luego guardar un SeedStarter")
    void testSaveAndFindAll() {
        List<SeedStarter> initialList = seedStarterRepository.findAll();
        assertNotNull(initialList);
        assertTrue(initialList.isEmpty(), "La lista inicial debería estar vacía");

        SeedStarter seedStarter = new SeedStarter();
        seedStarterRepository.add(seedStarter);

        List<SeedStarter> updatedList = seedStarterRepository.findAll();
        assertEquals(1, updatedList.size(), "Debería haber un seed starter guardado");
        assertSame(seedStarter, updatedList.get(0), "El seed starter recuperado debe ser el mismo objeto guardado");
    }
}
