package jjfactory.`object`.ticket_start

class Bag_Init(
    var amount: Long,
    val invitation: Invitation_Init?,
    var ticket: Ticket_Init?
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