package com.gamesforyou.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamesforyou.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
