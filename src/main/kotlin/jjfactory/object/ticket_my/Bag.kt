package jjfactory.`object`.ticket_my

class Bag(
    private var amount: Long,
    private val invitation: Invitation?,
    private var ticket: Ticket?
) {

    fun hasInvitation(): Boolean {
        return invitation != null
    }

    fun decreaseAmount(amount: Long){
        this.amount  -= amount
    }

    fun setTicket(ticket: Ticket){
        this.ticket = ticket
    }
}