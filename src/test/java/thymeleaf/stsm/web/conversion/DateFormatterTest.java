package thymeleaf.stsm.web.conversion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.context.MessageSource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class DateFormatterTest {

	@Mock
    private MessageSource messageSource;

	@InjectMocks
    private DateFormatter dateFormatter;
    
    private final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @BeforeEach
    void setUp() {
    	MockitoAnnotations.openMocks(this);

        // Configurar el mock para devolver el patrón de fecha esperado
        Mockito.when(messageSource.getMessage(Mockito.eq("date.format"), Mockito.any(), Mockito.any(Locale.class)))
                .thenReturn("yyyy-MM-dd");
    }

    @Test
    @DisplayName("Debe parsear una fecha correctamente")
    void testParse() throws ParseException {
        String dateStr = "2024-05-01";
        Date date = dateFormatter.parse(dateStr, Locale.getDefault());
        assertEquals(sdf.parse(dateStr), date);
    }

    @Test
    @DisplayName("Debe formatear una fecha correctamente")
    void testPrint() throws ParseException {
        Date date = sdf.parse("2024-05-01");
        String formatted = dateFormatter.print(date, Locale.getDefault());
        assertEquals("2024-05-01", formatted);
    }
}
