import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ReclamationService } from '../reclamation.service';
import { FormGroup } from '@angular/forms';
import { FormBuilder, Validators } from '@angular/forms';


@Component({
  selector: 'app-modifier-reclamation',
  templateUrl: './modifier-reclamation.component.html',
  styleUrls: ['./modifier-reclamation.component.css']
})
export class ModifierReclamationComponent {
  updateReclamationForm!: FormGroup;

  idrec:number =this.activatedRoute.snapshot.params["idrec"];

  constructor (private activatedRoute: ActivatedRoute,
    private service: ReclamationService,
  private fb: FormBuilder  ){}

    ngOnInit () {
      this.updateReclamationForm = this.fb.group({
        contenu: [null, [Validators.required]],
        mail: [null, [Validators.required, Validators.email]],
        objet: [null, [Validators.required]],
        proprietaire: [null, [Validators.required]],
        titre: [null, [Validators.required]]
  
      })
this.getrecById();

    }

    getrecById() {
      this.service.getrecById(this.idrec).subscribe((res) => {
        console.log(res);
        this.updateReclamationForm.patchValue(res);
      })
    }
}
