import {AbstractControl} from '@angular/forms';

export function passwordNotMatch(control: AbstractControl) {
  const formControl = control.value;
  return formControl.password === formControl.passwordConfirm ? null : {passnotmatch: true};
}
