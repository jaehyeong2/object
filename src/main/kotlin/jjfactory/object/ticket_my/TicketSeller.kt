package jjfactory.`object`.ticket_my

class TicketSeller(
    private val ticketOffice: TicketOffice
) {
    fun sellTo(audience: Audience){
        ticketOffice.increaseAmount(
            amount = audience.buy(ticket = ticketOffice.getTicket())
        )
    }
}