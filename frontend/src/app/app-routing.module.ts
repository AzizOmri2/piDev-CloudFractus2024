import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AdminComponent } from './admin/admin.component';

import { AddcoursComponent } from './cours/addcours/addcours.component';
import { UpdatecoursComponent } from './cours/updatecours/updatecours.component';
import { GetcoursComponent } from './cours/getcours/getcours.component';
import { UserFrontComponent } from './user/user-front/user-front.component';


const routes: Routes = [
  { path: 'dashboard', component: AdminComponent },
  { path: 'frontOffice', component: UserFrontComponent },
  { path: 'addcour', component: AddcoursComponent},
  { path: 'update/:id', component : UpdatecoursComponent},
  { path: 'affichercours', component : GetcoursComponent},
  //{ path: '' , component:UserfrontComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
