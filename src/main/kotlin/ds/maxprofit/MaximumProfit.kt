package ds.maxprofit

import kotlin.math.max
import kotlin.math.min


fun maxProfit(prices: IntArray): Int {
    var minP = prices[0]
    var profit = 0
    prices.forEach {
        minP = min(minP, it)
        profit = max(profit, it-minP)
    }
    return profit
}