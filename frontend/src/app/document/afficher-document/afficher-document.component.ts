import { Component } from '@angular/core';
import { DocumentService } from '../document.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-afficher-document',
  templateUrl: './afficher-document.component.html',
  styleUrls: ['./afficher-document.component.css']
})
export class AfficherDocumentComponent {
  docs!: any[];

    constructor(
      private docsService: DocumentService,
      private router: Router
    ){}

    ngOnInit(){
      this.getDocs();
    }

    getDocs(){
      this.docsService.afficherDocument().subscribe((res) =>{
        console.log(res);
        this.docs = res;
      })
    }

    deleteDocument(id: number){
      this.docsService.supprimerDocument(id).subscribe((res)=>{
        console.log(res);
        this.ngOnInit();
      })
    }

}
