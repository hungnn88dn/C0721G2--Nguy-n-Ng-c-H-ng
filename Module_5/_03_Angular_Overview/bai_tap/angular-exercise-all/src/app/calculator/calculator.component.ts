import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
   a: number;
   b: number;
   result: number;
  constructor() { }

  ngOnInit(): void {
  }
 add(){
   this.result = this.a + this.b;
 }
 sub(){
    this.result = this.a - this.b;
 }
 mul(){
    this.result = this.a * this.b;
 }
  div(){
    this.result = this.a / this.b;
 }
}
