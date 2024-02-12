package mongoApp.rep;

import mongoApp.model.Dataset;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DatasetRepository extends MongoRepository<Dataset,Integer> {

}
