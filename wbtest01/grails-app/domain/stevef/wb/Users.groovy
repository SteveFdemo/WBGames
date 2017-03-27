package stevef.wb

import grails.rest.*

@Resource(uri='/users')
class Users {

    String name
    String email
    boolean active
    List<UserGames> games
    List<UserAchievements> achievements

    static mapping = {
    }

    static constraints = {
        email(blank: true)
    }
}
