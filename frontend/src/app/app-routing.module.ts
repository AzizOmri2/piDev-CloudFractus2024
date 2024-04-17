import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AjouterSalleComponent } from './salle/ajouter-salle/ajouter-salle.component';
import { AfficherSalleComponent } from './salle/afficher-salle/afficher-salle.component';
import { AdminComponent } from './admin/admin.component';
import { ModifierSalleComponent } from './salle/modifier-salle/modifier-salle.component';
import { ModifierBlocComponent } from './bloc/modifier-bloc/modifier-bloc.component';
import { AjouterBlocComponent } from './bloc/ajouter-bloc/ajouter-bloc.component';
import { AfficherBlocComponent } from './bloc/afficher-bloc/afficher-bloc.component';
import { AjouterReservationComponent } from './reservation/ajouter-reservation/ajouter-reservation.component';
import { AfficherReservationComponent } from './reservation/afficher-reservation/afficher-reservation.component';
import { ModifierReservationComponent } from './reservation/modifier-reservation/modifier-reservation.component';

const routes: Routes = [
  { path: 'dashboard', component: AdminComponent },
  //{ path: '', redirectTo: 'afficherSalle', pathMatch: 'full' },
  { path: 'ajouterSalle', component: AjouterSalleComponent },
  { path: 'afficherSalle', component: AfficherSalleComponent },
  { path: 'modifierSalle/:id', component: ModifierSalleComponent },
  { path: 'ajouterBloc', component: AjouterBlocComponent },
  { path: 'afficherBloc', component: AfficherBlocComponent },
  { path: 'modifierBloc/:id', component: ModifierBlocComponent },
  { path: 'ajouterReservation/:id', component: AjouterReservationComponent },
  { path: 'afficherReservation', component: AfficherReservationComponent },
  { path: 'modifierReservation/:id', component: ModifierReservationComponent },
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
