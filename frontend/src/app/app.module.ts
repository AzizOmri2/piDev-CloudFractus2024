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
import { FrontComponent } from './frontCours/front/front.component';
import { UserFrontComponent } from './user/user-front/user-front.component';


@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    AddcoursComponent,
    UpdatecoursComponent,
    GetcoursComponent,
    FrontComponent,
    UserFrontComponent

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
