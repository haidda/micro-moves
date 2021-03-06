package org.flexess.games.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Repository for Moves.
 * Via Spring Data JPA, see https://projects.spring.io/spring-data-jpa/
 *
 * @author stefanz
 */
public interface MoveRepository extends CrudRepository<Move, Long> {

    /**
     * Find moves for a given game.
     *
     * @param game the game
     * @return list of moves
     */
    public List<Move> findByGame(Game game);
}
