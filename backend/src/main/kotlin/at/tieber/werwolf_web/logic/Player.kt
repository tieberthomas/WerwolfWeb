package at.tieber.werwolf_web.logic

import at.tieber.werwolf_web.logic.roles.BonusRole
import at.tieber.werwolf_web.logic.roles.MainRole

class Player(
    val name: String,
    var mainRole: MainRole,
    var bonusRole: BonusRole,
)
