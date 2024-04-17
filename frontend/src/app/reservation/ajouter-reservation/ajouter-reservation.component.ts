import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ReservationService } from '../reservation.service';


@Component({
  selector: 'app-ajouter-reservation',
  templateUrl: './ajouter-reservation.component.html',
  styleUrls: ['./ajouter-reservation.component.css']
})
export class AjouterReservationComponent {

  postReservationForm!: FormGroup;

  constructor(
    private reservationService: ReservationService, 
    private fb: FormBuilder,
    private router: Router){}

  ngOnInit(){
    this.postReservationForm = this.fb.group({
      date: [null, [Validators.required]],
      raison: [null, [Validators.required]],
      nbParticipant: [null, [Validators.required]]
    })
  }

  postReservation(){
    console.log(this.postReservationForm.value);
    this.reservationService.postReservation(this.postReservationForm.value).subscribe((res)=>{
      console.log(res);
      this.router.navigateByUrl("/afficherReservation");
    })
  }

}
