package stevef.wb

import grails.rest.*

@Resource(uri='/games')
class Games {

    String name
    Float score
    String level
    Integer wins
    Integer losses

    static constraints = {
    }
}
