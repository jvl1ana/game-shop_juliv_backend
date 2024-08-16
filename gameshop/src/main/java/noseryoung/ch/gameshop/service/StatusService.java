package noseryoung.ch.gameshop.service;

import noseryoung.ch.gameshop.dto.StatusDTO;

import java.util.List;

public interface StatusService {

    List<StatusDTO> getAllStatus();

    StatusDTO createStatus(StatusDTO statusDTO);

    StatusDTO updateStatus(int id, StatusDTO statusDTO);

    void deleteStatus(int id);
}
