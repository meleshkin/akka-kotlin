import akka.actor.Props
import akka.testkit.javadsl.TestKit
import org.junit.Test
import kotlin.test.assertEquals

class HelloKotlinActorTest : AbstractActorTest() {

    @Test
    fun testTell() {
        val probe = TestKit(system)
        val actor = system.actorOf(Props.create(HelloKotlinActor.props))
        actor.tell("Hello", probe.ref)
        val result = probe.expectMsgClass(String::class.java)
        assertEquals(HelloKotlinActor.response, result)
    }
}
