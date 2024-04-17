import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminComponent } from './admin/admin.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AjouterRendezVousComponent } from './rendez-vous/ajouter-rendez-vous/ajouter-rendez-vous.component';
import { AfficherRendezVousComponent } from './rendez-vous/afficher-rendez-vous/afficher-rendez-vous.component';
import { ModifierRendezVousComponent } from './rendez-vous/modifier-rendez-vous/modifier-rendez-vous.component';
import { AjouterDocumentComponent } from './document/ajouter-document/ajouter-document.component';
import { AfficherDocumentComponent } from './document/afficher-document/afficher-document.component';
import { ModifierDocumentComponent } from './document/modifier-document/modifier-document.component';


@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    AjouterRendezVousComponent,
    AfficherRendezVousComponent,
    ModifierRendezVousComponent,
    AjouterDocumentComponent,
    AfficherDocumentComponent,
    ModifierDocumentComponent,

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
