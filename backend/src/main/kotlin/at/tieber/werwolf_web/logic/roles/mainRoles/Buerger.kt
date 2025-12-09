package at.tieber.werwolf_web.logic.roles.mainRoles

import at.tieber.werwolf_web.logic.roles.Fraktion
import at.tieber.werwolf_web.logic.roles.MainRole

class Buerger : MainRole() {

    override fun getName(): String {
        return "Buerger"
    }

    override fun getFraktion(): Fraktion {
        return Fraktion.BUERGER
    }

}