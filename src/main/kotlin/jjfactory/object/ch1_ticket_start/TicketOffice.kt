package jjfactory.`object`.ch1_ticket_start

class TicketOffice(
    private var amount: Long,
    private val tickets: MutableList<Ticket> = mutableListOf()
) {

    fun getTicket(): Ticket {
        return tickets.removeAt(0)
    }

    fun increaseAmount(amount: Long){
        this.amount  += amount
    }

    fun decreaseAmount(amount: Long){
        this.amount  -= amount
    }
}