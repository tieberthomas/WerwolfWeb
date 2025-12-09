package at.tieber.werwolf_web.api.controller

import at.tieber.werwolf_web.api.mapper.GameStateMapper
import at.tieber.werwolf_web.api.model.GameStateDto
import at.tieber.werwolf_web.logic.GameStateService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GameSetupController(
    private val gameStateService: GameStateService,
    private val gameStateMapper: GameStateMapper
) {

    @PostMapping("/setup/game")
    fun setupGame(gameStateDto: GameStateDto) {
        gameStateService.setGameState(gameStateMapper.fromDto(gameStateDto))
    }
}
