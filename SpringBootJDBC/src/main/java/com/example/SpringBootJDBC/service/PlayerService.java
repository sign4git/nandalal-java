package com.example.SpringBootJDBC.service;

import com.example.SpringBootJDBC.model.Player;
import com.example.SpringBootJDBC.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public void addPlayer(Player player){
        playerRepository.save(player);
    }

    public List<Player> findAllPlayers(){
        return playerRepository.findAll();
    }
}
