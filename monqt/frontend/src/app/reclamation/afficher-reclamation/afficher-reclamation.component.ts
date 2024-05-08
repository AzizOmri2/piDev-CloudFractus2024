import { Component } from '@angular/core';
import { ReclamationService } from '../reclamation.service'; 

@Component({
  selector: 'app-afficher-reclamation',
  templateUrl: './afficher-reclamation.component.html',
  styleUrls: ['./afficher-reclamation.component.css']
})
export class AfficherReclamationComponent {

  Reclamations: any = [];


  constructor(private ReclamationService: ReclamationService) { }

  ngOnInti(){
this.getAllReclamation(); 
  }

  getAllReclamation() {
    this.ReclamationService.getAllReclamation().subscribe((res) => {
      console.log(res);
      this.Reclamations = res;
    })

  }

  deleteReclamation (idrec: number) {
this.ReclamationService.deleteReclamation(idrec).subscribe((res) =>
{
  console.log(res);
  this.getAllReclamation();
}
)

  }

}
