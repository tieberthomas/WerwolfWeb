package at.tieber.werwolf_web.logic

import at.tieber.werwolf_web.logic.roles.Role

class GameState(val players: List<Player>, val allMainRoles: List<Role>, val allBonusRoles: List<Role>) {
}
