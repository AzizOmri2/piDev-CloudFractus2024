import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class FrontService {

  private apiURL = 'http://localhost:8083/';

  constructor(private http: HttpClient) {
   }

  getAllcour(): Observable<any> {
    return this.http.get(this.apiURL + "cours/getall")
  }

  postCour(cours: any): Observable<any> {
    return this.http.post(this.apiURL + "cours/addC", cours)
  }
}
