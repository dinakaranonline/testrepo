package hello;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;



@Repository
public class CarSearchRepository {

	@Autowired
	MongoTemplate mongoTemplate;
	
	public Collection<Car> searchCars(String text) {
		return mongoTemplate.find(Query.query(new Criteria()
						.orOperator(Criteria.where("name").regex(text, "i"), 
									Criteria.where("manufacturer").regex(text, "i"))
						), Car.class);
	}
	
}
