package stevef.wb

import grails.rest.*

@Resource(uri='/users')
class Users {

    String name
    String email
    boolean active
    List<Games> games
    List<Achievements> achievements

    static mapping = {
    }

    static constraints = {
        email(blank: true)
    }
}
