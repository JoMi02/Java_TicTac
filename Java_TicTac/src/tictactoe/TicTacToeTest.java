package tictactoe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TicTacToeTest {
    public TicTacToeMain igrica = new TicTacToeMain();
    @Before
    public void ZapocniIgru () {
        igrica.play();
    }

    @Test
    public void Poraz () {
        igrica.buttons [0][0].doClick();
        igrica.buttons [0][1].doClick();
        igrica.buttons [2][1].doClick();
        Assert.assertEquals("Sorry, You Lose!", igrica.getStatus());

    }

    @Test
    public void Nereseno() {
        igrica.buttons[1][1].doClick();
        igrica.buttons[2][0].doClick();
        igrica.buttons[0][1].doClick();
        igrica.buttons[1][2].doClick();
        igrica.buttons[2][2].doClick();
        Assert.assertEquals("Draw, Click 'Play' For Rematch!", igrica.getStatus());

    }
    @Test
    public void Pobeda () {
        igrica.buttons [1][1].doClick();
        igrica.buttons [2][2].doClick();
        igrica.buttons [0][2].doClick();
        igrica.buttons [1][2].doClick();
        Assert.assertEquals("Congratulations, You've Won!", igrica.getStatus());
    }
    @Test
    public void SledeciPodez() {
        igrica.buttons [1][1].doClick();
        Assert.assertEquals("Your Turn", igrica.getStatus());
    }
    @Test
    public void TiSiNaPotezu() {
        Assert.assertEquals("Your Turn", igrica.getStatus());
    }



}
