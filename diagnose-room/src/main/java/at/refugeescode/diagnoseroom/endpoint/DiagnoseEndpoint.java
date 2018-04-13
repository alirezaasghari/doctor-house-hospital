package at.refugeescode.diagnoseroom.endpoint;

import at.refugeescode.diagnoseroom.controller.DrHouse;
import at.refugeescode.diagnoseroom.model.Patient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class DiagnoseEndpoint {

    private DrHouse drHouse;

    public DiagnoseEndpoint(DrHouse drHouse) {
        this.drHouse = drHouse;
    }

    @PostMapping
    void getPatient(@RequestBody Patient patient) {
        Patient drHouseDiagnosis = drHouse.diagnose(patient);
        System.out.println(drHouseDiagnosis);
    }
}
