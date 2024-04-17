import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminComponent } from './admin/admin.component';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AddcoursComponent } from './cours/addcours/addcours.component';
import { UpdatecoursComponent } from './cours/updatecours/updatecours.component';
import { GetcoursComponent } from './cours/getcours/getcours.component';
import { GetallComponent } from './Projet/getall/getall.component';
import { AjoutComponent } from './Projet/ajout/ajout.component';
import { UpdateComponent } from './Projet/update/update.component';


@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    AddcoursComponent,
    UpdatecoursComponent,
    GetcoursComponent,
    GetallComponent,
    AjoutComponent,
    UpdateComponent,

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
