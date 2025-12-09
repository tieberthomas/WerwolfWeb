package at.tieber.werwolf_web.logic

import org.springframework.stereotype.Service

@Service
class GameStateService {

    private var gameState: GameState? = null;

    fun setGameState(gameState: GameState) {
        this.gameState = gameState
    }

    fun getGameState(): GameState {
        if (gameState == null) {
            throw RuntimeException("game state is null")
        }

        return gameState!!
    }
}
