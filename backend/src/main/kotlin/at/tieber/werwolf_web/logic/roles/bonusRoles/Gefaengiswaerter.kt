package at.tieber.werwolf_web.logic.roles.bonusRoles

import at.tieber.werwolf_web.logic.roles.BonusRole
import at.tieber.werwolf_web.logic.roles.RoleType

class Gefaengiswaerter : BonusRole() {

    override fun getName(): String {
        return "Gefaengiswaerter"
    }

    override fun getRoleType(): RoleType {
        return RoleType.AKTIV
    }


}
