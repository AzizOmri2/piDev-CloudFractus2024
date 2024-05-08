package tn.esprit.monqt.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.monqt.Entities.Reponse;
import tn.esprit.monqt.services.ReponseServiceImpl;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reponse")
@CrossOrigin("*")
public class ReponseController {

    private ReponseServiceImpl rs;

    @PostMapping("/add/{idRec}")
    public Reponse addReponseToReclamations(@RequestBody Reponse reponse, @PathVariable("idRec") Long idRec) {
        return rs.addreponse(reponse, idRec);
    }

    @GetMapping("/all")
    public List<Reponse> listReponse() {
        return rs.viewReponse();
    }

    @GetMapping("/show/{idRep}")
    public Reponse getById(@PathVariable("idRep") Long idRep) {
        return rs.getById(idRep);
    }

    @DeleteMapping("/delete/{idRep}")
    public void deleteReponse(@PathVariable("idRep") Long idRep) {
        rs.deleteReponse(idRep);
    }

    @PutMapping("/update")
    public void updateReponse(@RequestBody Reponse rep) {
        rs.updateReponse(rep);
    }
}
