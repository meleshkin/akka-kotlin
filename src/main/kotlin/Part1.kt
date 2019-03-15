import akka.actor.AbstractLoggingActor
import akka.actor.ActorRef
import akka.japi.pf.ReceiveBuilder

class HelloKotlinActor : AbstractLoggingActor() {
    companion object {
        val props = HelloKotlinActor::class.java
        val response = "Message received"
    }
    override fun createReceive() = ReceiveBuilder().match(String::class.java) {
            sender.tell(response, ActorRef.noSender())
        }.build()
}
