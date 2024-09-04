package jjfactory.`object`.ticket_my

class Bag(
    var amount: Long,
    val invitation: Invitation?,
    private var ticket: Ticket?
) {

    fun hasInvitation(): Boolean {
        return invitation != null
    }

    fun hasTicket(): Boolean {
        return ticket != null
    }

    fun increaseAmount(amount: Long){
        this.amount  += amount
    }

    fun decreaseAmount(amount: Long){
        this.amount  -= amount
    }

    fun setTicket(ticket: Ticket){
        this.ticket = ticket
    }
}