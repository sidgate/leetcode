package kata.tennis

import kata.tennis.State.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TennisTest {
    private val player1 = Player("Player1")
    private val player2 = Player("Player2")

    @Test fun `increment player point`(){

        val state = MiddleGameState(player1, player2)

        val newState = state.play(player1)

        assertTrue(newState is MiddleGameState)
        assertEquals(Score(PlayerPoints(player1, 1), PlayerPoints(player2)), newState.score)
    }

    @Test fun `player wins after 5 wins`(){

        val state = MiddleGameState(player1, player2)

        val newState = (0..4).fold(state as State){ st, _ ->
            st.play(player1)
        }

        assertEquals( player1, (newState as FinishedState).winner)
    }

    @Test fun deuce(){

        val state = MiddleGameState(player1, player2)

        val newState = (0..4).fold(state as State){ st, _ ->
            val st1 = st.play(player1)
            st1.play(player2)
        }

        assertTrue(newState is DeuceState)
    }
}

