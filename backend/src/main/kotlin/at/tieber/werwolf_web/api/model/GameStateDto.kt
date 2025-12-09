package at.tieber.werwolf_web.api.model

import at.tieber.werwolf_web.logic.Player
import at.tieber.werwolf_web.logic.Role

class GameStateDto(val players: List<Player>, val allMainRoles: List<Role>, val allBonusRoles: List<Role>) {
}
