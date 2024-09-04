package jjfactory.`object`.ticket_my

class Audience(
    val name: String,
    private var bag: Bag
) {

    private fun hasInvitation(): Boolean {
        return bag.hasInvitation()
    }

    private fun setTicket(ticket: Ticket) {
        bag.setTicket(ticket)
    }

    private fun decreaseAmount(amount: Long){
        bag.decreaseAmount(amount)
    }

    fun buy(ticket: Ticket): Long {
        return if (hasInvitation()){
            setTicket(ticket)
            0L
        }else {
            decreaseAmount(ticket.fee)
            ticket.fee
        }
    }
}