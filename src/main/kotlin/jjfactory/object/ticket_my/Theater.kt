package jjfactory.`object`.ticket_my

class Theater(
    private val ticketSeller: TicketSeller
) {

    fun enter(audience: Audience) {
        ticketSeller.sellTo(audience)
    }
}