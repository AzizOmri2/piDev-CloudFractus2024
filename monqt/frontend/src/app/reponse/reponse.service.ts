import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

const BASIC_URL = ["http://localhost:8084"];


@Injectable({
  providedIn: 'root'
})
export class ReponseService {


  constructor(private http: HttpClient) { }

  addReponse(idRec: number, reponse: any): Observable<any> {
    return this.http.post(`${BASIC_URL}/reponse/add/${idRec}`, reponse);
  }

  getAllReponses(): Observable<any> {
    return this.http.get(`${BASIC_URL}/reponse/all`);
  }
  deleteReponse(id: number): Observable<any> {
    return this.http.delete(`${BASIC_URL}/reponse/${id}`);
  }
}
