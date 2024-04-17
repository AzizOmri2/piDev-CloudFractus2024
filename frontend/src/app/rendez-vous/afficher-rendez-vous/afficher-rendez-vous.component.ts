import { Component } from '@angular/core';
import { RendezVousService } from '../rendez-vous.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-afficher-rendez-vous',
  templateUrl: './afficher-rendez-vous.component.html',
  styleUrls: ['./afficher-rendez-vous.component.css']
})
export class AfficherRendezVousComponent {
    rdvs!: any[];

    constructor(
      private rdvService: RendezVousService,
      private router: Router
    ){}

    ngOnInit(){
      this.getRdvs();
    }

    getRdvs(){
      this.rdvService.afficherRendezVous().subscribe((res) =>{
        console.log(res);
        this.rdvs = res;
      })
    }

    deleteRdv(id: number){
      this.rdvService.supprimerRendezVous(id).subscribe((res)=>{
        console.log(res);
        this.ngOnInit();
      })
    }
}
