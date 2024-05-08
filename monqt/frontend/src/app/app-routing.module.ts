import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AdminComponent } from './admin/admin.component';

import { UserFrontComponent } from './User/user-front/user-front.component';
import { AjouterReclamationComponent } from './reclamation/ajouter-reclamation/ajouter-reclamation.component';
import { AfficherReclamationComponent } from './reclamation/afficher-reclamation/afficher-reclamation.component';
import { ModifierReclamationComponent } from './reclamation/modifier-reclamation/modifier-reclamation.component';
import {AjouterReponseComponent} from './reponse/ajouter-reponse/ajouter-reponse.component';
import {AfficherReponseComponent} from './reponse/afficher-reponse/afficher-reponse.component';


const routes: Routes = [
  { path: 'dashboard', component: AdminComponent },
  { path: 'frontOffice', component: UserFrontComponent },
  {path: 'reclamation', component: AjouterReclamationComponent},
  {path: "", component: AfficherReclamationComponent},
  {path: "reclamation/:idrec", component: ModifierReclamationComponent},
  {path: "reponse/:idrec", component: AjouterReponseComponent},
  {path: "", component: AfficherReponseComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
