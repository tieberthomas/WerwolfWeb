package at.tieber.werwolf_web.logic.roles.bonusRoles

import at.tieber.werwolf_web.logic.roles.RoleType
import at.tieber.werwolf_web.logic.roles.BonusRole

class Schatten : BonusRole() {

    override fun getName(): String {
        return "Schatten"
    }

    override fun getRoleType(): RoleType {
        return RoleType.PASSIV
    }


}