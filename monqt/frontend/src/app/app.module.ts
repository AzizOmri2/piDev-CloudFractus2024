import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminComponent } from './admin/admin.component';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { FrontComponent } from './frontCours/front/front.component';
import { UserFrontComponent } from './User/user-front/user-front.component';
import { AjouterReclamationComponent } from './reclamation/ajouter-reclamation/ajouter-reclamation.component';
import { AfficherReclamationComponent } from './reclamation/afficher-reclamation/afficher-reclamation.component';
import { ModifierReclamationComponent } from './reclamation/modifier-reclamation/modifier-reclamation.component';
import { ModifierReponseComponent } from './reponse/modifier-reponse/modifier-reponse.component';
import { AjouterReponseComponent } from './reponse/ajouter-reponse/ajouter-reponse.component';
import { AfficherReponseComponent } from './reponse/afficher-reponse/afficher-reponse.component';


@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    FrontComponent,
    UserFrontComponent,
    AjouterReclamationComponent,
    AfficherReclamationComponent,
    ModifierReclamationComponent,
    ModifierReponseComponent,
    AjouterReponseComponent,
    AfficherReponseComponent

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
