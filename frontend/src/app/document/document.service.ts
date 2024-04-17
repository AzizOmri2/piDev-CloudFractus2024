import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';


const BASIC_URL =["http://localhost:8089"] 


@Injectable({
  providedIn: 'root'
})
export class DocumentService {

  constructor(private http: HttpClient) { }

  postDocument(Document: any ): Observable <any>{
    return this.http.post(BASIC_URL + "/document/ajout", Document);
  }

  afficherDocument(): Observable<any> {
    return this.http.get(BASIC_URL + "/document/all");
  }

  updateDocuemnt(id: number, Document: any): Observable<any>{
    return this.http.put(BASIC_URL+"/document/update/"+id,Document);
  }

  afficherDocumentById(id: number): Observable<any>{
    return this.http.get(BASIC_URL+"/document/show/"+id);
  }

  supprimerDocument(id: number): Observable<any>{
    return this.http.delete(BASIC_URL+"/document/delete/"+id);
  }
}
