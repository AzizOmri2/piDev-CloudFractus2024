import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';



const BASIC_URL =["http://localhost:8089"] 

@Injectable({
  providedIn: 'root'
})
export class RendezVousService {

  constructor(private http: HttpClient) { }

  postRendezVous(RendezVous : any ): Observable <any>{
    return this.http.post(BASIC_URL + "/rendezVous/ajout", RendezVous);
  }

  afficherRendezVous(): Observable<any> {
    return this.http.get(BASIC_URL + "/rendezVous/all");
  }

  updateRendezVous(id: number, RendezVous: any): Observable<any>{
    return this.http.put(BASIC_URL+"/rendezVous/update/"+id,RendezVous);
  }

  afficherRendezVousById(id: number): Observable<any>{
    return this.http.get(BASIC_URL+"/rendezVous/show/"+id);
  }

  supprimerRendezVous(id: number): Observable<any>{
    return this.http.delete(BASIC_URL+"/rendezVous/delete/"+id);
  }

}
