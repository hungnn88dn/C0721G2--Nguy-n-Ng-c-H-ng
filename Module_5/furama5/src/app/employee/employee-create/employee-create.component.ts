import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import {EmployeeService} from '../../service/employee.service';
import {Employee} from '../../model/employee';
import {Router} from '@angular/router';

@Component({
  selector: 'app-employee-create',
  templateUrl: './employee-create.component.html',
  styleUrls: ['./employee-create.component.css']
})
export class EmployeeCreateComponent implements OnInit {
  employeeForm: FormGroup;
  positionList = [{id: 1, name: 'Le Tan'}, {id: 2, name: 'Phu Vu'}, {id: 3, name: 'Chuyen Vien'},
    {id: 4, name: 'Giam Sat'}, {id: 5, name: 'Quan Ly'}, {id: 6, name: 'Giam Docn'}];
  levelList = [{id: 1, name: 'Trung Cap'}, {id: 2, name: 'Cao Dang'}, {id: 3, name: 'Dai Hoc'},
    {id: 4, name: 'Sau Dai Hoc'}];
  divisionList = [{id: 1, name: 'Sale-Marketing'}, {id: 2, name: 'Hanh Chinh'}, {id: 3, name: 'Phuc Vu'},
    {id: 4, name: 'Quan Ly'}];

  constructor(private _formBuider: FormBuilder, private employeeService: EmployeeService, private router: Router) {
  }

  ngOnInit(): void {
    this.employeeForm = this._formBuider.group({
      name: ['', [Validators.required]],
      age: ['', [Validators.required]],
      cmnd: ['', [Validators.required]],
      salary: ['', [Validators.required, Validators.min(0)]],
      phone: ['', [Validators.required]],
      email: ['', [Validators.required, Validators.email]],
      address: ['', [Validators.required]],
      position: ['', [Validators.required]],
      level: ['', [Validators.required]],
      division: ['', [Validators.required]],
      username: ['', [Validators.required]]
    });
  }

  onSubmit(employeeForm: FormGroup) {
    console.log(employeeForm.value);
    this.employeeService.save(employeeForm.value).subscribe(data => {
      console.log(data);
      this.router.navigateByUrl('employee/list');
      alert('Them Moi Thanh Cong');
    });
  }
}
