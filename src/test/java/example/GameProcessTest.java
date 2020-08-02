package example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GameProcessTest {

    GameProcess gameProcess;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private String systemOut() {
        return outContent.toString();
    }

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void should_return_succeed_when_get_game_status_given_4A0B() {
        //given
        gameProcess = new GameProcess();

        //when
        gameProcess.getGameStatus("4A0B");

        //then
        assertEquals("Succeed",systemOut());
    }

    @Test
    void should_return_in_process_when_get_game_status_given_wrong_input() {
        //given
        gameProcess = new GameProcess();

        //when
        gameProcess.getGameStatus("wronginput");

        //then
        assertEquals("In-process",systemOut());
    }
}
