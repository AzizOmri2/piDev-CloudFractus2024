import { Component } from '@angular/core';
import { SalleService } from '../salle.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { BlocService } from 'src/app/bloc/bloc.service';

@Component({
  selector: 'app-ajouterSalle',
  templateUrl: './ajouter-salle.component.html',
  styleUrls: ['./ajouter-salle.component.css']
})
export class AjouterSalleComponent {
  postSalleForm!: FormGroup;

  constructor(
    private salleService: SalleService, 
    private fb: FormBuilder,
    private router: Router){}

  ngOnInit(){
    this.postSalleForm = this.fb.group({
      capacite: [null, [Validators.required]],
      disponibilite: ["Disponible", [Validators.required]],
      nom: [null, [Validators.required]],
      bloc_id: [null, [Validators.required]]
    }) 
  }

  postSalle(){
    console.log(this.postSalleForm.value);
    this.salleService.postSalle(this.postSalleForm.value).subscribe((res)=>{
      console.log(res);
      this.router.navigateByUrl("/afficherSalle");
    })
  }

}
