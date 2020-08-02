package example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GameProcessTest {

    private GameProcess gameProcess;
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
        assertEquals("Succeed\n",systemOut());
    }

    @Test
    void should_return_in_process_when_get_game_status_given_wrong_input() {
        //given
        gameProcess = new GameProcess();

        //when
        gameProcess.getGameStatus("wronginput");

        //then
        assertEquals("In-process\n",systemOut());
    }

    @Test
    void should_return_failed_when_get_game_status_given_failed() {
        //given
        gameProcess = new GameProcess();

        //when
        gameProcess.getGameStatus("failed");

        //then
        assertEquals("Failed\n",systemOut());
    }
}
