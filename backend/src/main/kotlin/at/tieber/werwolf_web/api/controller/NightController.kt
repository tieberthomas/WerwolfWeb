package at.tieber.werwolf_web.api.controller

import at.tieber.werwolf_web.api.mapper.NightStepMapper
import at.tieber.werwolf_web.api.model.NightStepDto
import at.tieber.werwolf_web.logic.NightService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class NightController(private val nightService: NightService, private val nightStepMapper: NightStepMapper) {

    @GetMapping("/night/steps")
    fun getNightSteps(): List<NightStepDto> {
        return nightStepMapper.toDto(nightService.getNightSteps())
    }
}
