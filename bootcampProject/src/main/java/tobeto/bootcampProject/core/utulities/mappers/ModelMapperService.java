package tobeto.bootcampProject.core.utulities.mappers;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {
    ModelMapper forResponse();

    ModelMapper forRequest();
}
