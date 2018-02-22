import grails.testing.web.controllers.ControllerUnitTest
import grailsviewbug.ApplicationController
import spock.lang.Specification

class ApplicationControllerTests extends Specification implements ControllerUnitTest<ApplicationController> {

  void "Test using json block"() {
    when:"When invoked"
    controller.index()

    then:"Custom Converter called as expected"
    response.json.duration == 3600000
    response.json.property == 'Property'
  }

  void "Test using g.render"() {
    when:"When invoked"
    controller.method2()

    then:"This should work but doesn't"
    response.json.duration == 3600000
    response.json.property == 'Property'
  }

  void "Test using g.render includes"() {
    when:"When invoked"
    controller.method3()

    then:"This should work but doesn't"
    response.json.duration == 3600000
  }

  void "Test using g.render excludes"() {
    when:"When invoked"
    controller.method4()

    then:"Custom Converter called as expected"
    response.json.duration == 3600000
    response.json.property == 'Property'
  }
}
