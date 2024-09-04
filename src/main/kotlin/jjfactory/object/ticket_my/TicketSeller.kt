package jjfactory.`object`.ticket_my

class TicketSeller(
    val ticketOffice: TicketOffice
) {

    fun getTicket(): Ticket {
        return ticketOffice.getTicket()
    }

    fun increaseAmount(amount: Long) {
        ticketOffice.increaseAmount(amount)
    }
}