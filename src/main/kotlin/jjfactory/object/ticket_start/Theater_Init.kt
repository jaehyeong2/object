package jjfactory.`object`.ticket_start

class Theater_Init(
    private val ticketSeller: TicketSeller_Init
) {

    fun enter(audience: Audience_Init){
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