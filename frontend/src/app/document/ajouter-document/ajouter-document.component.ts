import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { DocumentService } from '../document.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-ajouter-document',
  templateUrl: './ajouter-document.component.html',
  styleUrls: ['./ajouter-document.component.css']
})
export class AjouterDocumentComponent {
  postDocumentForm! : FormGroup ;

  constructor(private documentService:DocumentService ,
    private fb:FormBuilder,
    private router: Router ){}

  ngOnInit(){
    this.postDocumentForm = this.fb.group({
      titre: [ null , [Validators.required]],
      dateCreation: [ null , [Validators.required]],
      description  : [ null , [Validators.required]],
      taille : [ null , [Validators.required]],
    })
  }

  postDocument(){
    console.log(this.postDocumentForm.value)
    this.documentService.postDocument(this.postDocumentForm.value).subscribe((res) =>{
      console.log(res);
      this.router.navigateByUrl("/afficherDocument");
    })

    }

}
