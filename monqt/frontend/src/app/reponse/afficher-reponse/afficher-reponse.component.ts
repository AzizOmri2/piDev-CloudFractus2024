import { Component } from '@angular/core';
import { ReponseService } from '../reponse.service'; 


@Component({
  selector: 'app-afficher-reponse',
  templateUrl: './afficher-reponse.component.html',
  styleUrls: ['./afficher-reponse.component.css']
})
export class AfficherReponseComponent {

  reponses: any[] = [];

  constructor(private ReponseService: ReponseService) { }

  getAllReponses() {
    this.ReponseService.getAllReponses().subscribe(
      (res) => {
        console.log(res);
        this.reponses = res;
      },
      (error) => {
        console.error('Erreur lors de la récupération des réponses:', error);
      }
    );
  }

  deleteReponse(id: number) {
    this.ReponseService.deleteReponse(id).subscribe(
      (res) => {
        console.log(res);
        this.getAllReponses();
      },
      (error) => {
        console.error('Erreur lors de la suppression de la réponse:', error);
      }
    );
  }
}
