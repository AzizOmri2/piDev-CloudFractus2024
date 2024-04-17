import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { SalleService } from '../salle.service';
import { FormBuilder , FormGroup, Validators } from '@angular/forms';


@Component({
  selector: 'app-modifier-salle',
  templateUrl: './modifier-salle.component.html',
  styleUrls: ['./modifier-salle.component.css']
})
export class ModifierSalleComponent {

  id: number = this.activatedRoute.snapshot.params["id"];

  updateSalleForm!: FormGroup;
  constructor(
    private activatedRoute: ActivatedRoute,
    private salleService: SalleService,
    private fb: FormBuilder,
    private router: Router){}

  ngOnInit(){
    this.updateSalleForm = this.fb.group({
      id: this.id,
      capacite: [null, [Validators.required]],
      disponibilite: [null, [Validators.required]],
      nom: [null, [Validators.required]],
      bloc_id: [null, [Validators.required]]
    })
    this.getSalleById();
  }

  getSalleById(){
    this.salleService.afficherSalleById(this.id).subscribe((res)=>{
      console.log(res);
      this.updateSalleForm.patchValue(res);
    })
  }

  updateSalle(){
    this.salleService.updateSalle(this.id,this.updateSalleForm.value).subscribe((res)=>{
      console.log(res);
      if(res.id != null){
        this.router.navigateByUrl("/afficherSalle");
      }
    })
  }

}
