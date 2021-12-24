import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import {passwordNotMatch} from '../validator';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  phoneRegex = '^\+84\\d{9,10}$';
  countryList = [{id: 1, name: 'Viet Nam'}, {id: 2, name: 'Lao'}, {id: 3, name: 'Campuchia'},];
  register: FormGroup;

  constructor(private _formBuider: FormBuilder) {
  }

  ngOnInit(): void {
    this.register = this._formBuider.group({
      email: ['', [Validators.required]],
      passwordGroup: new FormGroup({
        password: new FormControl(),
        passwordConfirm: new FormControl()
      }, {validators: passwordNotMatch}),
      country: ['', [Validators.required]],
      age: ['', [Validators.required, Validators.min(18)]],
      gender: ['', [Validators.required]],
      phone: ['', [Validators.required]]
    });
  }

  onSubmit() {
    console.log(this.register.value);
  }

  get passwordGroup() {
    return this.register.get('passwordGroup');
  }

  get password() {
    return this.register.get(['passwordGroup', 'password']);
  }

  get passwordConfirm() {
    return this.register.get(['passwordGroup', 'passwordConfirm']);
  }
}
