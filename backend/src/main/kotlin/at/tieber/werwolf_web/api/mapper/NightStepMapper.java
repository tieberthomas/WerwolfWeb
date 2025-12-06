package at.tieber.werwolf_web.api.mapper;

import at.tieber.werwolf_web.api.model.NightStepDto;
import at.tieber.werwolf_web.logic.NightStep;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NightStepMapper {

    List<NightStepDto> toDto(List<NightStep> nightSteps);

    NightStepDto toDto(NightStep nightStep);

}
