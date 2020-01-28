import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before() {
        printer = new Printer(250, 180);
    }

    @Test
    public void canCheckPaperCount() {
        assertEquals(250, printer.paperCount());
    }

    @Test
    public void canCheckTonerVolume() {
        assertEquals(20, printer.tonerCount());
    }

    @Test
    public void canPrintPagesAndCopiesAndReduceTonerVolume() {
        assertEquals(94, printer.print(13, 12));
    }
}
