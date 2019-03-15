import akka.actor.ActorSystem
import akka.testkit.javadsl.TestKit
import org.junit.AfterClass
import org.junit.BeforeClass

abstract class AbstractActorTest {
    companion object {
        lateinit var system: ActorSystem

        @BeforeClass
        @JvmStatic
        fun setup() {
            system = ActorSystem.create()
        }

        @AfterClass
        @JvmStatic
        fun teardown() {
            TestKit.shutdownActorSystem(system)
        }
    }
}
