package noseryoung.ch.gameshop.service.impl;

import lombok.AllArgsConstructor;
import noseryoung.ch.gameshop.dto.StatusDTO;
import noseryoung.ch.gameshop.dto.StatusDTO;
import noseryoung.ch.gameshop.entity.Status;
import noseryoung.ch.gameshop.entity.Status;
import noseryoung.ch.gameshop.mapper.StatusMapper;
import noseryoung.ch.gameshop.mapper.StatusMapper;
import noseryoung.ch.gameshop.repository.StatusRepository;
import noseryoung.ch.gameshop.service.StatusService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StatusServiceImpl implements StatusService {

    private final StatusRepository statusRepository;

    @Override
    public List<StatusDTO> getAllStatus() {
        List<Status> status = statusRepository.findAll();
        return status.stream()
                .map(StatusMapper::mapToStatusDTO)
                .collect(Collectors.toList());
    }

    public StatusDTO createStatus(StatusDTO statusDTO){
        Status status = StatusMapper.mapToStatus(statusDTO);
        Status savedStatus = statusRepository.save(status);
        return StatusMapper.mapToStatusDTO(savedStatus);
    }

    public StatusDTO updateStatus(int id, StatusDTO statusDTO){
        Optional<Status> statusOptional = statusRepository.findById(id);
        if (statusOptional.isPresent()) {
            Status status = statusOptional.get();
            status.setName(statusDTO.getName());
            Status updatedStatus = statusRepository.save(status);
            return StatusMapper.mapToStatusDTO(updatedStatus);
        } else {
            throw new RuntimeException("Status not found");
        }
    }

    public void deleteStatus(int id){
        statusRepository.deleteById(id);
    }
}