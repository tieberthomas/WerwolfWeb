package at.tieber.werwolf_web.logic.roles.mainRoles

import at.tieber.werwolf_web.logic.roles.Fraktion
import at.tieber.werwolf_web.logic.roles.MainRole

class Werwolf : MainRole() {

    override fun getName(): String {
        return "Werwolf"
    }

    override fun getFraktion(): Fraktion {
        return Fraktion.WERWOLF
    }

}
