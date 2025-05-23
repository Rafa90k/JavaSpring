package com.gamesforyou.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gamesforyou.dslist.Dto.GameDTO;
import com.gamesforyou.dslist.Dto.GameMinDTO;
import com.gamesforyou.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@RestController
	public class PingController {
	    @GetMapping("/")
	    public String ping() {
	        return "✅ Aplicação está rodando!";
	    }
	}

	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable long id){
		GameDTO result = gameService.findById(id);
		return result;
	}
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
	
}
