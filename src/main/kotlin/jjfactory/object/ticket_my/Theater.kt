package jjfactory.`object`.ticket_my

class Theater(
    private val ticketSeller: TicketSeller
) {

    fun enter(audience: Audience) {
        val ticket = ticketSeller.getTicket()

        if (!audience.hasInvitation()) {
            audience.decreaseAmount(amount = ticket.fee)
            ticketSeller.increaseAmount(amount = ticket.fee)
        }

        audience.setTicket(ticket)
    }
}