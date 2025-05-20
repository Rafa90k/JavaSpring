package com.gamesforyou.dslist.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamesforyou.dslist.Dto.GameMinDTO;
import com.gamesforyou.dslist.entities.Game;
import com.gamesforyou.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return  result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
}
