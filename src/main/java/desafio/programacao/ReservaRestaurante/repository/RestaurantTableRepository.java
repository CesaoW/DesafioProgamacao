package desafio.programacao.ReservaRestaurante.repository;

import desafio.programacao.ReservaRestaurante.model.RestaurantTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantTableRepository extends JpaRepository<RestaurantTable,Long> {

}
