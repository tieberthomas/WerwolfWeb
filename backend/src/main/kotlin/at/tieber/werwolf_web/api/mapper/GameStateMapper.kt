package at.tieber.werwolf_web.api.mapper

import at.tieber.werwolf_web.api.model.GameStateDto
import at.tieber.werwolf_web.logic.GameState
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface GameStateMapper {

    fun fromDto(gameStateDto: GameStateDto): GameState

}
