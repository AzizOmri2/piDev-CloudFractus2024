import { Component } from '@angular/core';
import { ReclamationService } from '../reclamation.service'; 
import { FormBuilder, FormGroup, Validators } from '@angular/forms';


@Component({
  selector: 'app-ajouter-reclamation',
  templateUrl: './ajouter-reclamation.component.html',
  styleUrls: ['./ajouter-reclamation.component.css']
})
export class AjouterReclamationComponent {

  addReclamationForm!: FormGroup;

 constructor(private ReclamationService:ReclamationService,
  private fb:FormBuilder /*private router: Router */ ){}

  ngOnInit(){
    this.addReclamationForm = this.fb.group({
      contenu: [null, [Validators.required]],
      mail: [null, [Validators.required, Validators.email]],
      objet: [null, [Validators.required]],
      proprietaire: [null, [Validators.required]],
      titre: [null, [Validators.required]]

    })
  }

    addReclamation() { 
      console.log(this.addReclamationForm.value);
      this.ReclamationService.addReclamation(this.addReclamationForm.value).subscribe((res)=>{
        console.log(res);
        // this.router.navigateByUrl("");
      })
    }

  }
