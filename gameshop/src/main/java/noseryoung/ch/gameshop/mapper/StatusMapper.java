package noseryoung.ch.gameshop.mapper;

import noseryoung.ch.gameshop.dto.StatusDTO;
import noseryoung.ch.gameshop.entity.Status;

public class StatusMapper {
    public static StatusDTO mapToStatusDTO(Status status){
        return new StatusDTO(
                status.getStatus_id(),
                status.getName()
        );
    }

    public static Status mapToStatus (StatusDTO statusDTO){
        return new Status(
                statusDTO.getStatus_id(),
                statusDTO.getName()
        );
    }
}
