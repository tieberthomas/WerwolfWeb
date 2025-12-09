package at.tieber.werwolf_web.api.mapper

import at.tieber.werwolf_web.api.model.NightStepDto
import at.tieber.werwolf_web.logic.NightStep
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface NightStepMapper {

    fun toDto(nightSteps: List<NightStep>): List<NightStepDto>

    fun toDto(nightStep: NightStep): NightStepDto

}
