import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-color',
  templateUrl: './color.component.html',
  styleUrls: ['./color.component.css']
})
export class ColorComponent implements OnInit {
  color = 'color: red';
  constructor() { }

  ngOnInit(): void {
  }
  green() {
    this.color = 'color: green';
  }
  blue() {
    this.color = 'color: blue';
  }
  yellow() {
    this.color = 'color: yellow';
  }
}
