package test.cache

class BootStrap {

    def init = { servletContext ->

        new TestDomain(title: '1').save(failOnError:true)
        println "SAVED"
    }
    def destroy = {
    }
}
