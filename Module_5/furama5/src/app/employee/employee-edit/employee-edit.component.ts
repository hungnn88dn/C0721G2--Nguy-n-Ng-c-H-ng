import {Component, OnInit} from '@angular/core';
import {Observable} from 'rxjs';
import {Employee} from '../../model/employee';
import {ActivatedRoute, Router} from '@angular/router';
import {EmployeeService} from '../../service/employee.service';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-employee-edit',
  templateUrl: './employee-edit.component.html',
  styleUrls: ['./employee-edit.component.css']
})
export class EmployeeEditComponent implements OnInit {
  editEmployee: Observable<any>;
  employee: Employee;
  employeeForm: FormGroup;
  positionList = [{id: 1, name: 'Le Tan'}, {id: 2, name: 'Phu Vu'}, {id: 3, name: 'Chuyen Vien'},
    {id: 4, name: 'Giam Sat'}, {id: 5, name: 'Quan Ly'}, {id: 6, name: 'Giam Docn'}];
  levelList = [{id: 1, name: 'Trung Cap'}, {id: 2, name: 'Cao Dang'}, {id: 3, name: 'Dai Hoc'},
    {id: 4, name: 'Sau Dai Hoc'}];
  divisionList = [{id: 1, name: 'Sale-Marketing'}, {id: 2, name: 'Hanh Chinh'}, {id: 3, name: 'Phuc Vu'},
    {id: 4, name: 'Quan Ly'}];

  constructor(private _formBuider: FormBuilder, private activatedRoute: ActivatedRoute, private employeeSerivce: EmployeeService,
              private router: Router) {
  }

  ngOnInit(): void {
    let indexxEdit = this.activatedRoute.snapshot.params['id'];
    this.editEmployee = this.employeeSerivce.findEmployeeById(indexxEdit);
    this.editEmployee.subscribe(data => {
      this.employee = data;
    });
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
    let indexxEdit = this.activatedRoute.snapshot.params['id'];
    this.employee = employeeForm.value;
    this.employeeSerivce.updateEmployee(indexxEdit, this.employee).subscribe(data => {
      console.log(indexxEdit);
      this.router.navigateByUrl('employee/list');
      alert('Sua Thanh Cong');
    });
  }
}
