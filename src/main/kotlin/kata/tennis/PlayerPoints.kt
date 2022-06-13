package kata.tennis

data class PlayerPoints(val player: Player, val pointWins: Int = 0): Comparable<PlayerPoints>{
    override fun compareTo(other: PlayerPoints): Int = pointWins - other.pointWins
    operator fun minus(other: PlayerPoints): Int = pointWins - other.pointWins
    operator fun inc() = PlayerPoints(player, pointWins + 1)

}