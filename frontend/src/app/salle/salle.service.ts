import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';


const BASIC_URL = ["http://localhost:8089"]

@Injectable({
  providedIn: 'root'
})
export class SalleService {

  constructor(private http: HttpClient) { }

  postSalle(salle : any): Observable<any> {
    return this.http.post(BASIC_URL + "/salle/add", salle);
  }

  updateSalle(id: number,salle : any): Observable<any> {
    return this.http.put(BASIC_URL + "/salle/update/"+id, salle);
  }

  afficherSalle(): Observable<any>{
    return this.http.get(BASIC_URL+"/salle/all");
  }

  afficherSalleById(id: number): Observable<any>{
    return this.http.get(BASIC_URL+"/salle/show/"+id);
  }

  supprimerSalle(id: number): Observable<any>{
    return this.http.delete(BASIC_URL+"/salle/delete/"+id);
  }

  affecterSalleBloc(idS: number, idB: number): Observable<any>{
    return this.http.put(BASIC_URL+"/salle/affecterSalleBloc/"+idS+"/"+idB, {});
  }
}
