package mongoApp.Controller;

import mongoApp.model.Dataset;
import mongoApp.rep.DatasetRepository;
import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dataset")
public class MyController {
    @Autowired
    private DatasetRepository datasetRepository;

    @PostMapping ("/")
    public ResponseEntity<?> addDataset(@RequestBody Dataset dataset){
        Dataset data=this.datasetRepository.save(dataset);
        return ResponseEntity.ok(data);
    }
    @GetMapping("/")
    public ResponseEntity<?> getDataset(){
        return ResponseEntity.ok(this.datasetRepository.findAll());
    }

}
