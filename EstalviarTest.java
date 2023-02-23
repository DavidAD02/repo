import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EstalviarTest {

    @AfterEach
    void tearDown() {
    }

    @Test
    void probaAhorrar1() {
        int preu = 5000, sou = 500;
        assertEquals(297, Estalviar.quantsDies(preu,sou));
    }

    @Test
    void probaAhorrar2() {
        int preu = 5980, sou = 542;
        assertEquals(316, Estalviar.quantsDies(preu,sou));
    }

    @Test
    void probaAhorrar3() {
        int preu = -42, sou = 1;
        assertEquals(0, Estalviar.quantsDies(preu,sou));
    }

    @Test
    void ProbaAhorrar4() {
        int preu = 5000, sou = 500;
        assertEquals(297, Estalviar.quantsDies(preu,sou));
    }
}
