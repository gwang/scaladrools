/**
 * Created with IntelliJ IDEA.
 * User: gwang2
 * Date: 8/24/13
 * Time: 3:17 PM
 * To change this template use File | Settings | File Templates.
 */
package scaladrools

import org.drools._
import org.drools.io.ResourceFactory
import org.drools.runtime._
import org.drools.builder._
import scalarules.model.Temperature

object RuleRunner extends App {

  println("Creating Knowledge Session")

  val ksession = knowledgeSession("WeatherRules.drl")

  println("Creating and inserting temperature")

  val shouldBeTooHot = Temperature(100)
  val shouldBeTooCold = Temperature(20)

  ksession.insert(shouldBeTooHot)
  ksession.insert(shouldBeTooCold)

  println("Firing all rules")
  ksession.fireAllRules()

  def knowledgeSession(fileName: String) : StatefulKnowledgeSession = {
    val kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder()
    kbuilder.add(ResourceFactory.newFileResource(fileName), ResourceType.DRL)
    val kbase = KnowledgeBaseFactory.newKnowledgeBase()
    kbase.addKnowledgePackages(kbuilder.getKnowledgePackages())
    kbase.newStatefulKnowledgeSession()
  }
}


