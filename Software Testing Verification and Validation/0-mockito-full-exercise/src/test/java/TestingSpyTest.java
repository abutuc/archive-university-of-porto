import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TestingSpyTest {

    @Spy
    private List<String> list;

    @Test
    public void ensureToLearnAboutSpy() {

        doReturn("XPTO").when(list).get(10000000);

        assertEquals("XPTO", list.get(10000000));

        verify(list, times(1)).get(10000000);
    }
}
