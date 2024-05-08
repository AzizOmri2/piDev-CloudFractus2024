import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AfficherReponseComponent } from './afficher-reponse.component';

describe('AfficherReponseComponent', () => {
  let component: AfficherReponseComponent;
  let fixture: ComponentFixture<AfficherReponseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AfficherReponseComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AfficherReponseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
