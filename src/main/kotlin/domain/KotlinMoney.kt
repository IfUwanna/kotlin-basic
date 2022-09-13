package domain

/**
 * Created by jihun.park@navercorp.com on 2022-09-13.
 */
data class KotlinMoney(
    val amount:Long
) {
    operator fun plus(other: KotlinMoney):KotlinMoney{
        return KotlinMoney(this.amount + other.amount)
    }

}