package kata.tennis

sealed class State(val score: Score) {
    abstract fun play(pointWinner: Player): State

    class MiddleGameState(score: Score) : State(score) {

        constructor(player1: Player, player2: Player): this(Score(PlayerPoints(player1), PlayerPoints(player2)))

        override fun play(pointWinner: Player): State {
            val newScore = score.newScore(pointWinner)

            return with(newScore) {
                when {
                    playerPoints1.pointWins == playerPoints2.pointWins && playerPoints1.pointWins >= 4 -> DeuceState(this)
                    playerPoints1.pointWins > 4 && playerPoints1 - playerPoints2 > 1 -> FinishedState(playerPoints1.player, this)
                    playerPoints2.pointWins > 4 && playerPoints2 - playerPoints1 > 1 -> FinishedState(playerPoints2.player, this)
                    else -> MiddleGameState(this)
                }
            }
        }
    }

    class DeuceState(score: Score) : State(score) {
        override fun play(pointWinner: Player): State {
            return AdvantageState(pointWinner, score.newScore(pointWinner))
        }
    }

    class AdvantageState(private val adPlayer: Player, score: Score): State(score) {
        override fun play(pointWinner: Player): State {
            val newScore = score.newScore(pointWinner)

            return if (adPlayer == pointWinner) FinishedState(adPlayer, newScore) else DeuceState(newScore)
        }
    }

    class FinishedState(val winner: Player, score: Score): State(score) {
        override fun play(pointWinner: Player): State {
            throw RuntimeException("Game already finished")
        }
    }
}