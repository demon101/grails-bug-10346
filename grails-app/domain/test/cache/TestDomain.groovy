package test.cache

class TestDomain {

    String title

    static constraints = {
    }

    static mapping = {
        cache 'nonstrict-read-write'
    }
}
