package jjfactory.`object`.ch1_ticket_start

class Bag(
    var amount: Long,
    val invitation: Invitation?,
    var ticket: Ticket?
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
}