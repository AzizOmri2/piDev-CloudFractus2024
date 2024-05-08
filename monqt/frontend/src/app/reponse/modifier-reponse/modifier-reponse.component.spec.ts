import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModifierReponseComponent } from './modifier-reponse.component';

describe('ModifierReponseComponent', () => {
  let component: ModifierReponseComponent;
  let fixture: ComponentFixture<ModifierReponseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModifierReponseComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ModifierReponseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
