import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  login: FormGroup;
  constructor(private _formBuider: FormBuilder) { }

  ngOnInit(): void {
    this.login = this._formBuider.group({
      email: ['' , [Validators.required]],
      password: ['' , [Validators.required]]
    });
  }

  onSubmit() {
    console.log(this.login.value);
  }
}
