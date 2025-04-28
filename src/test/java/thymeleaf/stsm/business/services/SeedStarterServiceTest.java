package thymeleaf.stsm.business.services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import thymeleaf.stsm.business.entities.SeedStarter;
import thymeleaf.stsm.business.entities.repositories.SeedStarterRepository;

@ExtendWith(MockitoExtension.class)
class SeedStarterServiceTest {

    @Mock
    private SeedStarterRepository seedStarterRepository;

    @InjectMocks
    private SeedStarterService seedStarterService;

    private SeedStarter seedStarter;

    @BeforeEach
    void setUp() {
        seedStarter = new SeedStarter();
    }

    @Test
    @DisplayName("Debe devolver todos los seed starters")
    void testFindAll() {
        when(seedStarterRepository.findAll()).thenReturn(Collections.singletonList(seedStarter));

        List<SeedStarter> result = seedStarterService.findAll();

        assertNotNull(result);
        assertEquals(1, result.size());
        verify(seedStarterRepository, times(1)).findAll();
    }

    @Test
    @DisplayName("Debe añadir un nuevo seed starter")
    void testAdd() {
        seedStarterService.add(seedStarter);

        verify(seedStarterRepository, times(1)).add(seedStarter);
    }
}
