package ai.semplify.fileserver.mappers;

import ai.semplify.fileserver.models.File;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface FileMapper {

    File toModel(ai.semplify.fileserver.entities.File entity);

    ai.semplify.fileserver.entities.File toEntity(File file);

    @Mapping(target = "content", ignore = true)
    File toModel(ai.semplify.fileserver.entities.FileInfo entity);
}
