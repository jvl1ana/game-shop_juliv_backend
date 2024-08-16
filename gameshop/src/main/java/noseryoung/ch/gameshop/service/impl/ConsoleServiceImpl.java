package noseryoung.ch.gameshop.service.impl;

import lombok.AllArgsConstructor;
import noseryoung.ch.gameshop.dto.ConsoleDTO;
import noseryoung.ch.gameshop.dto.ConsoleDTO;
import noseryoung.ch.gameshop.entity.Console;
import noseryoung.ch.gameshop.entity.Console;
import noseryoung.ch.gameshop.mapper.ConsoleMapper;
import noseryoung.ch.gameshop.mapper.ConsoleMapper;
import noseryoung.ch.gameshop.repository.ConsoleRepository;
import noseryoung.ch.gameshop.service.ConsoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ConsoleServiceImpl implements ConsoleService {

    private final ConsoleRepository consoleRepository;

    @Override
    public List<ConsoleDTO> getAllConsole() {
        List<Console> consoles = consoleRepository.findAll();
        return consoles.stream()
                .map(ConsoleMapper::mapToConsoleDTO)
                .collect(Collectors.toList());
    }
    public ConsoleDTO createConsole(ConsoleDTO consoleDTO){
        Console console = ConsoleMapper.mapToConsole(consoleDTO);
        Console savedConsole = consoleRepository.save(console);
        return ConsoleMapper.mapToConsoleDTO(savedConsole);
    }

    public ConsoleDTO updateConsole(int id, ConsoleDTO consoleDTO){
        Optional<Console> consoleOptional = consoleRepository.findById(id);
        if (consoleOptional.isPresent()) {
            Console console = consoleOptional.get();
            console.setName(consoleDTO.getName());
            Console updatedConsole = consoleRepository.save(console);
            return ConsoleMapper.mapToConsoleDTO(updatedConsole);
        } else {
            throw new RuntimeException("Console not found");
        }
    }

    public void deleteConsole(int id){
        consoleRepository.deleteById(id);
    }
}