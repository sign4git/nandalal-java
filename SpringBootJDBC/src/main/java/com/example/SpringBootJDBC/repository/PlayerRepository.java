package com.example.SpringBootJDBC.repository;

import com.example.SpringBootJDBC.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PlayerRepository {

    @Autowired
    JdbcTemplate jdbc;

    public void save(Player player) {
        String sql = "insert into player (matches,name,runs,wickets) values (?,?,?,?)";
        jdbc.update(sql,player.getMatches(),player.getName(),player.getRuns(),player.getWickets());
    }

    public List<Player> findAll(){
        String sql ="select * from player";
        RowMapper<Player> mapper = ((rs, rowNum) -> new Player(rs.getInt("matches"),
                rs.getString("name"),
                rs.getInt("runs"),
                rs.getInt("wickets")));
        return jdbc.query(sql,mapper);
    }
}
