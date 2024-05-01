import { Component } from '@angular/core';
import { BlocService } from '../bloc.service';
import { Router } from '@angular/router';
import * as L from 'leaflet';

@Component({
  selector: 'app-afficher-bloc',
  templateUrl: './afficher-bloc.component.html',
  styleUrls: ['./afficher-bloc.component.css']
})
export class AfficherBlocComponent {
  
  blocs: any = [];

  constructor(
    private blocService: BlocService,
    private router: Router){}

  ngOnInit(){
    this.getAllBloc();
  }

  getAllBloc(){
    this.blocService.afficherBloc().subscribe((res)=>{
      console.log(res);
      this.blocs = res;
    })
  }

  deleteBloc(id: number){
    this.blocService.supprimerBloc(id).subscribe((res)=>{
      console.log(res);
      this.ngOnInit();
    })
  }

  //Map
  /*private map!: L.Map;
  private centroid: L.LatLngExpression = [42.3601, -71.0589]; //Boston

  private initMap(): void{
    this.map = L.map('map',{
      center: this.centroid,
      zoom: 12
    })
  }

  const tiles = L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
      maxZoom: 18,
      minZoom: 10,
      attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
    });

    // create 5 random jitteries and add them to map

    let jittery = Array(5).fill(this.centroid).map(
      x => [x[0] + (Math.random() - .5) / 10, x[1] + (Math.random() - .5) / 10] // Added closing parenthesis
    ).map(
      x => L.marker(x as L.LatLngExpression)
    ).forEach(
      x => x.addTo(this.map)
    );*/

}
