package com.gamesforyou.dslist.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gamesforyou.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
