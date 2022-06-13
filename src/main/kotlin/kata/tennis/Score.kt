package kata.tennis

data class Score(
    val playerPoints1: PlayerPoints,
    val playerPoints2: PlayerPoints
) {

    fun newScore(pointWinner: Player): Score {
        return if (pointWinner == playerPoints1.player) copy(playerPoints1 = playerPoints1.inc())
        else copy(playerPoints2 = playerPoints2.inc())
    }
}