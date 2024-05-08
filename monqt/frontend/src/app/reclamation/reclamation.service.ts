import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

const BASIC_URL = ["http://localhost:8084"];

@Injectable({
  providedIn: 'root'
})
export class ReclamationService {

  constructor(private http:HttpClient) { }

  addReclamation(reclamation: any): Observable<any> {
    return this.http.post(BASIC_URL+"/reclamation/add", reclamation);

  }


  getAllReclamation(): Observable<any> {
    return this.http.get(BASIC_URL+"/reclamation/all");
  }

  getrecById(idrec: number): Observable<any> {
    return this.http.get(BASIC_URL+"/reclamation/show" + idrec);
  }

  deleteReclamation(idrec: number): Observable<any> {
    return this.http.delete(BASIC_URL+"/reclamation/delete" + idrec);
  }

}
