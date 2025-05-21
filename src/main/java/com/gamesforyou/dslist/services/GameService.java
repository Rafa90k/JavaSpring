package com.gamesforyou.dslist.services;
import com.gamesforyou.dslist.projections.GameMinProjection;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gamesforyou.dslist.Dto.GameDTO;
import com.gamesforyou.dslist.Dto.GameMinDTO;
import com.gamesforyou.dslist.entities.Game;
import com.gamesforyou.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return  result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return  result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
}
