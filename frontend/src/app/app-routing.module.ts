import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AdminComponent } from './admin/admin.component';

import { AddcoursComponent } from './cours/addcours/addcours.component';
import { UpdatecoursComponent } from './cours/updatecours/updatecours.component';
import { GetcoursComponent } from './cours/getcours/getcours.component';
import { GetallComponent } from './Projet/getall/getall.component';
import { AjoutComponent } from './Projet/ajout/ajout.component';
import { UpdateComponent } from './Projet/update/update.component';

const routes: Routes = [
  { path: 'dashboard', component: AdminComponent },
  { path: 'addcour', component: AddcoursComponent},
  { path: 'update/:id', component : UpdatecoursComponent},
  { path: 'affichercours', component : GetcoursComponent},
  { path: 'ajouterprojet', component: AjoutComponent },
  
  { path: 'afficherprojet', component: GetallComponent},
  {path: 'modifierprojet/:id', component: UpdateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
