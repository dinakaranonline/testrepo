package hello;


import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "car", path = "cars")
public interface CarRepository extends MongoRepository<Car, String> {

	List<Car> findByName(@Param("name") String name);
	
	List<Car> findByManufacturer(@Param("manufacturer") String manufacturer);
	

	
	
	
}