import { Component, ViewChild } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { FrontService} from 'src/app/frontCours/front.service';

@Component({
  selector: 'app-front',
  templateUrl: './front.component.html',
  styleUrls: ['./front.component.css']
})
export class FrontComponent {
  @ViewChild('popupModal') popupModal: any;
  validateForm !: FormGroup;

  compteur: number = 0;
  donnees: any;

  constructor(private fb: FormBuilder ,private frontcours: FrontService) {}

  ngOnInit(): void {
    this.validateForm = this.fb.group({
      date: [null, [Validators.required]],
      description: [null, [Validators.required]],
      categorie: [null, [Validators.required]],
      duree: [null, [Validators.required]],
      prix: [null, [Validators.required]],
      statut: [null, [Validators.required]],
      nb_participant: [null, [Validators.required, Validators.max(20)]]
    })
    this.getAllcours();
  }

 
  


  
 

  ouvrirPopup(): void {
    this.popupModal.nativeElement.style.display = 'block'; // Ouvre le popup
  }

  fermerPopup(): void {
    this.popupModal.nativeElement.style.display = 'none'; // Ferme le popup
  }

  getAllcours(){
    this.frontcours.getAllcour().subscribe(data => {
      this.donnees = data; // Stocke les données récupérées dans la variable donneesDeLaBase
    });

  }

  postCour() {
    this.frontcours.postCour(this.validateForm.value).subscribe(res =>{
      
    })
  }

}
