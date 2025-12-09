package at.tieber.werwolf_web

import at.tieber.werwolf_web.logic.GameState
import at.tieber.werwolf_web.logic.GameStateService
import at.tieber.werwolf_web.logic.Player
import at.tieber.werwolf_web.logic.roles.bonusRoles.Gefaengiswaerter
import at.tieber.werwolf_web.logic.roles.bonusRoles.Schatten
import at.tieber.werwolf_web.logic.roles.mainRoles.Buerger
import at.tieber.werwolf_web.logic.roles.mainRoles.Seherin
import at.tieber.werwolf_web.logic.roles.mainRoles.Werwolf
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class HardCodedGameStateInitializer(private val gameStateService: GameStateService) : ApplicationRunner {

    override fun run(args: ApplicationArguments) {
        gameStateService.setGameState(
            GameState(
                listOf(
                    Player("Stefan", Buerger(), Schatten()),
                    Player("Thomas", Buerger(), Gefaengiswaerter()),
                    Player("Lukas", Seherin(), Schatten()),
                    Player("Schmidi", Werwolf(), Schatten()),
                ),
                listOf(
                    Buerger(),
                    Buerger(),
                    Buerger(),
                    Seherin(),
                    Werwolf(),
                ),
                listOf(
                    Schatten(),
                    Schatten(),
                    Schatten(),
                    Schatten(),
                    Gefaengiswaerter(),
                )
            )
        )
    }

}
