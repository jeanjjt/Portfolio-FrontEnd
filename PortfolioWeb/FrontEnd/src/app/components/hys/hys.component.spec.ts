import { ComponentFixture, TestBed } from '@angular/core/testing';
import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { HysComponent } from './hys.component';
import { NgModule } from '@angular/core';
import { RoundProgressModule } from 'angular-svg-round-progressbar';


@NgModule({
  imports: [RoundProgressModule]
})
export class YourModule {};

describe('HysComponent', () => {
  let component: HysComponent;
  let fixture: ComponentFixture<HysComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HysComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HysComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
