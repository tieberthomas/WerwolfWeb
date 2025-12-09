package at.tieber.werwolf_web

import at.tieber.werwolf_web.logic.GameState
import at.tieber.werwolf_web.logic.GameStateService
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class HardCodedGameStateInitializer(private val gameStateService: GameStateService) : ApplicationRunner {

    override fun run(args: ApplicationArguments) {
        gameStateService.setGameState(GameState(listOf(), listOf(), listOf()))
    }

}
