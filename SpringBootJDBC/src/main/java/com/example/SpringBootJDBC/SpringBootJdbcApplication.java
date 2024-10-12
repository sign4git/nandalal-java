package com.example.SpringBootJDBC;

import com.example.SpringBootJDBC.model.Player;
import com.example.SpringBootJDBC.service.PlayerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootJdbcApplication.class, args);
		Player player = new Player(102,"Ravichandran Ashwin",3423,527);
		PlayerService playerService = context.getBean(PlayerService.class);
		playerService.addPlayer(player);

		List<Player> playerList =  playerService.findAllPlayers();
		System.out.println(playerList);
	}

}
