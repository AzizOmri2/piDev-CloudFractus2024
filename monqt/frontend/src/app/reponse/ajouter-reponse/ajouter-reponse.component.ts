import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ReponseService } from '../reponse.service'; 


@Component({
  selector: 'app-ajouter-reponse',
  templateUrl: './ajouter-reponse.component.html',
  styleUrls: ['./ajouter-reponse.component.css']
})
export class AjouterReponseComponent {

  addReponseForm: FormGroup;

  constructor(private formBuilder: FormBuilder, private reponseService: ReponseService) {
    this.addReponseForm = this.formBuilder.group({
      idRec: [null, [Validators.required]],
      contenu: [null, [Validators.required]],
      // Ajoutez d'autres champs pour les détails de la réponse selon vos besoins
    });
  }

  addReponse() {
    if (this.addReponseForm.invalid) {
      return;
    }
    const idRec = this.addReponseForm.value.idRec;
    const reponse = this.addReponseForm.value;
    delete reponse.idRec; // Supprimer l'ID de la réclamation de l'objet réponse
    this.reponseService.addReponse(idRec, reponse).subscribe(
      (data) => {
        console.log('Réponse ajoutée avec succès:', data);
        this.addReponseForm.reset();
      },
      (error) => {
        console.error('Erreur lors de l\'ajout de la réponse:', error);
      }
    );
  }

}
