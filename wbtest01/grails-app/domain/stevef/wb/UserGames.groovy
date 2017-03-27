package stevef.wb

import grails.rest.*

@Resource(uri='/games')
class UserGames {

    String name
    Float score
    String level
    Integer wins
    Integer losses

    static constraints = {
    }
}
