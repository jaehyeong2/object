package jjfactory.`object`.ch1_ticket_start

class Theater(
    private val ticketSeller: TicketSeller
) {

    fun enter(audience: Audience){
        if(audience.bag.hasInvitation()){
            val ticket = ticketSeller.ticketOffice.getTicket()
            audience.bag.ticket = ticket
        }else{
            val ticket = ticketSeller.ticketOffice.getTicket()
            audience.bag.decreaseAmount(ticket.fee)
            ticketSeller.ticketOffice.increaseAmount(ticket.fee)

            audience.bag.ticket = ticket
        }
    }
}