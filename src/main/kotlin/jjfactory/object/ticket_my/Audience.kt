package jjfactory.`object`.ticket_my

class Audience(
    val name: String,
    var bag: Bag
) {

    fun hasInvitation(): Boolean {
        return bag.hasInvitation()
    }

    fun setTicket(ticket: Ticket) {
        bag.setTicket(ticket)
    }

    fun decreaseAmount(amount: Long){
        bag.decreaseAmount(amount)
    }
}