package thymeleaf.stsm.business.services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import thymeleaf.stsm.business.entities.Variety;
import thymeleaf.stsm.business.entities.repositories.VarietyRepository;

@ExtendWith(MockitoExtension.class)
class VarietyServiceTest {

    @Mock
    private VarietyRepository varietyRepository;

    @InjectMocks
    private VarietyService varietyService;

    private Variety variety;

    @BeforeEach
    void setUp() {
        variety = new Variety();
        variety.setId(1);
    }

    @Test
    @DisplayName("Debe devolver todas las variedades")
    void testFindAll() {
        when(varietyRepository.findAll()).thenReturn(Collections.singletonList(variety));

        assertEquals(1, varietyService.findAll().size());
        verify(varietyRepository, times(1)).findAll();
    }

    @Test
    @DisplayName("Debe encontrar una variedad por su ID")
    void testFindById() {
        when(varietyRepository.findById(1)).thenReturn(variety);

        Variety result = varietyService.findById(1);

        assertEquals(1, result.getId());
        verify(varietyRepository, times(1)).findById(1);
    }

    @Test
    @DisplayName("Debe devolver vacío si no existe el ID")
    void testFindByIdNotFound() {
        when(varietyRepository.findById(2)).thenReturn(null);

        Variety result = varietyService.findById(2);

        assertNull(result);
        verify(varietyRepository, times(1)).findById(2);
    }
}
