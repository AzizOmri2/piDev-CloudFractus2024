import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminComponent } from './admin/admin.component';
import { AfficherSalleComponent } from './salle/afficher-salle/afficher-salle.component';
import { AjouterSalleComponent } from './salle/ajouter-salle/ajouter-salle.component';
import { ModifierSalleComponent } from './salle/modifier-salle/modifier-salle.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AjouterBlocComponent } from './bloc/ajouter-bloc/ajouter-bloc.component';
import { AfficherBlocComponent } from './bloc/afficher-bloc/afficher-bloc.component';
import { ModifierBlocComponent } from './bloc/modifier-bloc/modifier-bloc.component';
import { AjouterReservationComponent } from './reservation/ajouter-reservation/ajouter-reservation.component';
import { AfficherReservationComponent } from './reservation/afficher-reservation/afficher-reservation.component';
import { ModifierReservationComponent } from './reservation/modifier-reservation/modifier-reservation.component';


@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    AfficherSalleComponent,
    AjouterSalleComponent,
    ModifierSalleComponent,
    AjouterBlocComponent,
    AfficherBlocComponent,
    ModifierBlocComponent,
    AjouterReservationComponent,
    AfficherReservationComponent,
    ModifierReservationComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
