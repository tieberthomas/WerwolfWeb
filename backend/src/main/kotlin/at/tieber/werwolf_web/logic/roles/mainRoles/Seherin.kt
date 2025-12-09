package at.tieber.werwolf_web.logic.roles.mainRoles

import at.tieber.werwolf_web.logic.roles.Fraktion
import at.tieber.werwolf_web.logic.roles.MainRole

class Seherin : MainRole() {

    override fun getName(): String {
        return "Seherin"
    }

    override fun getFraktion(): Fraktion {
        return Fraktion.BUERGER
    }

}
