package in.vp.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vp.entity.Movies;

public interface MoviesRepository extends JpaRepository<Movies, UUID> {

	Movies findByMoviesName(String movieName);

}
