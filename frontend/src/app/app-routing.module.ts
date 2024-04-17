import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { AjouterRendezVousComponent } from './rendez-vous/ajouter-rendez-vous/ajouter-rendez-vous.component';
import { ModifierRendezVousComponent } from './rendez-vous/modifier-rendez-vous/modifier-rendez-vous.component';
import {  AfficherRendezVousComponent } from './rendez-vous/afficher-rendez-vous/afficher-rendez-vous.component';
import { ModifierDocumentComponent } from './document/modifier-document/modifier-document.component';
import { AjouterDocumentComponent } from './document/ajouter-document/ajouter-document.component';
import { AfficherDocumentComponent } from './document/afficher-document/afficher-document.component';

const routes: Routes = [
  { path: 'dashboard', component: AdminComponent },
  { path: 'ajouterRendezVous', component: AjouterRendezVousComponent },
  { path: 'afficherRendezVous', component:  AfficherRendezVousComponent},
  { path: 'modifierRendezVous/:id', component:   ModifierRendezVousComponent },
  { path: 'modifierDocument/:id', component:   ModifierDocumentComponent },
  { path: 'ajouterDocument', component: AjouterDocumentComponent },
  { path: 'afficherDocument', component:  AfficherDocumentComponent}
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
