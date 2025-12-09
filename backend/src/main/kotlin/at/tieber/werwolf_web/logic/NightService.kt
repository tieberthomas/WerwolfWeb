package at.tieber.werwolf_web.logic

import org.springframework.stereotype.Service

@Service
class NightService(
    private val gameStateService: GameStateService
) {
    fun getNightSteps(): List<NightStep> {
        return listOf(
            NightStep("test"),
            NightStep("test2")
        )
    }
}
