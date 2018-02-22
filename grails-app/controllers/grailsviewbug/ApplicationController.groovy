package grailsviewbug

import grails.core.GrailsApplication
import grails.util.Environment
import grails.plugins.*

class ApplicationController implements PluginManagerAware {

    GrailsApplication grailsApplication
    GrailsPluginManager pluginManager

    def index() {
        respond new MyClass()
    }

    def method2() {
        respond new MyClass()
    }

    def method3() {
        respond new MyClass()
    }

    def method4() {
        respond new MyClass()
    }
}
