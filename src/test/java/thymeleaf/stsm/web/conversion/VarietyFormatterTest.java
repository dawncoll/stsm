package thymeleaf.stsm.web.conversion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import thymeleaf.stsm.business.entities.Variety;
import thymeleaf.stsm.business.services.VarietyService;

import static org.mockito.Mockito.*;

class VarietyFormatterTest {

	@Mock
	private VarietyService varietyService;
    
	@InjectMocks
	private VarietyFormatter varietyFormatter;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
	}
	
    @Test
    @DisplayName("Debe parsear una variedad existente")
    void testParse() throws Exception {
        Variety variety = new Variety();
        variety.setId(1);
        variety.setName("Tomate");

        when(varietyService.findById(1)).thenReturn(variety);

        Variety parsed = varietyFormatter.parse("1", null);
        assertNotNull(parsed);
        assertEquals("Tomate", parsed.getName());
    }

    @Test
    @DisplayName("Debe imprimir el id de la variedad")
    void testPrint() {
        Variety variety = new Variety();
        variety.setId(2);
        String printed = varietyFormatter.print(variety, null);
        assertEquals("2", printed);
    }
}