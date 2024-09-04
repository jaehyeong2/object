package jjfactory.`object`.ticket_start

class TicketOffice_Init(
    private var amount: Long,
    private val tickets: MutableList<Ticket_Init> = mutableListOf()
) {

    fun getTicket(): Ticket_Init {
        return tickets.removeAt(0)
    }

    fun increaseAmount(amount: Long){
        this.amount  += amount
    }

    fun decreaseAmount(amount: Long){
        this.amount  -= amount
    }
}