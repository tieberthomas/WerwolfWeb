package at.tieber.werwolf_web.logic

import org.springframework.stereotype.Service

@Service
class NightService(
    private val gameStateService: GameStateService
) {
    fun getNightSteps(): List<NightStep> {
        return listOf(
            NightStep("alle_schlafen_ein"),
            NightStep("seherin_choose"),
            NightStep("seherin_show_fraktion"),
            NightStep("werwoelfe_choose"),
            NightStep("alle_wachen_auf"),
        )
    }
}
