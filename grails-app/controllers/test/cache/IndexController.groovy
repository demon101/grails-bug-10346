package test.cache

class IndexController {

    def index() {
        println TestDomain.get(1L)

        render "Ok"
    }
}
