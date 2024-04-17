import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  private url = 'http://localhost:8085/';

  constructor(private http: HttpClient) { 

  }
    postProjet( Projet: any) : Observable<any> {
      return this.http.post(this.url + "pic/projet/addprojet", Projet);
      }


     getAll() : Observable<any>{
      return this.http.get(this.url + "pic/projet/getall");

     }
     
     
     update( Projet: any, id: number) : Observable <any>    
     {       
     return this.http.put(this.url + `pic/projet/update/${id}`, Projet);}

     getbyId(id: number) : Observable<any>
     {
      return this.http.get(this.url+ `pic/projet/getProjet/${id}`) ;  
     }
     delete(id:number): Observable <any> {
      return this.http.delete(this.url +`pic/projet/delete/${id}`);
     }

   
}
