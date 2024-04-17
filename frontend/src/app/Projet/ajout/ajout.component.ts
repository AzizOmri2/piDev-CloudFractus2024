import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-ajout',
  templateUrl: './ajout.component.html',
  styleUrls: ['./ajout.component.css']
})
export class AjoutComponent {
  validateFormupdate!: FormGroup;
 constructor(private projetService : ServiceService,private fb:FormBuilder){

 }
  ngOnInit(){
            this.validateFormupdate = this.fb.group({
              description : [null,[Validators.required]],
              nombre : [null,[Validators.required]],
              nom : [null,[Validators.required]],
            
              specialite : [null,[Validators.required]] 
              
            }) 

  }
  postprojet(){
    this.projetService.postProjet(this.validateFormupdate.value).subscribe(res=>{
      console.log(res)
  })
}
  

}
