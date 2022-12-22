import { Component } from '@angular/core';
import {NgModule} from '@angular/core';
import {RoundProgressModule} from 'angular-svg-round-progressbar';

@NgModule({
  imports: [RoundProgressModule]
})
export class YourModule {};

@Component({
  selector: 'app-hys',
  templateUrl: './hys.component.html',
  styleUrls: ['./hys.component.css']
})

  export class HysComponent {

}
